package sergej.week03;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static int randomNum() {
        Random rand = new Random();
        int randNumber = rand.nextInt(100);

        return randNumber;
    }

    public static int[] randomList(int number) {

        int[] mylist = new int[number];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = randomNum();
        }
        System.out.println(Arrays.toString(mylist));

        return mylist;

    }

    public static void loopIndex(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(array[1] + " " + array[4] + " " + array[9]);
    }

    public static void loopIndexSecond(int[] array) {

        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }

    public static void crazyArray(int num) {

        int[] mylist = new int[num];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = -50 + randomNum();
            System.out.print(mylist[i] + " ");
        }

        //System.out.println(Arrays.toString(mylist));
    }

    public static void countHighX(int arraySize, int targetNum) {
        int counter = 0;
        int[] mylist = new int[arraySize];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = randomNum();
            if (mylist[i] > targetNum) {
                counter += 1;

            }

        }
        System.out.println(Arrays.toString(mylist));
        System.out.println(counter);
    }

    public static int counter(int[] array, int targetNum) {
        int counter = 0;
        int[] mylist = array;
        for (int i = 0; i < mylist.length; i++) {
            if (mylist[i] > targetNum) {
                counter += 1;
            }
        }
        return counter;

    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int minimum(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int maximum(int[] array) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static float meanValue(int[] array) {
        float sum = sumArray(array);
        float mean = sum / array.length;

        if (array.length == 0) {
            return Float.NaN;
        }
        return mean;
    }

    public static int getIndexMin(int[] array) {
        int minimum = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                index = i;
            }

        }
        return index;
    }

    public static int getIndexMax(int[] array) {
        int maximum = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
                index = i;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        // int[] countBeerToday = new int[0];
        //System.out.println(maximum(countBeerToday));


        int[] randomList = randomList(10);
        System.out.println(randomList);
        //loopIndex(randomList);
        //loopIndexSecond(randomList);
        //System.out.println();
        //System.out.println("Crazy Range");
        //crazyArray(10);
        //System.out.println();
        //System.out.println("count > 30");
        //System.out.println();
        //countHighX(10, 30);
        int counter = counter(randomList, 10);
        System.out.println("how manny numbers are higher then x:");
        System.out.println(counter);
        int sum = sumArray(randomList);
        System.out.println("sum of array:");
        System.out.println(sum);
        int min = minimum(randomList);
        System.out.println("Min value of array:");
        System.out.println(min);
        int max = maximum(randomList);
        System.out.println("Max value of array:");
        System.out.println(max);
        float mean = meanValue(randomList);
        System.out.println("The mean Value of the array:");
        System.out.println(mean);
        int minIndex = getIndexMin(randomList);
        System.out.println("The Index of the Minimum value :");
        System.out.println(minIndex);
        int maxIndex = getIndexMax(randomList);
        System.out.println("The Index of the Maximum value :");
        System.out.println(maxIndex);


    }
}
