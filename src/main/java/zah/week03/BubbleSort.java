package zah.week03;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    static Random rand = new Random();

    public static void main(String[] args) {
        int[] testArray = new int[20];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = rand.nextInt(1000);
        }

        System.out.println(Arrays.toString(testArray));
        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));




    }


    public static void bubbleSort(int[]data){
        for (int i = 0; i < data.length ; i++) {
            for (int j = 0; j < data.length - i -1 ; j++) {
                if (data[j] < data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}
