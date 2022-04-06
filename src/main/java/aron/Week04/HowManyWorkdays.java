package aron.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HowManyWorkdays {

    public static void main(String[] args) {
        System.out.println(getWorkday(2021, 6));
        System.out.println(getWorkday(2021, 3));
        System.out.println(getWorkday(2021, 2));
    }

    public static int getWorkday(int year, int month){
        int counter = 0;

        GregorianCalendar firstOfMonth = new GregorianCalendar(year, month - 1, 1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM");
        System.out.println(sdf2.format(firstOfMonth.getTime()));
        int lastOfMoth = firstOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(lastOfMoth);

        for (int dayConter = 1; dayConter <= lastOfMoth; dayConter++) {
            firstOfMonth.set(year, month - 1, dayConter);

            int dayOfWeek = firstOfMonth.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != Calendar.SUNDAY && dayOfWeek != Calendar.SATURDAY) {
                counter++;
            }
        }


        return counter;
    }









}