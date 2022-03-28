package arda.week03.day01;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
