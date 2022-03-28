package arda.week03.day01;

import java.util.Random;

public class NumberArrayCrazyRange {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[25];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101)-50;  //distance beween -50 and 50 is 101 including zeros.
        }
        for (int value : array){
            System.out.print(value + " ");
        }
    }
}
