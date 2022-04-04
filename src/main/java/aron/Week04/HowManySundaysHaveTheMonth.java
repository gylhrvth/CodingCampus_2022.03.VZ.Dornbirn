package aron.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HowManySundaysHaveTheMonth {

    /**
     * @param year
     * @param month from 1 = January to 12 = December
     * @return
     */
    public static int getSundays(int year, int month) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        int counter = 0;

        GregorianCalendar firstOfMonth = new GregorianCalendar(year, month - 1, 1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM");
        System.out.println(sdf2.format(firstOfMonth.getTime()));
        int lastOfMoth = firstOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(lastOfMoth);

        for (int dayConter = 1; dayConter <= lastOfMoth; dayConter++) {
            firstOfMonth.set(year, month - 1, dayConter);

            if (firstOfMonth.DAY_OF_MONTH == firstOfMonth.SUNDAY) {
                counter++;
            }
        }

        System.out.println(counter);

        return 0;
    }


    public static void main(String[] args) {

        System.out.println(getSundays(2021, 10));
        System.out.println(getSundays(2021, 9));


    }
}

