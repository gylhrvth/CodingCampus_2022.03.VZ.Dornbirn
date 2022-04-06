package sergej.week04;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {

    public static void newCalendar(int year, int month) {

        GregorianCalendar gc = new GregorianCalendar(year, month - 1,1);

        int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(new SimpleDateFormat("yyyy MMMM").format(gc.getTime()));

        System.out.println("| MO | | DI | | MI | | DO | | FR | | SA | | SO |");

        int isSunday = Calendar.SUNDAY;
        int isMonday = Calendar.MONDAY;
        String initialSpace = "";

        if (isSunday == gc.get(Calendar.DAY_OF_WEEK)) {
            for (int i = 0; i < 6; i++) {
                initialSpace += "|    |" + "  ";
            }
        } else {
            for (int i = 0; i < gc.get(Calendar.DAY_OF_WEEK) - 2; i++) {
                initialSpace += "|    |" + " ";
            }
        }
        System.out.print(initialSpace);


        LocalDate currentdate = LocalDate.now();

        int currentday = currentdate.getDayOfMonth();

        for (int day = 1; day <= daysInMonth; day++) {
            gc.set(year, month - 1,day);
            int dayofmonth = gc.get(Calendar.DAY_OF_MONTH);
            int dayofweek = gc.get(Calendar.DAY_OF_WEEK);


            if (day < 10) {
                if (currentday == dayofmonth) {
                    System.out.print("| " + dayofmonth + " *| ");
                } else {
                    System.out.print("|  " + dayofmonth + " | ");
                }
            } else {
                if (currentday == dayofmonth) {
                    System.out.print("| " + dayofmonth + "*| ");
                } else {
                    System.out.print("| " + dayofmonth + " | ");
                }
            }
            if (dayofweek  == Calendar.SUNDAY) {
                System.out.println();
            }
        }

        int lastday = gc.getActualMaximum(Calendar.DATE);
        gc.set(Calendar.DATE, lastday);
        int lastDay1 = gc.get(Calendar.DAY_OF_WEEK);
        String postspace = "";


        if (isSunday != gc.get(Calendar.DAY_OF_WEEK)) {
            for (int i = 0; i < 8 - lastDay1; i++) {
                postspace += "|    |" + " ";
            }
        }
        System.out.print(postspace);
    }

    public static void main(String[] args) {

        newCalendar(2022, 4);
    }
}
