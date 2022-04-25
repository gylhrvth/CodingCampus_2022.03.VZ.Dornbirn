package aron.week05;

import java.util.Scanner;

public class Permutation {
    private static int counter = 0;

    public static void main(String[] args) {

        System.out.print("The Factorial is: ");
        System.out.println(factorial(5));
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String name = "";
        while (name.trim().length() == 0) {
            System.out.println("Bitte geben Sie das Wort ein:");
            name = sc.nextLine();
        }
        System.out.println("Permutation ist: ");
        permutation("", name);

    }

    public static long factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }

    public static void permutation(String prefix, String rest) {
        //System.out.println("permutation() " + prefix + " " + rest);


        if (rest.length() == 0) {
            ++counter;
            System.out.println(counter + ". " + prefix);
        } else {
            for (int i = 0; i < rest.length(); i++) {
                permutation(prefix + rest.charAt(i), rest.substring(0, i) + rest.substring(i + 1));
            }
        }
    }
}




