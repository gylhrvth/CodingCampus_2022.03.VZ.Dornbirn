package timo.week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. (EEE)");

        int nextSunday = (7 + java.util.Calendar.SUNDAY - gc.get(java.util.Calendar.DAY_OF_WEEK)) % 7;
        gc.add(java.util.Calendar.DAY_OF_WEEK, nextSunday);
        System.out.println(sdf.format(gc.getTime()));

        // Print Sundays
        int sundays = getSundays(2021, 10);
        int sundays2 = getSundays(2021, 9);
        System.out.println(sundays);
        System.out.println(sundays2);

        // Print Workdays
        int workdays = getWorkdays(2021, 6);
        System.out.println(workdays);
        int workdays2 = getWorkdays(2021, 3);
        System.out.println(workdays2);
        int workdays3 = getWorkdays(2021, 2);
        System.out.println(workdays3);

         returnBirthday();

    }

    public static int getSundays(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar();
        int count = 0;

        for (int days = 0; days < gc.getActualMaximum(Calendar.DAY_OF_MONTH); days++) {
            gc.set(year, month, days);
            int dayofweek = gc.get(Calendar.DAY_OF_WEEK);
            if (dayofweek == Calendar.SUNDAY) {
                count++;
            }
        }
        return count;

    }

    public static int getWorkdays(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year, month - 1, 1);
        int count = 0;

        for (int days = 1; days <= gc.getActualMaximum(Calendar.DAY_OF_MONTH); days++) {
           gc.set(year, month - 1, days);
            int dayofweek = gc.get(Calendar.DAY_OF_WEEK);
            if (dayofweek != Calendar.SATURDAY && dayofweek != Calendar.SUNDAY) {
                count++;
            }
        }
        return count;

    }

    public static void returnBirthday() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter year of birth");
        int year = sc.nextInt();
        System.out.println("Please enter month of birth");
        int month = sc.nextInt();
        System.out.println("Please enter date of birth");
        int day = sc.nextInt();

        GregorianCalendar birthDay = new GregorianCalendar(year, month - 1, day);

        System.out.println("Your birthday is " + birthDay.get(Calendar.DAY_OF_WEEK));


    }

}
