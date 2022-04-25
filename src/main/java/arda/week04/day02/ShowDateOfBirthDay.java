package arda.week04.day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ShowDateOfBirthDay {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        userDOBIN(sc);
        //add input limit.
    }
    public static void userDOBIN(Scanner sc) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date dateIn;
        System.out.println("please enter your date of birth in this format: dd.MM.yyyy");

        while (true) {
            try {
                String userIn = sc.nextLine();
                dateIn = sdf.parse(userIn);
                break;

            } catch (ParseException pe) {
                System.out.println("enter a valid date of birth");
            }
        }
        SimpleDateFormat dateForm = new SimpleDateFormat("EEEE");
        System.out.println("you were born on a " + dateForm.format(dateIn));
    }
}
