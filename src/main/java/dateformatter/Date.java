package dateformatter;

public class Date {
    //date variables
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Constructor that decodes a dateString with given formatCode
     * @param dateString date to be decoded
     * @param formatCode information about the date format
     * @throws Exception if the given date cannot be decoded with the given format code
     */
    public Date(String dateString, String formatCode) throws Exception{
        String[] dateComponents = dateString.split("[\\/\\-.]");

        if(dateComponents.length != 3){
            throw new Exception("Given date string is invalid! Not enough components found!"); 
        }

        for(int i = 0; i < formatCode.length(); i++){
            switch (formatCode.charAt(i)){
                case 'A':
                    setMonth(Integer.parseInt(dateComponents[0]));
                    setDay(Integer.parseInt(dateComponents[1]));
                    setYear(Integer.parseInt(dateComponents[2]));
                    return;

                case 'B':
                    setYear(Integer.parseInt(dateComponents[0]));
                    setMonth(Integer.parseInt(dateComponents[1]));
                    setDay(Integer.parseInt(dateComponents[2]));
                    return;

                case 'C':
                    setDay(Integer.parseInt(dateComponents[0]));
                    setMonth(Integer.parseInt(dateComponents[1]));
                    setYear(Integer.parseInt(dateComponents[2]));
                    return;
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


    /**
     * Formats the date according to a given formatCode
     * @param formatCode information about how the date should be formatted
     * @return date as string eg. 01-01-1900
     */
    public String toString(String formatCode) {
        String dateString = "";
        char order = 'X', seperator = 'X';                          //default values for compiler

        String day = String.format("%02d", this.day);       //default format with leading zero
        String month = String.format("%02d", this.month);   //default format with leading zero
        String year = this.year + "";
        
        //decoding formatCode
        for(int i = 0; i < formatCode.length(); i++){
            switch (formatCode.charAt(i)){
                case 'A':
                case 'B':
                case 'C':
                    order = formatCode.charAt(i);
                    break;

                case '-':
                case '/':
                case '.':
                    seperator = formatCode.charAt(i);
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
