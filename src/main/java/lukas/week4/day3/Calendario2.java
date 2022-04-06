package lukas.week4.day3;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Calendario2 {
    public static void main(String[] args) {
        System.out.println(new Date().toString().replace("Apr", Color.COLORS[4] + "Apr" + Color.RESET));
        System.out.println(Calendar.getInstance().getTime());

        Locale.setDefault(new Locale.Builder().setRegion("TH").setLanguage("th").build());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass().getName());
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.getFirstDayOfWeek());

        Locale.setDefault(Locale.GERMANY);
        calendar = Calendar.getInstance();
        System.out.println(calendar.getFirstDayOfWeek());
    }
}
