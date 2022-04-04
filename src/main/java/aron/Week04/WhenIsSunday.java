package aron.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

public class WhenIsSunday {

    public static void main(String[] args) {

//        GregorianCalendar gc = new GregorianCalendar();
//        gc.setTime(new Date());
        GregorianCalendar gc = new GregorianCalendar(2022, 3, 4);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.");
        System.out.println(sdf.format(gc.getTime()));

        System.out.println(gc.get(Calendar.DAY_OF_WEEK) + " " + Calendar.SUNDAY);
        gc.add(Calendar.DAY_OF_MONTH, 6);

        System.out.println(sdf.format(gc.getTime()));

    }

}

