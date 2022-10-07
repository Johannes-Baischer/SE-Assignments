package dateformatter;

public class DateOptions {
    public enum Order{
        DayMonthYear,
        MonthDayYear,
        YearMonthDay
    }

    public enum Seperator{
        Point,
        Slash,
        Dash
    }

    public enum YearDigits{
        Four,
        Two
    }

    public enum LeadingCharacter{
        Zero,
        Blank
    }
}
