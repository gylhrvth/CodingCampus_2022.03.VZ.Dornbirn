package murat.week4.day3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDisplayOptimized {
    public static void main(String[] args) {

        int userYear = 1987;
        int userMonth = 2;
        int userDay = 8;

        displayCalendar(userYear, userMonth, userDay);
    }

    public static void displayCalendar(int year, int month, int day) {

        int inc = 1;            // Day increment
        int blank;          // Number of blanks in calendar
        GregorianCalendar kalender = new GregorianCalendar(year, month, day);

        if (month != kalender.get(Calendar.MONTH)) {
            System.out.println("Date is not valid!!!");
            return;
        }

        System.out.println();
        System.out.println("TODAY is: " + kalender.getTime());
        System.out.println();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd");
        int howManyDaysInAMonth = kalender.getActualMaximum(Calendar.DAY_OF_MONTH);
        int today = kalender.get(Calendar.DAY_OF_MONTH);

        // Set the first day as 1
        kalender.set(Calendar.DAY_OF_MONTH, 1);

        // The top row template
        System.out.print("| Mo | Di | Mi | Do | Fr | Sa | So |");
        System.out.println();

        // Calculate the number of the blank cells at the first row
        blank = kalender.get(Calendar.DAY_OF_WEEK) - 2;
        if (blank == -1) {         // If Sunday
            blank = 6;
        }

        // Print blanks
        for (int j = 0; j < blank; j++) {
            System.out.print("|    ");
        }

        while (inc <= howManyDaysInAMonth) {

            // Mark today, else enter empty lines
            if (kalender.get(Calendar.DAY_OF_MONTH) == today) {
                System.out.print("| " + sdf1.format(kalender.getTime()));
                System.out.print("*");
            }else{
                System.out.print("| " + sdf1.format(kalender.getTime()) + " ");
            }

            // After every sunday, make a new row
            if (kalender.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println("|");
            }

            // Add a day to the calendar
            kalender.add(Calendar.DAY_OF_MONTH, 1);

            // Increment the values till to the end of month
            inc++;
        }

        // Enter a line after the month finishes
        if (kalender.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            System.out.print("|");
        }

        // Enter blank cells till sunday at the end of the month
        while (kalender.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            System.out.print("    |");
            kalender.add(Calendar.DAY_OF_WEEK, 1);
        }
        System.out.println();
    }
}

