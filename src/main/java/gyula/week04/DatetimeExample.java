package gyula.week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
