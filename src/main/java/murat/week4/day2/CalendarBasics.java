package murat.week4.day2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarBasics {

    public static void main(String[] args) {

        Calendar kalender = Calendar.getInstance();
        System.out.println("Calender.get Instance: " + kalender);

        System.out.println("----------------------------------------------------------------");
        GregorianCalendar gregKal = new GregorianCalendar(2022, 3, 21);
        System.out.println("Today: " + gregKal.getTime());
        System.out.println("Calendar.DAY_OF_MONTH: " + gregKal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Calender.DAY_OF_WEEK: " + gregKal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Calendar.MONTH: " + gregKal.get(Calendar.MONTH));
        System.out.println("Calendar.HOUR_OF_THE_DAY: " + gregKal.get(Calendar.HOUR_OF_DAY));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd, 'EEE', hh:mm:ss");
        System.out.println("-----------------------------------");
        System.out.println("Print current gregKal:                                               " + gregKal.getTime());
        System.out.println("-----------------------------------");
        gregKal.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Add 1 day to the date with add():                                    " + gregKal.getTime());
        System.out.println("-----------------------------------");
        gregKal.set(2022,8,14);
        System.out.println("Set a new date for with set() 2022 Septemper 14            :         " + gregKal.getTime());

        System.out.println("----------------------------------------------------------------");

        System.out.println("Get current time with Gettime():                                     " + Calendar.getInstance().getTime());
        System.out.println("Get current time with new Date():                                    " + new Date());
        System.out.println("----------------------------------------------------------------");
        Date currentDate = Calendar.getInstance().getTime();
        System.out.println("Get current time with Gettime() and a variable:                      " + currentDate);
        System.out.println("----------------------------------------------------------------");

    }
}
