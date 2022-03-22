package murat.week2.day2;

import java.util.Scanner;

public class ReadANumberWithoutAProtection {
    public static void main(String[] args) {

        System.out.println("Please enter an integer number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The number is: " + number);
    }
}
