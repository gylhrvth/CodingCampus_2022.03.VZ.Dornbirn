package sergej.week04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyFirstDatetime {


    public static int getSundays(int year, int month) {
        GregorianCalendar gc = new GregorianCalendar(year, month, 1);

        int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (int day = 0; day <= daysInMonth; day++) {
            gc.set(year, month, day);
            int dayofweek = gc.get(Calendar.DAY_OF_WEEK);
            if (dayofweek == Calendar.SUNDAY) {
                count++;
            }
        }

        return count;

    }

    public static int getWorkdays(int year, int month) {

        GregorianCalendar gc = new GregorianCalendar(year, month - 1, 1);

        int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDay = gc.getActualMinimum(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (int day = firstDay; day <= daysInMonth; day++) {
            gc.set(year, month - 1, day);
            int dayofweek = gc.get(Calendar.DAY_OF_WEEK);
            if (dayofweek != Calendar.SUNDAY && dayofweek != Calendar.SATURDAY) {
                count++;
            }
        }

        return count;

    }

    public static void getBirthday() {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");

        System.out.println("Please enter your date of birth (dd.mm.yyyy):");
        String date = sc.nextLine();
        try {
            Date date1 = formatter.parse(date);
            GregorianCalendar birthDay = new GregorianCalendar();
            birthDay.setTimeInMillis(0);
            birthDay.setTime(date1);
            String dayWeekText = new SimpleDateFormat("EEEE").format(birthDay.getTime());
            System.out.println("Your day of Birth is: " + dayWeekText);
        } catch (ParseException pe) {
        }


        // GregorianCalendar birthDay = new GregorianCalendar();
        //birthDay.setTime(date1);
        // String dayWeekText = new SimpleDateFormat("EEEE").format(birthDay.getTime());
        //System.out.println("Your day of Birth is: " + dayWeekText);
    }


    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar(2022, 3, 25);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.(EEE)");

        //gc.setTime(new Date());

        // System.out.println(sdf.format(gc.getTime()));
        System.out.println(sdf.format(gc.getTime()));


        Date today = new Date();

        System.out.println(today);

        int nextSunday = (7 + Calendar.SUNDAY - gc.get(Calendar.DAY_OF_WEEK)) % 7;
        gc.add(Calendar.DAY_OF_WEEK, nextSunday);
        System.out.println(sdf.format(gc.getTime()));

        System.out.println();

        int sundays = getSundays(2021, 10);
        System.out.println(sundays);

        int workdays = getWorkdays(2021, 6);
        System.out.println(workdays);

        int workdays2 = getWorkdays(2021, 3);
        System.out.println(workdays2);

        int workdays3 = getWorkdays(2021, 2);
        System.out.println(workdays3);

        getBirthday();

    }
}
