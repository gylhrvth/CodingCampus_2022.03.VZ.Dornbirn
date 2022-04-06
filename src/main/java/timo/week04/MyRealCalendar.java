package timo.week04;

import lukas.week4.day3.Color;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyRealCalendar {
    public static void main(String[] args) {

        myCoolCalendar(2022, 4);
    }

    public static void myCoolCalendar(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year, month - 1, 1);
        System.out.println(COLORS[3] + year + RESET + " " + COLORS[5] + new SimpleDateFormat("MMMM").format(gc.getTime()) + RESET);
        System.out.println(Color.BACKGROUND_COLORS[0] + "| Mo |" + " Tu |" + " We |" + " Th |" + " Fr " + COLORS[0] + "| Sa |" + " Su |" + RESET);

        int currentDayNumber = gc.get(Calendar.DAY_OF_WEEK);
        int maxDayOfMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        LocalDate date = LocalDate.now();
        int currentDate = date.getDayOfMonth();
        //int currentDate = 22;
        int spaces = currentDayNumber - 2;
        if (spaces == -1) {
            spaces = 6;
        }
        for (int i = 0; i < spaces; i++) {
            System.out.print("|    ");
        }
        for (int days = 1; days <= maxDayOfMonth; days++) {
            int dateOfMonth = gc.get(Calendar.DAY_OF_MONTH);
            System.out.print("| ");
            if (days < 10) {
                System.out.print(" ");
            }
            if (dateOfMonth == currentDate) {
                System.out.print(COLORS[2] + dateOfMonth + RESET + " ");
            } else {
                System.out.print(dateOfMonth + " ");
            }
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.print("|");
                System.out.println();
            }
            if (days == maxDayOfMonth) {
                int lastDayOfWeek = gc.get(Calendar.DAY_OF_WEEK);

                if (lastDayOfWeek != Calendar.SUNDAY) {
                    for (int i = 0; i <= 8 - lastDayOfWeek; i++) {
                        System.out.print("|    ");
                    }
                }
            }
            gc.add(Calendar.DAY_OF_WEEK, 1);
        }
    }
    public static final String RESET = "\u001B[0m";
    public static final String[] COLORS = new String[]{
            "\u001B[31m",
            "\u001B[32m",
            "\u001B[33m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[36m",
            "\u001B[37m"
    };


}
