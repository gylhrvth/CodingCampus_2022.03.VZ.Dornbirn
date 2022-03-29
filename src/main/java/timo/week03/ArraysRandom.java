package timo.week03;

import java.util.Arrays;
import java.util.Random;

public class ArraysRandom {
    static Random rand = new Random();

    public static void main(String[] args) {

        int[] myArray = generateRandomArray(10);
        System.out.println(Arrays.toString(myArray));

        System.out.println(myArray[1] + " " + myArray[4] + " " + myArray[9]);

        printArray(myArray);
        printArray(myArray, 2);

        int[] crazy = generateCrazyRangeArray(10);
        printArray(crazy);


        System.out.println("Number of values higher than 30: " + countBiggerThan(myArray, 30));
        System.out.println("The sum is: " + arraySum(myArray));

        System.out.println("The average value is: " + arrayAvg(myArray));

        System.out.println("The lowest value is: " + arrayMin(myArray));
        System.out.println("The index of the lowest value is: " + arrayIndexMin(myArray));

        System.out.println("The highest value is: " + arrayMax(myArray));
        System.out.println("The index of the highest value is: " + arrayIndexMax(myArray));

    }


    public static int[] generateRandomArray(int size) {
        int[] randArray = new int[size];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(100) + 1;
        }
        return randArray;
    }

    public static void printArray(int[] data) {
        printArray(data, 1);
    }

    public static void printArray(int[] data, int eachOf) {
        for (int i = 0; i < data.length; i += eachOf) {
            if (i == 0) {
                System.out.print("[");
            } else {
                System.out.print(", ");
            }
            System.out.print(data[i]);
        }
        System.out.println("]");
    }

    public static int[] generateCrazyRangeArray(int size) {
        int[] crazyArray = new int[size];

        for (int i = 0; i < crazyArray.length; i++) {
            crazyArray[i] = rand.nextInt(101) - 50;
        }
        return crazyArray;
    }

    public static int countBiggerThan(int[] data, int limit) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > limit) {
                count++;
            }
        }
        return count;
    }

    public static int arraySum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public static float arrayAvg(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return (float)sum / data.length;
    }

    public static int arrayMin(int[] data) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min){
                min = data[i];
            }
        }
        return min;
    }

    public static int arrayMax(int[] data) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max){
                max = data[i];
            }
        }
        return max;
    }

    public static int arrayIndexMin(int[] data) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min){
                min = data[i];
                j = i;
            }
        }
        return j;
    }

    public static int arrayIndexMax(int[] data) {
        int max = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max){
                max = data[i];
                j = i;
            }
        }
        return j;
    }



}
