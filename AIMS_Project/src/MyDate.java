import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.StringTokenizer;

public class MyDate {
    private int day;
    private int month;
    private int year;

    /* Getter and setter method for MyDate class */
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day <= 0 || day > 12) {
            System.out.println("Can not set day value");
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("Can not set month value");
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Can not set year value");
        } else {
            this.year = year;
        }
    }

    /* Constructor for MyDate class */
    public MyDate() {
        super();
        LocalDate currentdate = LocalDate.now();
        int currentDay = currentdate.getDayOfMonth();
        this.day = currentDay;
        Month currentMonth = currentdate.getMonth();
        this.month = currentMonth.getValue();
        int currentYear = currentdate.getYear();
        this.year = currentYear;
    }

    public MyDate(int day, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String parameter) {
        StringTokenizer st = new StringTokenizer(parameter);

        String month = st.nextToken();
        DateTimeFormatter parser;
        if (month.length() == 3) {
            parser = DateTimeFormatter.ofPattern("MMM").withLocale(Locale.ENGLISH);
        } else {
            parser = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH);
        }
        TemporalAccessor accessor = parser.parse(month);
        this.month = accessor.get(ChronoField.MONTH_OF_YEAR);

        String day = st.nextToken();
        day = day.replaceAll("([a-z])", "");
        this.day = Integer.parseInt(day);

        String year = st.nextToken();
        this.year = Integer.parseInt(year);
    }

    public MyDate accept(String param) {
        return new MyDate(param);
    }

    public void print() {
        System.out.println("The current date is: " + this.day + "/ " + this.month + "/ " + this.year);
    }

    public static void main(String[] argv) {
        MyDate date = new MyDate();
        date = date.accept("February 18th 2019");
        date.print();
    }
}