package cemil.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCalendar {

    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());

        System.out.println("To Day");
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss  u/D EEEE");
        System.out.println(myDateFormat.format(gc.getTime()));

        System.out.println();


        System.out.println("Sunday");
        while (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            gc.add(Calendar.DAY_OF_MONTH, 1);

        }
        System.out.println(myDateFormat.format(gc.getTime()));
        System.out.println();

        System.out.println("Sunday/ Month");
        SimpleDateFormat myDateFormatSunday = new SimpleDateFormat("dd.MM.yyyy  u/D EEEE");

//        while (gc.get(Calendar.MONTH) != Calendar.DAY_OF_MONTH) {
//            gc.add(Calendar.DAY_OF_YEAR, 7);
//            System.out.println(myDateFormatSunday.format(gc.getTime())) ;
//
//        }

        System.out.println("=============================");
        System.out.println(getSundays(2021, 10));
        System.out.println(getSundays(2021, 9));

    }

    /**
     * @param year
     * @param month from 1 = January to 12 = December
     * @return
     */
    public static int getSundays(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year, month - 1, 1);
        int lastDayOfMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countOfSundays = 0;

        for (int dayInMonth = 1; dayInMonth <= lastDayOfMonth; dayInMonth++) {
            gc.set(year, month - 1, dayInMonth);
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                ++countOfSundays;
            }
        }
        return countOfSundays;
    }
}
