package sergej.zah.week03;

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

        int[] crazy = crazyNUmber(20);
        printArray(crazy);

        System.out.println("Count \">30\" is " + countBiggerThen(randomArray, 30));

        System.out.println("The summe is:" + summeOfArray(crazy));

        System.out.println("Minimum is: " + arrayMin(randomArray));
        System.out.println("Maximum is: " + arrayMax(randomArray));
        System.out.println("Average is: " + arrayAvg(randomArray));
        System.out.println("Index minimum is:" + indexMin(randomArray));

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

    public static int summeOfArray(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];

        }
        return sum;
    }

    public static int arrayMin(int[] data) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < minimum) {
                minimum = data[i];
            }
        }
        return minimum;
    }

    public static int arrayMax(int[] data) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
            }
        }
        return maximum;
    }

    public static float arrayAvg(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return (float) sum / data.length;
    }

    public static int indexMin(int[] data) {
        int minimum = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if ( data[i] < minimum ) {
                minimum = data[i];
                index = i;
            }

        }
        return index;

    }

}

