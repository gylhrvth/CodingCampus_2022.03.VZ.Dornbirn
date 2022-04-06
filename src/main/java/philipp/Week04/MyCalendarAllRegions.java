package philipp.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MyCalendarAllRegions {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println();
        System.out.print("Today is: ");
        System.out.println((now.getTime()));
        System.out.println();

        int monthOfCal =4;
        //Locale wird auf Thailand gesetzt, hier wird der Buddistische Kalender verwendet
        Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());
        myCalendar2(monthOfCal);

        //Locale wird auf Deutschland gesetzt, hier wird der Gregorianische Kalender verwendet
        Locale.setDefault(Locale.GERMANY);
        myCalendar2(monthOfCal);
    }

    private static void myCalendar2(int month) {
        month = month - 1;
        Calendar today = Calendar.getInstance();
        today.set(today.get(Calendar.YEAR),today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH),0,0,0);
        today.set(Calendar.MILLISECOND, 0);

        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR),month, 1,0,0,0);
        cal.set(Calendar.MILLISECOND, 0);

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

        int maxDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int day = 1; day <= maxDayOfMonth; day++) {
            cal.set(Calendar.DAY_OF_MONTH, day);
            printCal(firstDayOfWeek, cal, today);
        }

        printEmptySpotsAfter(cal, firstDayOfWeek);

        System.out.println();
        System.out.println();
    }

    private static void printCal(int firstDayOfWeek, Calendar cal, Calendar today) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        int lastDayOfWeek = Calendar.SATURDAY;
        if (Calendar.MONDAY == firstDayOfWeek) {
            lastDayOfWeek = Calendar.SUNDAY;
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
        int fdow = firstDayOfWeek;
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (Calendar.MONDAY == firstDayOfWeek) {
            if (dayOfWeek == Calendar.SUNDAY) {
                dayOfWeek += 7;
            }
        }
        while (fdow < dayOfWeek) {
            System.out.print("|    ");
            fdow++;
        }
    }

    private static void printEmptySpotsAfter(Calendar cal, int firstDayOfWeek) {
        int lastDayOfMonth = cal.get(Calendar.DAY_OF_WEEK) + (cal.getActualMaximum(Calendar.DAY_OF_WEEK) % 7);
        if (Calendar.MONDAY == firstDayOfWeek) {
            if (lastDayOfMonth != Calendar.SUNDAY) {
                System.out.print("|");
            }
            while (lastDayOfMonth <= 7 && lastDayOfMonth != Calendar.SUNDAY) {
                System.out.print("    |");
                lastDayOfMonth++;
            }
        } else {
            if (lastDayOfMonth != Calendar.SATURDAY) {
                System.out.print("|");
            }
            while (lastDayOfMonth < 7) {
                System.out.print("    |");
                lastDayOfMonth++;
            }
        }
    }
}


