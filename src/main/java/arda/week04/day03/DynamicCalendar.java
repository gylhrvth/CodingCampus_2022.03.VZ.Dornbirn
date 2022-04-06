package arda.week04.day03;

import java.awt.*;
import java.util.Calendar;
import java.util.Locale;

public class DynamicCalendar {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        String ANSI_BLACK = "\u001B[30m";
        Calendar gc = Calendar.getInstance();
        header(gc, ANSI_RED_BACKGROUND, ANSI_RESET, ANSI_BLACK);
        calendarBody(gc, ANSI_RED, ANSI_RESET);
    }

    public static void header(Calendar gc, String red, String reset, String black) {
        if (gc.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println(red + black + "| So |" + reset + " Mo | Di | Mi | Do | Fr " + red + black + "| Sa |" + reset);
        } else {
            System.out.println("| Mo | Di | Mi | Do | Fr " + red + black + "| Sa | So |" + reset);
        }
    }

    public static void calendarBody(Calendar gc, String ANSI_RED, String ANSI_RESET) {

        int maxDaysMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int endOfWeek = 0;
        int spaces = 0;

        gc.set(Calendar.MONTH, 3);

        int today = gc.get(Calendar.DATE);

        gc.set(Calendar.DAY_OF_MONTH, 1);

        if (gc.getFirstDayOfWeek() == Calendar.SUNDAY) {
            endOfWeek = Calendar.SATURDAY;
            spaces = gc.get(Calendar.DAY_OF_WEEK) - 1;
        } else {
            endOfWeek = Calendar.SUNDAY;
            spaces = gc.get(Calendar.DAY_OF_WEEK) - 2;
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                spaces = 6;
            }
        }
        for (int i = 0; i < spaces; i++) {
            System.out.print("|    ");
        }

        for (int i = 0; i < maxDaysMonth; i++) {
            gc.set(Calendar.DAY_OF_MONTH, 1 + i);
            int todaysDay = gc.get(Calendar.DATE);

            if (todaysDay == today) {
                System.out.printf("| %s%2d%s ", ANSI_RED, todaysDay, ANSI_RESET);
            } else {
                System.out.printf("| %2d ", todaysDay);
            }
            if (gc.get(Calendar.DAY_OF_WEEK) == endOfWeek) {
                System.out.print("|");
                System.out.print("\n");
            }
        }

        if (gc.getFirstDayOfWeek() == Calendar.SUNDAY) {
            for (int i = 0; i < 7 - gc.get(Calendar.DAY_OF_WEEK); i++) {
                System.out.print("|    ");
            }
            if (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
                System.out.println("|");
            }
        } else {
            for (int i = 6; i < gc.get(Calendar.DAY_OF_WEEK); i++) {
                System.out.print("|    ");
            }
            if (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                System.out.print("|  ");
            }
        }
    }
}
