package dateformatter;

import java.util.ArrayList;
import java.util.List;

import dateformatter.DateOptions.LeadingCharacter;
import dateformatter.DateOptions.Order;
import dateformatter.DateOptions.Seperator;
import dateformatter.DateOptions.YearDigits;

public class DateOptionSelector {
    /**
     * Takes a date object and formats it into a date string according to its set  
     * formating options
     * @param date date to be formated
     * @return formated date string
     */
    public static String getFormatedDate(Date date){
        formatLeadingCharacter(date);
        formatYearDigits(date);
        List<String> orderedDate = getOrdered(date);
        
        return buildDateWithSeperator(date, orderedDate);
    }

    /**
     * Parses a formating option string and sets the options in 
     * a date object accourdingly
     * @param date date object to set options for
     * @param options string with encoded options
     * @return date with set options
     */
    public static Date setFormatOptions(Date date, String options){
        for(int i = 0; i < options.length(); i++){
            decodeCharacter(date, options.charAt(i));
        }

        return date;
    }

    /**
     * Parses a raw date string according to the previously set options
     * @param date date to be set, source of options
     * @param rawDate string containing date in a given format
     * @return date object with parsed components
     * @throws Exception If given raw date is invalid
     */
    public static Date parseRawDate(Date date, String rawDate) throws Exception{
        String[] components;

        //split according to set seperator
        switch(date.getSeperator()){
            case Dash:
                components = rawDate.split("-");
                break;
            case Point:
                components = rawDate.split(".");
                break;
            case Slash:
                components = rawDate.split("/");
                break;
            default:
                components = new String[0];
                break;
        }

        if(components.length != 3){
            throw new Exception("Given raw date string is invalid! Not enough components found!");
        }

        //component order is given through order option
        switch(date.getOrder()){
            case DayMonthYear:
                date.setDay(components[0]);
                date.setMonth(components[1]);
                date.setYear(components[2]);
                break;
            case MonthDayYear:
                date.setMonth(components[0]);
                date.setDay(components[1]);
                date.setYear(components[2]);
                break;
            case YearMonthDay:
                date.setYear(components[0]);
                date.setMonth(components[1]);
                date.setDay(components[2]);
                break;
            default:
                break;
            
        }

        return date;
    }
    
    
    //---------------------------------------------------------------------------------------------------------------
    //Helper functions

    /**
     * Helper function for decoding individual characters from options string
     * @param date date object to set options for
     * @param c character to be decoded
     */
    private static void decodeCharacter(Date date, char c){
        switch (c){
            case 'A':
                date.setDateOption(Order.MonthDayYear);
                break;
            case 'B':
                date.setDateOption(Order.YearMonthDay);
                break;
            case 'C':
                date.setDateOption(Order.DayMonthYear);
                break;
            case '/':
                date.setDateOption(Seperator.Slash);
                break;
            case '-':
                date.setDateOption(Seperator.Dash);
                break;
            case '.':
                date.setDateOption(Seperator.Point);
                break;
            case '4':
                date.setDateOption(YearDigits.Four);
                break;
            case '2':
                date.setDateOption(YearDigits.Two);
                break;
            case 'b':
                date.setDateOption(LeadingCharacter.Blank);
                break;
        }
    }

    /**
     * Helper function for formating date components
     * @param date date to be formated
     * @return formated date
     */
    private static Date formatLeadingCharacter(Date date){
        switch (date.getLeadingCharacter()){
            case Zero:
                //format with 2 digits, leading zero if nessesary
                date.setDay(String.format("%02d", Integer.parseInt(date.getDay())));
                date.setMonth((String.format("%02d", Integer.parseInt(date.getMonth()))));
                break;
            case Blank:
                //format with 2 digits, leading blank
                date.setDay(String.format("%2d", Integer.parseInt(date.getDay())));
                date.setMonth((String.format("%2d", Integer.parseInt(date.getMonth()))));
                break;
            default:
                break;
        }

        return date;
    }

    /**
     * Helper function for formating year component
     * @param date dat to be formated
     * @return formated date
     */
    private static Date formatYearDigits(Date date){
        switch (date.getYearDigits()){
            case Four:
                //format with 4 digits, add 20 infront, get cut of anyway if format already is 4 digits
                date.setYear(String.format("%4d", Integer.parseInt("20" + date.getYear())));
                break;
            case Two:
                //format with 2 digits, cut off front
                date.setYear(String.format("%2d", Integer.parseInt(date.getYear())));
                break;
            default:
                break;
        }

        return date;
    }

    /**
     * Helper function for preparing the order of date elements
     * @param date to be ordered
     * @return List of date elements in order
     */
    private static List<String> getOrdered(Date date){
        List<String> orderedDate = new ArrayList<String>();

        switch (date.getOrder()){
            case DayMonthYear:
                orderedDate.add(date.getDay());
                orderedDate.add(date.getMonth());
                orderedDate.add(date.getYear());
                break;
            case MonthDayYear:
                orderedDate.add(date.getMonth());
                orderedDate.add(date.getDay());
                orderedDate.add(date.getYear());
                break;
            case YearMonthDay:
                orderedDate.add(date.getYear());
                orderedDate.add(date.getMonth());
                orderedDate.add(date.getDay());
                break;
            default:
                break;
        }

        return orderedDate;
    }

    /**
     * Helper function for building the date string
     * @param date date to be formated
     * @param orderedDate ordered date elements
     * @return formated date string
     */
    public static String buildDateWithSeperator(Date date, List<String> orderedDate){
        String d = "";

        for(int i = 0; i < orderedDate.size(); i++){
            d += orderedDate.get(i);

            if(i != orderedDate.size() - 1){
                //don't add seperator at the end

                switch (date.getSeperator()){
                    case Dash:
                        d += "-";
                        break;
                    case Point:
                        d += ".";
                        break;
                    case Slash:
                        d += "/";
                        break;
                    default:
                        break;
                }
            }
        }

        return d;
    }
}
