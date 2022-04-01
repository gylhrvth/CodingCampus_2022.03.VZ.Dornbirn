package arda.week03.day01;

import java.util.Random;

public class ArrayResult {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.print(array[i] + " ");

           result = result + array[i];  //Note: shouldve been in a function!
        }
        System.out.print("\nthe resut of all elements are " + result);
    }
}
