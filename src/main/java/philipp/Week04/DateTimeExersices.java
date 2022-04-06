package philipp.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.GregorianCalendar;

public class DateTimeExersices {

    public static void main(String[] args) {
        System.out.println("Next Sunday is:");
        nextSunday(2022,4,4);
        System.out.println();
        System.out.println("Get Sundays of Month!");
        System.out.println(getSundays(2021, 10));
        System.out.println(getSundays(2021, 9));
        System.out.println(getSundays(2021, 8));
        System.out.println(getSundays(2022, 5));
        System.out.println();
        System.out.println("Get Workdays of Month!");
        System.out.println(getWorkdays(2021,06));
        System.out.println(getWorkdays(2021,03));
        System.out.println(getWorkdays(2021,02));
        System.out.println();
    }

    private static int getWorkdays(int year, int month){
        int countWorkdays = 0;
        GregorianCalendar cal= new GregorianCalendar(year, month-1,1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd (EEE)");
        System.out.println(sdf.format(cal.getTime()));

        for (int d = 1; d <= cal.getActualMaximum(Calendar.DAY_OF_MONTH) ; d++) {
            cal= new GregorianCalendar(year, month-1, d);
            if (cal.get(Calendar.DAY_OF_WEEK)!= Calendar.SUNDAY && cal.get(Calendar.DAY_OF_WEEK)!= Calendar.SATURDAY){
                countWorkdays++;
            }
        }
        return countWorkdays;
    }

    private static int getSundays(int year, int month) {
        int countSundays = 0;
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd (EEE)");
        System.out.println(sdf.format(cal.getTime()));

        for (int d = 1; d <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); d++) {
            cal = new GregorianCalendar(year, month - 1, d);
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                countSundays++;
            }
        }
        return countSundays;
    }

    private static void nextSunday(int year, int month, int day) {
        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
//        gc.setTime(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd (EEE)");

        System.out.println(sdf.format(cal.getTime()));
        System.out.println();
//        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//        System.out.println(Calendar.SUNDAY);
        int daysUntilSunday = (8 - cal.get(Calendar.DAY_OF_WEEK)) % 7;
        cal.add(Calendar.DAY_OF_MONTH, daysUntilSunday);
        System.out.println(sdf.format(cal.getTime()));


        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));

    }

}
