package CustomerDateFormat;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        if (year < 1 || month < 1 || month > 12 || day < 1)
            return false;

        int[] daysInMonth = { 31, isLeapYear() ? 29 : 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        return day <= daysInMonth[month - 1];
    }

    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void increment() {
        int[] daysInMonth = { 31, isLeapYear() ? 29 : 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        day++;
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public String format() {
        String d = (day < 10) ? "0" + day : String.valueOf(day);
        String m = (month < 10) ? "0" + month : String.valueOf(month);
        return d + "-" + m + "-" + year;
    }

    public void print() {
        System.out.println("Date: " + format());
    }
}

