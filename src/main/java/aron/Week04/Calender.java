package aron.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            calenderGC(i);
            System.out.println();
            System.out.println();
        }
    }

    public static void calenderGC(int month) {

        Calendar currentDay = Calendar.getInstance();
        int day = currentDay.get(Calendar.DATE);
        int currentMonth = currentDay.get(Calendar.MONTH);


        GregorianCalendar days = new GregorianCalendar(2022, month - 1, 1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM" + " yyyy");
        System.out.println(sdf2.format(days.getTime()));
        System.out.println("| Mo | DI | MI | DO | FR | SA | SO |");

        int maxDaysOfMonth = days.getActualMaximum(Calendar.DAY_OF_MONTH);

        int currentDayOfWeek = days.get(Calendar.DAY_OF_WEEK);

        int offset = currentDayOfWeek - 2;
        if (currentDayOfWeek == Calendar.SUNDAY) {
            offset = offset + 7;
        }

        for (int j = 0; j < offset; j++) {
            System.out.print("     ");
        }

        for (int i = 1 + offset; i <= maxDaysOfMonth + offset; i++) {
            int now = days.get(Calendar.DAY_OF_MONTH);


            if (now == day && currentMonth == days.get(Calendar.MONTH)) {
                System.out.printf("| %2d*", now);
            } else {
                System.out.printf("| %2d ", now);

            }
            if (i % 7 == 0) {
                System.out.println("|");
            }

            days.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}





