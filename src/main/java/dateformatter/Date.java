package dateformatter;
import dateformatter.DateOptions.*;

public class Date {
    //Formating options
    private Order order;
    private Seperator seperator;
    private YearDigits yearDigits;
    private LeadingCharacter leadingCharacter;


    //date variables
    private String day;
    private String month;
    private String year;

    public Date(String rawDate, String rawDateOptions){
        //Default options
        order = Order.DayMonthYear;
        seperator = Seperator.Point;
        yearDigits = YearDigits.Four;
        leadingCharacter = LeadingCharacter.Zero;

        DateOptionSelector.setFormatOptions(this, rawDateOptions);

        try {
            DateOptionSelector.parseRawDate(this, rawDate);
        } catch (Exception e) {
            //Exception if raw date string is invalid for given settings
            e.printStackTrace();
        }
    }


    //getter/setter
    public Order getOrder(){ return order; }
    public void setDateOption(Order order){ this.order = order; }

    public Seperator getSeperator(){ return seperator; }
    public void setDateOption(Seperator seperator){ this.seperator = seperator; }

    public YearDigits getYearDigits(){ return yearDigits; }
    public void setDateOption(YearDigits yearDigits){ this.yearDigits = yearDigits; }

    public LeadingCharacter getLeadingCharacter(){ return leadingCharacter; }
    public void setDateOption(LeadingCharacter leadingCharacter){ this.leadingCharacter = leadingCharacter; }

    public String getDay(){ return day; }
    public void setDay(String day){ this.day = day; }

    public String getMonth(){ return month; }
    public void setMonth(String month){ this.month = month; }

    public String getYear(){ return year; }
    public void setYear(String year){ this.year = year; }


    @Override
    public String toString() {
        return DateOptionSelector.getFormatedDate(this);
    }
}
