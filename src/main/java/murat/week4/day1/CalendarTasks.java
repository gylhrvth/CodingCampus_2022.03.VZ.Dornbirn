package murat.week4.day1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTasks {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar(2022, 1, 5);

        int userYear = 2021;
        int userMonth = 2;

        task1NextSunday(gc);
        // task2HowManySundays(userYear, userMonth);
        // task3WorkdaysInAMonth(userYear, userMonth);
    }

    public static void task1NextSunday(GregorianCalendar gc) {

        gc.add(Calendar.DAY_OF_MONTH, (8 - gc.get(Calendar.DAY_OF_WEEK) % 7));
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyy, E, h:mm:s");
        System.out.println(sdf.format(gc.getTime()));
    }

    // @param month 1 = January to 12 = December
    public static int task2HowManySundays(int year, int month) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy, E, h:mm:s");
        int howManySundays = 0;

        GregorianCalendar cale = new GregorianCalendar(year, month - 1, 1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM");
        System.out.println("Month: " + sdf2.format(cale.getTime()) + " of " + year);
        int howManyDaysInAMonth = cale.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int dayCounter = 1; dayCounter <= howManyDaysInAMonth; dayCounter++) {
            cale.set(year, month - 1, dayCounter);

            if (cale.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                howManySundays++;
            }
        }
        System.out.println(howManySundays + " Sundays");

        return howManySundays;
    }

    // @param month 1 = January to 12 = December
    public static int task3WorkdaysInAMonth(int year, int month) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy, E, h:mm:s");
        int workDays = 0;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);

        int howManyDaysInAMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int dayCount = 0; dayCount <= howManyDaysInAMonth; dayCount++) {
            calendar.set(year, month - 1, dayCount);

            if ((calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
                    && (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY)) {
                // System.out.println(sdf.format(calendar.getTime()));    // Print the whole month
                workDays++;
            }
        }

        System.out.println("Month: " + sdf.format(calendar.getTime()) + " of " + year);
        System.out.println("Workdays: " + workDays);
        return workDays;
    }
}
