package timo.week04;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyRealCalendar {
    public static void main(String[] args) {

        myCoolCalendar(2016, 3);
    }

    public static void myCoolCalendar(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year, month - 1, 1);
        System.out.println(new SimpleDateFormat("YYYY MMMM").format(gc.getTime()));
        System.out.println("| Mo |" + " Di |" + " Mi |" + " Do |" + " Fr |" + " Sa |" + " So |");

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
                System.out.print(dateOfMonth + "*");
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

}
