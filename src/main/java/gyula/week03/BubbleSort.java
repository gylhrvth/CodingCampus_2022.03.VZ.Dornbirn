package gyula.week03;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    static Random rand = new Random();

    public static int countEven(int[] data){
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0){
                ++counter;
            }
        }
        return counter;
    }



    public static void swap(int[] data, int left, int right){
        if ((left >= 0) && (left < data.length) && (right >= 0) && (right < data.length)){
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
    }

    public static void bubbleSort(int[] data){
        for (int indexOuter = 0; indexOuter < data.length; indexOuter++) {
            for (int indexInner = 0; indexInner < data.length - indexOuter - 1; indexInner++) {
                if (data[indexInner] < data[indexInner + 1]){
                    swap(data, indexInner, indexInner+1);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] testArray = new int[20];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = rand.nextInt(1000);
        }

        System.out.println(Arrays.toString(testArray));
        //System.out.println("Anzahl gerade Zahlen sind: " + countEven(testArray));

//        swap(testArray, 0, 1);
//        System.out.println(Arrays.toString(testArray));
        bubbleSort(testArray);
        System.out.println("=======================");
        System.out.println(Arrays.toString(testArray));


    }

}
