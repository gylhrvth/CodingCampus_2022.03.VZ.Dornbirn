package philipp.week14;

import java.util.Scanner;

public class PrintText {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printTxt();
    }

    private static void printTxt() {
        String text = getTxt();
        int number = getPrintAmount();
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

    private static String getTxt() {
        System.out.println("Please enter your text:");
        String s = sc.nextLine();
        return s;
    }

    private static int getPrintAmount() {
        System.out.println("How many times you want to print your text.");
        while (true) {
            try {
                String x = sc.nextLine();
                return Integer.parseInt(x);
            } catch (NumberFormatException nfe) {
                System.out.println("This is not valid number. \nPlease enter a number:");
            }
        }
    }
}
