package aron.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeLearn {
    public class DatetimeExample {
        public static void main(String[] args) {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. (EEE) HH:mm:ss");
            System.out.println(sdf.format(gc.getTime()));

            GregorianCalendar birthDay = new GregorianCalendar(1979, 2, 2);
            System.out.println(sdf.format(birthDay.getTime()));

            System.out.println("Day of Week: " + birthDay.get(Calendar.DAY_OF_WEEK));
        }
    }
}
//    public static void main(String[] args) {
//        GregorianCalendar gc = new GregorianCalendar(2022, 3, 4);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.");
//        System.out.println(sdf.format(gc.getTime()));
//
//        System.out.println(gc.get(Calendar.DAY_OF_WEEK) + " " + Calendar.SUNDAY);
//
//     int daysToAdd = (7 + Calendar.SUNDAY - gc.get(Calendar.DAY_OF_WEEK)) % 7;
//        gc.add(Calendar.DAY_OF_MONTH, daysToAdd);
//
//        while (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY){
//            gc.add(Calendar.DAY_OF_MONTH, 1);
//        }
//        System.out.println(sdf.format(gc.getTime()));
//
//    }
//}