package arda.week03.day01;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        arrayCountUp(sc);
        arrayCountDown(sc);
    }

    public static void arrayCountUp(Scanner sc) {
        System.out.println("enter a number to create an array that counts up");
        int size = arda.week02.day04and05.InputwithMenu.readUserInput(sc, 1, 100);
        int[] userinput = new int[size];
        for (int i = 0; i < userinput.length; i++) {
            userinput[i] = i;
        }
        System.out.println(java.util.Arrays.toString(userinput));
    }

    public static void arrayCountDown(Scanner sc) {
        System.out.println("enter a number to create an array that counts down");
        int size = arda.week02.day04and05.InputwithMenu.readUserInput(sc, 1, 100);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;  //array.length - is kinda self explanatory
        }
        System.out.println(java.util.Arrays.toString(array));
    }
}
