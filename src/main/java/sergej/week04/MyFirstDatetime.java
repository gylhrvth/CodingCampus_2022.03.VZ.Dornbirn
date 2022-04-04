package sergej.week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyFirstDatetime {


    public static int getSundays(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year, month, 1);

        int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (int day = 0; day <= daysInMonth; day++) {
            gc.set(year, month, day);
            int dayofweek = gc.get(Calendar.DAY_OF_WEEK);
            if (dayofweek == Calendar.SUNDAY) {
                count++;
            }
        }

        return count;

    }


    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar(2022, 3, 25);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.(EEE)");

        //gc.setTime(new Date());

        // System.out.println(sdf.format(gc.getTime()));
        System.out.println(sdf.format(gc.getTime()));


        Date today = new Date();

        System.out.println(today);

        int nextSunday = (7 + Calendar.SUNDAY - gc.get(Calendar.DAY_OF_WEEK)) % 7;
        gc.add(Calendar.DAY_OF_WEEK, nextSunday);
        System.out.println(sdf.format(gc.getTime()));

        System.out.println();

        int sundays = getSundays(2021, 10);
        System.out.println(sundays);

    }
}
