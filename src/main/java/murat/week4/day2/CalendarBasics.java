package murat.week4.day2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarBasics {

    public static void main(String[] args) {

        Calendar kalender = Calendar.getInstance();
        System.out.println("Calender.get Instance: " + kalender);

        System.out.println("----------------------------------------------------------------");
        GregorianCalendar gregKal = new GregorianCalendar(2022, 3,5);
        System.out.println("Today: " + gregKal.getTime());
        System.out.println("Calendar.DAY_OF_MONTH: " + gregKal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calender.DAY_OF_WEEK: " + gregKal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Calendar.MONTH: " + gregKal.get(Calendar.MONTH));
        System.out.println("Calendar.HOUR_OF_THE_DAY: " + gregKal.get(Calendar.HOUR_OF_DAY));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd, 'EEE', hh:mm:ss");
    }
}
