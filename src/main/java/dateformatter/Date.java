package dateformatter;

public class Date {
    //date variables
    private int day;
    private int month;
    private int year;

    //invalid flag
    private boolean isValid;

    public Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
        setIsValid(true);
    }

    /**
     * Constructor that decodes a dateString with given formatCode
     * @param dateString date to be decoded
     * @param formatCode information about the date format
     */
    public Date(String dateString, String formatCode){
        setIsValid(true);
        String[] dateComponents = dateString.split("[\\/\\-.]");

        if(dateComponents.length != 3){
            setIsValid(false);
            return;
        }

        for(int i = 0; i < formatCode.length(); i++){
            char c = formatCode.charAt(i);

            switch (c){
                case 'A':
                    setMonth(Integer.parseInt(dateComponents[0]));
                    setDay(Integer.parseInt(dateComponents[1]));
                    setYear(Integer.parseInt(dateComponents[2]));
                    break;

                case 'B':
                    setYear(Integer.parseInt(dateComponents[0]));
                    setMonth(Integer.parseInt(dateComponents[1]));
                    setDay(Integer.parseInt(dateComponents[2]));
                    break;

                case 'C':
                    setDay(Integer.parseInt(dateComponents[0]));
                    setMonth(Integer.parseInt(dateComponents[1]));
                    setYear(Integer.parseInt(dateComponents[2]));
                    break;

                case '-':
                case '/':
                case '.':
                    int count = dateString.length() - dateString.replace(".", "").length();
                    if(count != 2){
                        //seperator isn't found twice
                        setIsValid(false);
                    }
                    break;
            }
        }
    }


    //getter/setter
    public int getDay(){ return day; }
    public void setDay(int day){ this.day = day; }

    public int getMonth(){ return month; }
    public void setMonth(int month){ this.month = month; }

    public int getYear(){ return year; }
    public void setYear(int year){ this.year = year; }

    public boolean isValid(){ return isValid; }
    public void setIsValid(boolean isValid){ this.isValid = isValid; }


    /**
     * Formats the date according to a given formatCode
     * @param formatCode information about how the date should be formatted
     * @return date as string eg. 01-01-1900
     */
    public String toString(String formatCode) {
        if(isValid() == false){
            //no due to wrong input of specification
            return "INVALID";
        }


        String dateString = "";
        char order = 'X', seperator = 'X';                          //default values for compiler

        String day = String.format("%02d", this.day);       //default format with leading zero
        String month = String.format("%02d", this.month);   //default format with leading zero
        String year = this.year + "";
        
        //decoding formatCode
        for(int i = 0; i < formatCode.length(); i++){
            char c = formatCode.charAt(i);
            switch (c){
                case 'A':
                case 'B':
                case 'C':
                    order = c;
                    break;

                case '-':
                case '/':
                case '.':
                    seperator = c;
                    break;

                case '2':
                    //format with 2 digits, cut off front
                    year = String.format("%2d", this.year);
                    break;

                case '4':
                    //format with 4 digits, add 20 infront, get cut of anyway if format already is 4 digits
                    year = String.format("%4d", Integer.parseInt("20" + this.year));
                    break;

                case 'b':
                    //format as string with length 2: 3 => " 3"
                    day = String.format("%2d", this.day);
                    month = String.format("%2d", this.month);
                    break;
            }
        }

        switch (order){
                case 'A':
                    //MDY
                    dateString = month + seperator + day + seperator + year;
                    break;

                case 'B':
                    //YMD
                    dateString = year + seperator + month + seperator + day;
                    break;

                case 'C':
                    //DMY
                    dateString = day + seperator + month + seperator + year;
                    break;
        }

        return dateString;
    }
}
