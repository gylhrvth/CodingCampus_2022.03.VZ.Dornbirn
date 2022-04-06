package arda.week04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class DateAndCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());

        GregorianCalendar initCalendar = new GregorianCalendar(2022, 3, 4);
        daysUntilSunday(initCalendar);
    }
    public static void daysUntilSunday(GregorianCalendar gc) {

        int today = gc.get(Calendar.DAY_OF_WEEK);

        int daysBetween = (8 - today) % 7;

        System.out.println(daysBetween + " days until sunday");
    }
}