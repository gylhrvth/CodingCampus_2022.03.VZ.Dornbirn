package aron.Week04;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Calender {

    public static void main(String[] args) {
//        calenderGC(0);
//        System.out.println();
//        calenderGC(1);
//        System.out.println();
//        calenderGC(2);
//        System.out.println();
//        calenderGC(3);
//        System.out.println();
//        calenderGC(4);
//        System.out.println();
//        calenderGC(5);
//        System.out.println();
//        calenderGC(6);
//        System.out.println();
//        calenderGC(7);
//        System.out.println();
        calenderGC(8);
//        System.out.println();
//        calenderGC(9);
//        System.out.println();
//        calenderGC(10);
//        System.out.println();
//        calenderGC(11);


    }

    public static void calenderGC(int month) {
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
            System.out.printf("| %2d ", days.get(Calendar.DAY_OF_MONTH));

            if (i % 7 == 0) {
                System.out.println("|");
            }


            days.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}





