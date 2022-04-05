package lukas.week4.day2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Calendario {
    public static void main(String[] args) throws ParseException {
        //THAILAND verwendet den Buddistishen Kalender
        //TimeZone.setDefault(TimeZone.getTimeZone("JST"));
        Calendar gc = Calendar.getInstance();
        System.out.println(gc);
        System.out.println(gc.getFirstDayOfWeek() == Calendar.SUNDAY);

        //Aktuellen Tag des Monats augeben
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));

        //Tage hinzufügen
        gc.add(Calendar.DAY_OF_YEAR, 5);
        System.out.println(gc.getTime());

        gc.set(1971, Calendar.JANUARY, 1, 0, 0, 0);

        Calendar compareCalendar = Calendar.getInstance();
        compareCalendar.set(1971, Calendar.JANUARY, 1, 0, 0, 0);

        System.out.println("Calendars are not equal! " + compareCalendar.equals(gc));
        gc.set(Calendar.MILLISECOND, 0);
        compareCalendar.set(Calendar.MILLISECOND, 0);
        System.out.println("Calendars are equal! " + compareCalendar.equals(gc));

        System.out.println("Compare object references: " + (gc == compareCalendar));
        System.out.println("Compare object references: " + (gc == gc));

        System.out.println(gc.getTime());
        System.out.println(gc.getTimeInMillis());

        //US Formatierung
        DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.US);
        System.out.println(format.format(gc.getTime()) + " " + timeFormat.format(gc.getTime()));

        //DE Formatierung
        format = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.GERMAN);
        System.out.println(format.format(gc.getTime()) + " " + timeFormat.format(gc.getTime()));

        //Date parsen
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy.MM.dd");

        System.out.println(format2.format(new Date()));

        String input = "2021.11.30";

        Date parsedDate = format2.parse(input);
        System.out.println(parsedDate);
    }
}
