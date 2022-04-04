package zah.week04;

import java.text.SimpleDateFormat;
import java.util.*;

public class Kalendar {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. EEEE ");
        System.out.println(sdf.format(gc.getTime()));


        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(Calendar.SUNDAY);
        gc.add(Calendar.DAY_OF_WEEK,6);


        System.out.println(sdf.format( gc.getTime()));

        while (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            gc.add(Calendar.DAY_OF_MONTH, 1);

        }
        System.out.println(sdf.format( gc.getTime()));










    }

}
