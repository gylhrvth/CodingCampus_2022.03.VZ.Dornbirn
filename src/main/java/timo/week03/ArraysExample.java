package timo.week03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userNumber = timo.week02.GuessTheNumber.readNumberInput(sc);

        increasingArray(userNumber);
        decreasingArray(userNumber);

        makeACopy(increasingArray(userNumber));
        makeACopy(decreasingArray(userNumber));

    }

    private static int[] increasingArray(int size) {
        int[] userArray = new int[size];
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(userArray));
        return userArray;
    }

    private static int[] decreasingArray(int number) {
        int[] userArray = new int[number];
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = number - i;
        }
        System.out.println(Arrays.toString(userArray));
        return userArray;
    }

    public static int[] makeACopy(int[] original) {
         int[] copyArray = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copyArray[i] = original[i];
        }
         return copyArray;
    }

}
