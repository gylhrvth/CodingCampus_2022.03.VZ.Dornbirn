package murat.week4.day2;

import java.lang.management.MonitorInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Displays the given date's month
public class CalendarDisplay {
    public static void main(String[] args) {

        int userYear = 2009;
        int userMonth = 1;
        int userDay = 5;

        displayCalendar(userYear, userMonth, userDay);

    }

    public static void displayCalendar(int year, int month, int day) {

        GregorianCalendar karenda = new GregorianCalendar(year, month, day);

        if (month != karenda.get(Calendar.MONTH)) {
            System.out.println("Date is not valid!!!");
            return;
        }

        System.out.println("TODAY is: " + karenda.getTime());
        System.out.println();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd");

        int howManyDaysInAMonth = karenda.getActualMaximum(Calendar.DAY_OF_MONTH);

        int inc = 1;            // Day increment
        String s = "|    ";     // Template for the blanks
        int blank = 0;          // Number of blanks in calendar
        int lastRow = 5;        // Start for usual 5 rows (if necessary, increase it)

        int today = karenda.get(Calendar.DAY_OF_MONTH);

        // Set the first day as 1
        karenda.set(Calendar.DAY_OF_MONTH, 1);

        // The top row template
        System.out.print("| Mo | Di | Mi | Do | Fr | Sa | So |");
        System.out.println();

        // Start the calendar loop
        for (int i = 0; i < lastRow; i++) {

            // Blanks in the first row
            if (i == 0) {
                // Tuesday is the 3. day but 1 blank
                blank = karenda.get(Calendar.DAY_OF_WEEK) - 2;
                if (blank == -1) {         // If Sunday
                    blank = 6;

                    // If the month starts with sunday and the month is february, there is an exception.
                    // We have not many days and don't need an extra row
                    if (karenda.get(Calendar.MONTH) != Calendar.FEBRUARY) {
                        lastRow = 6;   // If sunday, there need to one extra row.
                    }
                }

                // Print blanks
                for (int j = 0; j < blank; j++) {
                    System.out.print(s);
                }
            }

            // Fill the rows (left to right)
            for (int j = 0; j < 7 - blank; j++) {

                // Exception: If the month is too big, create a new row. Ex: 2022 January
                if (inc < howManyDaysInAMonth && i == 4 && j == 6) {
                    lastRow = 6;
                }

                // If the month ends, stop the days and enter blanks
                if (inc > howManyDaysInAMonth) {

                    for (int k = 0; k <= (7 - blank) - j; k++) {
                        System.out.print(s);
                    }
                    break;     // Stop adding days
                }

                // Mark today
                if (karenda.get(Calendar.DAY_OF_MONTH) == today) {
                    System.out.print("| " + sdf1.format(karenda.getTime()));
                    System.out.print("*");
                } else {
                    System.out.print("| " + sdf1.format(karenda.getTime()) + " ");
                }

                inc++;       // Increase the days
                karenda.add(Calendar.DAY_OF_MONTH, 1);

                // Exception: If the last day sunday is, add another line to the end of the line.
                // EX: 2004 February and 2021 January
                if (inc == howManyDaysInAMonth + 1 && i == 4 && j == 6) {
                    System.out.println("|");
                }
            }

            // If the month ends, don't print the last line
            if (inc <= howManyDaysInAMonth) {
                System.out.println("|");
            }

            // If we push the first row to the right, we have to trim the last part of the row
            if (blank != 0) {
                blank = 0;
            }
        }
        System.out.println();
    }
}
