package murat.week4.day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AskForBirthday {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Date birthday = readUserBirthday(userInput);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(birthday));
    }

    public static Date readUserBirthday(Scanner sc) {

        System.out.println("Please enter your birthday: dd.MM.yyyy");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        while (true) {
            String userText = sc.nextLine();
            try {
                return format.parse(userText);           // Format the String into Date
            } catch (ParseException pe) {
                System.out.println("Try again!");
            }
        }
    }
}
