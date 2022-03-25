package sergej.week2;

import java.util.Scanner;

public class Visitenkarte {

    public static String userName(Scanner sc) {
        System.out.println("Please enter your full name:"); // maybe ask for first and second name ?
        String fullname = sc.nextLine();

        return fullname;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = userName(sc);
        System.out.println(name);

    }
}
