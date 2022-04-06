package aron.Week04;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class TryCalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scan for user input
        System.out.print("Please enter a month between 1 and 12 (e.g. 5): "); // Prompt user to enter month
        int m = input.nextInt();

        System.out.print("Please enter a full year (e.g. 2018): "); // Prompt user to enter year
        int y = input.nextInt();
        printMonth(y, m);
    }

    static void printMonth(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int counter = 1;

        // Get day of week of 1st date of the month and print space for as many days as
        // distant from SUN
        int dayValue = LocalDate.of(year, month, 1).getDayOfWeek().getValue();
        for (int i = 0; i < dayValue; i++, counter++) {
            System.out.printf("%-4s", "");
        }

        for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, counter++) {
            System.out.printf("%-4d", i);

            // Break the line if the value of the counter is multiple of 7
            if (counter % 7 == 0) {
                System.out.println();
            }
            Calendar currentDay = Calendar.getInstance(TimeZone.getDefault());
            Date date = currentDay.getTime();
            int day = currentDay.get(Calendar.DATE);
            System.out.println(day);
        }
    }
}

