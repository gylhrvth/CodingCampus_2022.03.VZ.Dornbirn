package arda.week03.day01;

import java.util.Random;

public class ArrayZaehlen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100)+1;
            System.out.print(array[i] + " ");

            if (array[i] > 30){
                counter += 1;
            }
        }
        System.out.println("\nthe amount of number over 30 are: "+counter);
    }
}
