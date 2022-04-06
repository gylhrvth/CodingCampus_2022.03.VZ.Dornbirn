package philipp.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MyBirthdayDay {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        myBirthdayDay(sc);

    }

    private static void myBirthdayDay(Scanner sc) {
        System.out.println("Find out your Birthday - Day! ");
        System.out.println();
        int day = readNumber(sc, "Please enter the day", "Please enter a correct day", 1, 31);
        int month = readNumber(sc, "Please enter the month", "Please enter a correct month", 1, 12);
        int year = readNumber(sc, "Please enter the year", "Please enter a correct year", 1, Integer.MAX_VALUE);

        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month-1, day);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE  (dd.MMMM yyyy)");
        System.out.println();
        System.out.print("Your birthday - Day is: ");
        System.out.println(sdf.format(birthday.getTime()));
    }

    private static int readNumber(Scanner sc, String inputMsg, String alertMessage, int sizeMin, int sizeMax) {
        System.out.println(inputMsg);
        int n = Integer.MIN_VALUE;
        while (n == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Integer.parseInt(text);
                if (n < sizeMin || n > sizeMax) {
                    n = Integer.MIN_VALUE;
                    System.out.println(alertMessage);
                }
            } catch (NumberFormatException nfe) {
                System.out.println(alertMessage);
            }
        }
        return n;
    }
}
