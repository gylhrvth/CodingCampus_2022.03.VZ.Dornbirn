package arda.week03.day01;

import java.util.Random;

public class ArrayResult {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.print(array[i] + " ");//give out the result of the values. probably element + element and so on.

           result = result + array[i];
        }
        System.out.print("\nthe resut of all elements are " + result);
    }
}
