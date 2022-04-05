package sergej.week04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {

    public static void newCalendar(int year, int month) {

        GregorianCalendar gc = new GregorianCalendar(year, month - 1, 1);

        int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("MO DI MI DO FR SA SO");

        String initialSpace = "";
        for (int i = 0; i < gc.get(Calendar.DAY_OF_WEEK) - 2; i++) {
            initialSpace += "   ";
        }
        System.out.print(initialSpace);

        for (int day = 1; day <= daysInMonth; day++) {
            gc.set(year, month - 1, day);
            int dayofmonth = gc.get(Calendar.DAY_OF_MONTH);
            int dayofweek = gc.get(Calendar.DAY_OF_WEEK);

            if (dayofweek - 1 == Calendar.SUNDAY) {
                System.out.println();
            }
            if (day < 10) {
                System.out.print(" ");
            }
            System.out.print(dayofmonth + " ");

        }

    }


    public static void main(String[] args) {

        newCalendar(2022, 4);

    }
}
