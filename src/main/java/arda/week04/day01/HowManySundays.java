package arda.week04.day01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HowManySundays {
    public static void main(String[] args) {
        int year = 2022;
        int month = 4 ;
        System.out.println(theSundays(year,month) + " sundays");
        System.out.println(theSaturdays(year,month) + " saturdays");
    }

    public static int theSundays(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year,month,1);
        int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int counter = 0;
        for (int i = 0; i <= daysInMonth; i++) {
            gc.set(year, month, 1 + i);
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                counter++;
            }
        }
        return counter;
    }
    public static int theSaturdays(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year,month,1);
        int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int counter = 0;
        for (int i = 0; i <= daysInMonth; i++) {
            gc.set(year, month, 1 + i);
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                counter++;
            }
        }
        return counter;
    }
}
