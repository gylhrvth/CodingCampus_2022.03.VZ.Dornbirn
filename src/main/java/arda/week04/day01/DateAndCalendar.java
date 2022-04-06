package arda.week04.day01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        daysUntilSunday(gc);
    }

    public static void daysUntilSunday(GregorianCalendar gc) {

        int today = gc.get(Calendar.DAY_OF_WEEK);

        int daysBetween = (8 - today) % 7;

        System.out.println(daysBetween + " days until sunday");
    }
}