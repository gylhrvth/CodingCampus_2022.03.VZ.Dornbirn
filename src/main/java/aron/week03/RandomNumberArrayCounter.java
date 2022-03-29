package aron.week03;


import java.util.Arrays;
import java.util.Random;

public class RandomNumberArrayCounter {
    static Random rand = new Random();


    public static int[] generateRandomArray(int size){
        int[] testArray = new int[size];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = 1 + rand.nextInt(100);
        }
        return testArray;
    }


    public static int countBiggerThen(int[] data, int target) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > target) {
                counter += 1;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        int[] testArray = generateRandomArray(20);
        System.out.println(Arrays.toString(testArray));
        System.out.println("Count: " + countBiggerThen(testArray, 30));


        /*
        int counter = 0;
        int[] testArray = new int[20];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = 1 + rand.nextInt(100);

            if (testArray[i] > 30) {
                counter += 1;
            }


        }
        System.out.println(Arrays.toString(testArray));
        System.out.println(counter);
*/
    }


}