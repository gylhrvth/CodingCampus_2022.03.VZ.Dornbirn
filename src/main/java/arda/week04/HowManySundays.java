package arda.week04;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class HowManySundays {
    public static void main(String[] args) {
        GregorianCalendar initMonth = new GregorianCalendar(2022, 3, 4);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM");
        System.out.println("how many sundays are in " + sdf.format(initMonth.getTime()) + " ?");

        getSunday(initMonth);
    }

    public static void getSunday(GregorianCalendar gc) {

        int month = gc.getMaximum(Calendar.DAY_OF_MONTH);


        System.out.println(month);
    }
}
