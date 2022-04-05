package philipp.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MyCalendarImproved {

    public static void main(String[] args) {
        Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
        myCalendar2(4);
    }

    private static void myCalendar2(int month) {
        month = month - 1;
        Calendar today = Calendar.getInstance();
//        System.out.println(today);
        System.out.println();
        System.out.print("Today is: ");
        System.out.println((today.getTime()));
        System.out.println();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        today.set(Calendar.MILLISECOND, 0);

        SimpleDateFormat sdf = new SimpleDateFormat(" MM");
        System.out.print(cal.get(Calendar.YEAR));
        System.out.println((sdf.format(cal.getTime())));

        int firstDayOfWeek = cal.getFirstDayOfWeek();
        if (Calendar.MONDAY == firstDayOfWeek) {
            System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");
        } else {
            System.out.println("| So | Mo | Di | Mi | Do | Fr | Sa |");
        }

        printEmptySpotsBefore(firstDayOfWeek, cal);

        firstDayOfWeek = cal.getFirstDayOfWeek();
        int maxDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int day = 1; day <= maxDayOfMonth; day++) {
            cal.set(Calendar.DAY_OF_MONTH, day);
            printCal(firstDayOfWeek, cal, today);
        }

        printEmptySpotsAfter(cal, firstDayOfWeek);

        System.out.println();
//        System.out.println(cal.getTime());
//        System.out.println(today.getTime());
    }

    private static void printCal(int firstDayOfWeek, Calendar cal, Calendar today) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        int lastDayOfWeek = 7;
        if (2 == firstDayOfWeek) {
            lastDayOfWeek = 1;
        }
        if (cal.get(Calendar.DAY_OF_WEEK) == lastDayOfWeek) {
            if (cal.equals(today)) {
                System.out.println("| " + sdf.format(cal.getTime()) + "*|");
            } else {
                System.out.println("| " + sdf.format(cal.getTime()) + " |");
            }
        } else if (!cal.equals(today)) {
            System.out.print("| " + sdf.format(cal.getTime()) + " ");
        } else {
            System.out.print("| " + sdf.format(cal.getTime()) + "*");
        }
    }

    private static void printEmptySpotsBefore(int firstDayOfWeek, Calendar cal) {
        int empty = cal.get(Calendar.DAY_OF_WEEK);
        if (2 == firstDayOfWeek) {
            if (empty == 1) {
                empty += 7;
            }
        } else {
            if (empty == 0) {
                empty += 7;
            }
        }
        while (firstDayOfWeek < empty) {
            System.out.print("|    ");
            firstDayOfWeek++;
        }
    }

    private static void printEmptySpotsAfter(Calendar cal, int firstDayOfWeek) {
        int lastDayOfMonth = cal.get(Calendar.DAY_OF_WEEK) + (cal.getActualMaximum(Calendar.DAY_OF_WEEK) % 7);
        if (2 == firstDayOfWeek) {
            if (lastDayOfMonth != 1) {
                System.out.print("|");
            }
            while (lastDayOfMonth <= 7 && lastDayOfMonth != 1) {
                System.out.print("    |");
                lastDayOfMonth++;
            }
        } else {
            if (lastDayOfMonth != 7) {
                System.out.print("|");
            }
            while (lastDayOfMonth < 7) {
                System.out.print("    |");
                lastDayOfMonth++;
            }
        }
    }
}


