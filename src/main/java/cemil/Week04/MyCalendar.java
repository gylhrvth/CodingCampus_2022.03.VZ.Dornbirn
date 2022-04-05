package cemil.Week04;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalendar {

    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());
        Scanner sc = new Scanner(System.in);


        System.out.println("To Day");
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss  u/D EEEE");
        System.out.println(myDateFormat.format(gc.getTime()));

        System.out.println();


        System.out.println("Sunday");
        while (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            gc.add(Calendar.DAY_OF_MONTH, 1);

        }
        System.out.println(myDateFormat.format(gc.getTime()));
        System.out.println();

        System.out.println("Sunday/ Month");
        SimpleDateFormat myDateFormatSunday = new SimpleDateFormat("dd.MM.yyyy  u/D EEEE");

//        while (gc.get(Calendar.MONTH) != Calendar.DAY_OF_MONTH) {
//            gc.add(Calendar.DAY_OF_YEAR, 7);
//            System.out.println(myDateFormatSunday.format(gc.getTime())) ;
//
//        }


        System.out.println(getSundays(2021, 10));
        System.out.println(getSundays(2021, 9));
        System.out.println();
        System.out.println("Work Day");
        System.out.println(getWorkDays(2021, 6));
        System.out.println(getWorkDays(2021, 3));
        System.out.println(getWorkDays(2021, 2));
        System.out.println();
        System.out.println("Birthday");

//        readBirthdayAndPrintDay();
        readOneLine();


    }


    /**
     * @param year
     * @param month from 1 = January to 12 = December
     * @return
     */
    public static int getSundays(int year, int month) {
        Calendar gc = Calendar.getInstance();
        gc.set(year, month - 1, 1);
        int lastDayOfMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countOfSundays = 0;

        for (int dayInMonth = 1; dayInMonth <= lastDayOfMonth; dayInMonth++) {
            gc.set(year, month - 1, dayInMonth);
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                ++countOfSundays;
            }
        }
        return countOfSundays;
    }

    public static int getWorkDays(int year, int month) {
        Calendar gc = Calendar.getInstance();
        gc.set(year, month - 1, 1);
        int lastDayOfMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countOfSundays = 0;

        for (int dayInMonth = 1; dayInMonth <= lastDayOfMonth; dayInMonth++) {
            gc.set(year, month - 1, dayInMonth);
            if (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                ++countOfSundays;
            }
        }
        return countOfSundays;
    }
    public static void readOneLine (){
        Scanner sc = new Scanner(System.in);
        Date date = readDate(sc,"Gib dein Geburtsdatum ein (Tag.Monat.Jahr): ");
        Calendar gc = Calendar.getInstance();
        gc.setTime(date);
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        System.out.println(format.format(gc.getTime()));


    }


    public static void readBirthdayAndPrintDay() {
        Scanner sc = new Scanner(System.in);
        int year = readNumber(1900, 2099, sc, "Bitte gib dein Geburtsjahr ein: ");
        int month = readNumber(1, 12, sc, "Bitte gib dein Geburtsmonat ein: ");
        int day = readNumber(1, 31, sc, "Bitte gib dein Geburtstag ein: ");
        birthday(year, month, day);


    }

    public static void birthday(int year, int month, int day) {
        Calendar gc = Calendar.getInstance();
        gc.set(year, month - 1, day);
        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        System.out.println(format.format(gc.getTime()));
    }

    private static Date readDate(Scanner sc, String text) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(text);
        while (true) {
            String dateText = sc.next();
            try {
                return format.parse(dateText);
            } catch (ParseException e) {
                System.out.println(text);
            }
        }
    }

    private static int readNumber(int min, int max, Scanner sc, String text) {
        System.out.println(text);
        while (true) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number >= min && number <= max) {
                    return number;
                }
            } else {
                sc.next();
            }
            System.out.println(text);
        }
    }


}

