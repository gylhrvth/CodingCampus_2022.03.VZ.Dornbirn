package arda.week04.day02;

import java.util.Calendar;
import java.util.GregorianCalendar;

import arda.week04.day01.HowManySundays;

public class HowManyWorkDays {
    public static void main(String[] args) {
        int year = 2022;
        int month = 4;
        System.out.println(workDays(year, month) + " workdays");

    }

    //add saturdays and sundays then subtract with days of month to get work days
    public static int workDays(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year,month,1);
         int weekend = HowManySundays.theSundays(year, month) + HowManySundays.theSaturdays(year, month);
        return gc.getActualMaximum(Calendar.DAY_OF_MONTH) - weekend;
    }
}