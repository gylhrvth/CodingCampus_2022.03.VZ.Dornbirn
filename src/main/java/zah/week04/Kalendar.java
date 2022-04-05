package zah.week04;

import javax.sound.midi.VoiceStatus;
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
        System.out.println(getSundays(2021,10));
        System.out.println(getSundays(2021,9));


        System.out.println(workDays(2021,6));
    }

    /**
     *
     * @param year
     * @param month from 1 = January to 12 = December
     * @return
     */
    public static int getSundays( int year, int month){
        GregorianCalendar gc =new GregorianCalendar(year, month - 1,1);

        int dayInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countOfSundays = 0;
        for (int i = 1; i <= dayInMonth; i++) {
            gc.set(year, month - 1, i);
            /*
            Kommentar

            mehrzeilig
             */
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                countOfSundays += 1;
            }
        }
        // Einzeiliges Kommentar
        return countOfSundays;


    }
    public static int workDays(int year, int month){
        GregorianCalendar gc = new GregorianCalendar(year, month-1,1);
        int daysOfWork = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countOfWorkDays =0;
        for (int i = 1; i <daysOfWork ; i++) {
            gc.set(year,month-1,i);

            if (gc.get(Calendar.DAY_OF_WEEK)== Calendar.DAY_OF_WEEK){
                countOfWorkDays+=1;
            }


        }
        return countOfWorkDays;
    }


}
