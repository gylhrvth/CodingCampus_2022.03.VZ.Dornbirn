package arda.week02.day02;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float value = Float.MAX_VALUE;

        System.out.println("enter numbers");
        while (value == Float.MAX_VALUE){      //add value operator value 2 = result
            try {
                String text = sc.nextLine();
                value = Float.parseFloat(text);
            } catch(NumberFormatException nfe) {

            }
        }
        System.out.println(value);
    }
}
