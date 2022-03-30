package aron.week03;

import java.util.Arrays;

public class RandomNumberArrazMinMaxAvg {

    public static int min(int[] data) {
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < Min) {
                Min = data[i];
            }
        }
        return Min;
    }

    public static int max(int[] data) {
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > Max) {
                Max = data[i];
            }
        }
        return Max;
    }

    public static float avarage(int[] data){
        int summe = 0;
        for (int i = 0; i < data.length; i++) {
            summe += data[i];
        }

        return (float) summe / data.length;
    }
    public static int minIndex(int[] data) {
        int min = Integer.MAX_VALUE;
        int indexMin = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int maxIndex(int[] data) {
        int max = Integer.MIN_VALUE;
        int indexMax = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                indexMax = i;
            }
        }
        return indexMax;
    }



    public static void main(String[] args) {
        int[] testArray = RandomNumberArrayCounter.generateRandomArray(10);
        System.out.println(Arrays.toString(testArray));
        int minValue = min(testArray);
        System.out.println("Kleinste Zahl: " + minValue);
        int maxValue = max(testArray);
        System.out.println("Größte Zahl: " + maxValue);
        float avarageValue = avarage(testArray);
        System.out.println("Durchschnitts Zahl: " + avarageValue);
        int indexMax = maxIndex(testArray);
        System.out.println("Größte Zahl an der Position: " + indexMax);
        int indexMin = minIndex(testArray);
        System.out.println("Kleinste Zahl an der Position: " + indexMin);
    }
}
