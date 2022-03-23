package cemil.week02;

import java.util.Scanner;

public class inputSC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;

        System.out.println("Enter your decimal number ");
        while (value == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                value = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("A number is requested");
            }
        }
        System.out.println("The value is: " + value);
    }

}


