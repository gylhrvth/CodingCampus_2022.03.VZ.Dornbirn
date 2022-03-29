package aron.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {


    public static int randomGen() {
        Random rand = new Random();
        int randomnumber = rand.nextInt(100);

        return randomnumber;
    }





    public static void main(String[] args) {


        int[] testArray = new int[20];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = randomGen();
        }

        System.out.println(Arrays.toString(testArray));


    }
}
