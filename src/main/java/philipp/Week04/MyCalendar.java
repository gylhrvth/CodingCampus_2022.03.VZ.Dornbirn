package philipp.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MyCalendar {

    public static void main(String[] args) {
        myCalendar(2022, 4);

    }

    private static void myCalendar(int year, int month) {
        month = month - 1;
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdfToday = new SimpleDateFormat("dd.MMMM.yyyy");
        System.out.println();
        System.out.print("Today is: ");
        System.out.println(sdfToday.format(today.getTime()));
        System.out.println();

        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println("| Mo | Di | Mi | Do | Fr | Sa | So |");

        int firstDayOfWeek = 2;
        int empty = cal.get(Calendar.DAY_OF_WEEK);
        if (empty == 1) {
            empty += 7;
        }
        while (firstDayOfWeek < empty) {
            System.out.print("|    ");
            firstDayOfWeek++;
        }
        for (int day = 1; day <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); day++) {
            cal = new GregorianCalendar(year, month, day);
            sdf = new SimpleDateFormat("dd");

            today = new GregorianCalendar();
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);

            today.set(Calendar.HOUR_OF_DAY, 0);
            today.set(Calendar.MINUTE, 0);
            today.set(Calendar.SECOND, 0);
            today.set(Calendar.MILLISECOND, 0);
//            SimpleDateFormat compare = new SimpleDateFormat("yyyyMMdd");

            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//                if (compare.format(today.getTime()).equals(compare.format(cal.getTime()))) {
                if (cal.equals(today)) {
                    System.out.println("| " + sdf.format(cal.getTime()) + "*|");
                } else {
                    System.out.println("| " + sdf.format(cal.getTime()) + " |");
                }
//            } else if (!compare.format(today.getTime()).equals(compare.format(cal.getTime()))) {
            } else if (!cal.equals(today)) {
                System.out.print("| " + sdf.format(cal.getTime()) + " ");
            }
//            if (compare.format(today.getTime()).equals(compare.format(cal.getTime()))&&(cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)) {
            if (cal.equals(today) && (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)) {
                System.out.print("| " + sdf.format(cal.getTime()) + "*");
            }
        }
        int lastDayOfMonth = cal.get(Calendar.DAY_OF_WEEK) + (cal.getActualMaximum(Calendar.DAY_OF_WEEK) % 7);
        if (lastDayOfMonth != 1) {
            System.out.print("|");
        }
        while (lastDayOfMonth <= 7 && lastDayOfMonth != 1) {
            System.out.print("    |");
            lastDayOfMonth++;
        }
        System.out.println();
    }
}

