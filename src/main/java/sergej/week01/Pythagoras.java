package sergej.week01;

import java.util.Scanner;

public class Pythagoras {

    public static void getY(int radius) {
        double y = 0d;

        for (int i = -radius; i <= radius; i++) {

            y = Math.ceil(Math.sqrt((double) radius * radius - i * i));

            System.out.println(y);
        }

    }

    public static void printCirclePythagoras(int radius, String text) {

        double y = 0d;

        for (int i = -radius; i <= radius; i++) {

            y = Math.ceil(Math.sqrt((double) radius * radius - i * i));
            if (y < radius) {
                for (int k = 0; k < radius - y; ++k) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < y * 2 - 1; j++) {
                System.out.print(text);
            }
            System.out.println();
        }

    }

    public static void userInputPyth() {
        String x = "";


        Scanner sc = new Scanner(System.in);
        int value = Integer.MIN_VALUE;


        System.out.println("Please enter decimal number: ");

        while (value == Integer.MIN_VALUE) {
            try {
                String y = sc.nextLine();
                value = Integer.parseInt(y);
            } catch (NumberFormatException nfe) {
                System.out.println("please enter valid number");

            }
        }

        System.out.println("Please enter Character: ");

        while (x.length() != 1) {
            try {
                x = sc.nextLine();
            } catch (NumberFormatException nfe) {
                System.out.println("please enter a text");

            }
            System.out.println("the value is : " + value);
            printCirclePythagoras(value, x);
        }
    }


    public static void main(String[] args) {

        // printCirclePythagoras(10, "o");
        //getY(10);
        userInputPyth();
    }
}

