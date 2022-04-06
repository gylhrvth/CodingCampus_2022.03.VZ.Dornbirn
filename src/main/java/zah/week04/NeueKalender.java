package zah.week04;

import java.util.Calendar;
import java.util.Date;

public class NeueKalender {
    public static void main(String[] args) {
        Calendar gc = Calendar.getInstance();
        gc.setTime(new Date());
        dayInCalendar(2022, 10);


    }

    /**
     * @param year
     * @param month from 1 = January to 12 = December
     * @return
     */
    public static void dayInCalendar(int year, int month) {
        System.out.println("| Mo| Di| MI| Do| Fr| Sa| So|");


        Calendar gc = Calendar.getInstance();
        gc.set(year, month - 1, 1);

        int lastDayOfMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);

        int currentWeekDay = gc.get(Calendar.DAY_OF_WEEK);

        int blanks;
        if (currentWeekDay == Calendar.SUNDAY) {
            blanks = 6;
        } else {
            blanks = currentWeekDay - 2;
        }

        for (int i = 1; i <= blanks; i++) {
            String line;
            if (i > 10) {
                line = "| ";
            } else {
                line = "| " + "  ";
            }
            System.out.print(line);

        }

        for (int i = 1; i <= lastDayOfMonth; i++) {
            String line;
            if (i > 10) {
                line = "| " + i;
            } else {
                line = "| " + i + " ";
            }
            System.out.print(line);

            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println("|");
            }
            if (i == lastDayOfMonth) {
                System.out.println("|");
            }
            gc.add(Calendar.DAY_OF_MONTH, 1);


        }

    }
}
