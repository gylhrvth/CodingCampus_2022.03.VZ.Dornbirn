package zah.week04;

import javax.sound.midi.VoiceStatus;
import java.text.SimpleDateFormat;
import java.util.*;

public class Kalendar {
    public static void main(String[] args) {
        Calendar gc = Calendar.getInstance();
        gc.setTime(new Date());


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. EEEE ");
        System.out.println(sdf.format(gc.getTime()));


        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(Calendar.SUNDAY);
        gc.add(Calendar.DAY_OF_WEEK, 6);


        System.out.println(sdf.format(gc.getTime()));

        while (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            gc.add(Calendar.DAY_OF_MONTH, 1);

        }
        System.out.println(sdf.format(gc.getTime()));
        System.out.println(getSundays(2021, 10));
        System.out.println(getSundays(2021, 9));
        System.out.println("___________________");

        System.out.println(workDays(2021, 6));
        System.out.println(workDays(2021,3));
        System.out.println(workDays(2021,2));
        System.out.println("_______________________________");
    }

    /**
     * @param year
     * @param month from 1 = January to 12 = December
     * @return
     */
    public static int getSundays(int year, int month) {
        Calendar gc = Calendar.getInstance();
        gc.set(year, month - 1, 1);

        int dayInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countOfSundays = 0;
        for (int i = 1; i <= dayInMonth; i++) {
            gc.set(year, month - 1, i);
            /*
            Kommentar

            mehrzeilig
             */
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                countOfSundays ++;
            }
        }
        // Einzeiliges Kommentar
        return countOfSundays;


    }

    public static int workDays(int year, int month) {
        Calendar gc = Calendar.getInstance();
        gc.set(year, month - 1, 1);
        int daysOfWork = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countOfWorkDays = 0;
        for (int i = 1; i <= daysOfWork; i++) {
            gc.set(year, month - 1, i);
            if (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && gc.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
                countOfWorkDays++;
            }


        }
        return countOfWorkDays;
    }



}
