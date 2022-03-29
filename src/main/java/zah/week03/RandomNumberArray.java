package zah.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberArray {
    static Random rand = new Random();

    public static void main(String[] args) {
        int[] randomArray = randomNUmberArray(20);
        System.out.println(Arrays.toString(randomArray));


        printArray(randomArray);
        System.out.println(randomArray[1] + " " + randomArray[4] + " " + randomArray[9]);
        printEverySecondArray(randomArray);

        int[] crazy = crazyNUmber(10);
        printArray(crazy);

        System.out.println("Count \">30\" is " + countBiggerThen(randomArray, 30));

        System.out.println(" The sum is:" + countTheNumber(crazy));


    }

    public static int[] randomNUmberArray(int size) {
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = 1 + rand.nextInt(100);
        }
        return number;

    }

    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                System.out.print("[");
            } else {
                System.out.print(", ");
            }

            System.out.print(data[i]);

        }
        System.out.println("]");
    }


    public static void printEverySecondArray(int[] data) {
        for (int i = 1; i < data.length; i = i + 2) {
            if (i == 1) {
                System.out.print("[");
            } else {
                System.out.print(", ");
            }

            System.out.print(data[i]);

        }
        System.out.println("]");
    }

    public static int[] crazyNUmber(int size) {
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(101) - 50;

        }
        return data;
    }

    public static int countBiggerThen(int[] data, int limit) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > limit) {
                ++counter;
            }
        }
        return counter;
    }

    public static int countTheNumber(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];

        }
        return sum;
    }

}
