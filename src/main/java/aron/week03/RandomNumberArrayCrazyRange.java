package aron.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrayCrazyRange {
    public static int randomGen() {
        Random rand = new Random();
        int randomnumber = rand.nextInt(101) - 50;

        return randomnumber;
    }





    public static void main(String[] args) {


        int[] testArray = new int[20];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = randomGen();
        }

        System.out.println(Arrays.toString(testArray));


//        for (int i = 0; i < testArray.length; i++) {
//            int value = testArray[i];
//            System.out.println(value);
//        }
//
//        for (int value: testArray) {
//            System.out.println(value);
//        }

    }
}


