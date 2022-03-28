package cemil.week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

//        int[] testArray = generateArrayWithUserInput();
//        System.out.println(Arrays.toString(testArray));

        int[] increasing = generateArrayWithIncreasingValues(20);
        System.out.println(Arrays.toString(increasing));

        int[] decreasing = generateArrayWithDecreasingValues(10);
        System.out.println(Arrays.toString(decreasing));

        int[] makeCopy = makeCopy(10);
        System.out.println(Arrays.toString(makeCopy));
        System.out.println("CopyOrginals" + " " + Arrays.toString(increasing));

        int[] random = random(2);
        System.out.println(Arrays.toString(random));


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

    public static int[] random(int size) {
        int[] result = new int[size];
        Random random = new Random();
        size = random.nextInt() + 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = size;
        }
        return result;
    }

}

