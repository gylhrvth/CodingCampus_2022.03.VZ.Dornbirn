package zah.week04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class getDay {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar gc = Calendar.getInstance();
        gc.setTime(new Date());
        //readBirdayAndPrint();
         readline();


    }

    /**
     * @param year
     * @param month from 1 = January to 12 = December
     * @return
     */
    public static void dayOfBitrh1(int year, int month, int day) {
        Calendar gc = Calendar.getInstance();
        gc.set(year, month - 1, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(gc.getTime()));


    }

    public static void readBirdayAndPrint() {
        Scanner sc = new Scanner(System.in);
        int year = redNumber(1900, 2099, sc, "Geburtsjahr");
        int month = redNumber(1, 12, sc, "Geburtsmonat");
        int day = redNumber(1, 31, sc, "Geburtstag");
        dayOfBitrh1(year, month, day);



    }

    public static int redNumber(int min, int max, Scanner sc, String text) {
        System.out.println(text);
        while (true) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number >= min && number <= max) {
                    return number;

                } else {
                    sc.next();
                }
                System.out.println(text);
            }
        }
    }

    public static Date readDate(Scanner sc, String text) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(text);
        while (true) {
            String dataText = sc.next();
            try {
                return format.parse(dataText);
            } catch (ParseException e) {
                System.out.println(text);
            }
        }
    }

    public static void readline() {
        Scanner sc = new Scanner(System.in);
        Date date = readDate(sc, "Your bithday:");
        Calendar gc = Calendar.getInstance();
        gc.setTime(date);
        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        System.out.println(format.format(gc.getTime()));
    }


}
