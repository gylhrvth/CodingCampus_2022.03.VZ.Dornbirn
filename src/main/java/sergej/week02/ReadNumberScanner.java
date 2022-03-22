package sergej.week02;

import java.util.Scanner;

public class ReadNumberScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;

        System.out.println("Please enter decimal number: ");

        while (value == Integer.MIN_VALUE){
            try {
                String text = sc.nextLine();
                value = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("please enter valid number");

            }
        }
        System.out.println("the value is : "+value);
    }
}
