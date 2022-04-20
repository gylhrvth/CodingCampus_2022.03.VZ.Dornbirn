package aron.EasternWeek;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Kalender {

    public static void main(String[] args) {

        SimpleDateFormat dayform = new SimpleDateFormat("EEE");
        SimpleDateFormat form = new SimpleDateFormat(" yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();

        Date dateObj = calendar.getTime();
        System.out.println(dayform.format(dateObj).substring(0, 2).toUpperCase() + form.format(dateObj));
    }
}
