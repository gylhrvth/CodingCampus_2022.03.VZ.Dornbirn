package murat.week2.day1;

import java.text.DecimalFormat;

public class dataTypesTask1CountTo100 {
    public static void main(String[] args) {

        //countToAValueWith01Method1(100);
        countToAValueWith01Method2(100);

    }

    public static void countToAValueWith01Method1(int upperLimit) {

        for (double counter = 0.0; counter <= upperLimit; counter += 0.1) {

            //Changing the decimal format
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Method 1: " + df.format(counter));
        }
    }

    public static void countToAValueWith01Method2(int upperLimit) {

        // Count 1 to 100, but multiply it with 0.1
        int newUpperLimit = 10 * upperLimit;
        for (int i = 0; i < newUpperLimit; i++) {

            double change = i * 0.1;

            //Changing the decimal format
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("Method 2: " + df.format(change));
        }
    }
}
