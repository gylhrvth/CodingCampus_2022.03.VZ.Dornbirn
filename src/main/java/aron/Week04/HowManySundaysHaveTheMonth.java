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
        GregorianCalendar firstOfMonth = new GregorianCalendar(year, month - 1, 1);
        int lastOfMoth = firstOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
        int counter = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(sdf.format(firstOfMonth.getTime()));
        System.out.println(lastOfMoth);

        for (int i = 1; i <= lastOfMoth; i++) {
   firstOfMonth.set(year, month);
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


