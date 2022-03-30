package cemil.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day1 {
    private static Random rand = new Random();


    public static int randomNum() {
        return rand.nextInt(100);
    }


    public static void main(String[] args) {

//        int[] testArray = generateArrayWithUserInput();
//        System.out.println(Arrays.toString(testArray));

//        int[] increasing = generateArrayWithIncreasingValues(20);
//        System.out.println(Arrays.toString(increasing));
//
//        int[] decreasing = generateArrayWithDecreasingValues(10);
//        System.out.println(Arrays.toString(decreasing));
//
//        int[] makeCopy = makeCopy(10);
//        System.out.println(Arrays.toString(makeCopy));
//        System.out.println("CopyOrginals" + " " + Arrays.toString(increasing));
        System.out.println();

        int[] randomArray = generateRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        printMyArray(randomArray);
        printEverySecond(randomArray);
        System.out.println("[" + randomArray[1] + ", " + randomArray[4] + ", " + randomArray[9] + "]");
        System.out.println();
        System.out.println("Die Summe ist:" + sumArray(randomArray) + " (generateRandomArray)");
        System.out.println();

//        int[] random1 = crazyArrays(10);
//        System.out.println(Arrays.toString(random1));
//        System.out.println();


        System.out.println("Count Values over 30. Count: " + counterHigherThan(randomArray, 30));
        System.out.println();


    }


    public static int[] generateArrayWithUserInput() {
        Scanner sc = new Scanner(System.in);
        int[] testArray = new int[5];
        for (int i = 0; i < testArray.length; i++) {
            System.out.println("Gib mir die " + i + ". Zahl: ");
            testArray[i] = Integer.parseInt(sc.nextLine());
        }
        return testArray;
    }

    public static int[] generateArrayWithIncreasingValues(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = 1 + i;
        }
        return result;
    }

    public static int[] generateArrayWithDecreasingValues(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = size - i;
        }
        return result;
    }

    public static int[] makeCopy(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = 1 + i;
        }
        return result;
    }

    public static int[] generateRandomArray(int size) {
        int[] result = new int[size];

        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(100) + 1;
        }
        return result;
    }

    public static int[] crazyArrays(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = -50 + randomNum();

        }
        return result;
    }

    public static int counterHigherThan(int[] data, int target) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > target) {
                counter += 1;
            }
        }
        return counter;
    }


    public static void printMyArray(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(data[i]);
        }
        System.out.println("]");
    }

    public static void printEverySecond(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i += 2) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(data[i]);
        }
        System.out.println("]");
    }

    public static int sumArray(int[] sumA) {
        int sum = 0;
        for (int i = 0; i < sumA.length; i++) {
            sum += sumA[i];
        }
        return sum;
    }

//    public static int minValueMaxValueAverageValue(int[] arrays, int minV, int maxV, int aveV){
//
//    }

}


