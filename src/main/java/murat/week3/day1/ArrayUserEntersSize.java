package murat.week3.day1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserEntersSize {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of the array");

        int size = input.nextInt();

        int[] userArray = new int[size];

        // Count from 1 to size
        for (int i = 0; i < userArray.length; i++) {

            userArray[i] = i + 1;
            System.out.print(userArray[i]);
        }
        System.out.println();
        System.out.println("Arrays to string: " + Arrays.toString(userArray));

        // Count from size to 1
        for (int j = 0; j < userArray.length; j++) {

            userArray[j] = userArray.length - j;

            System.out.print(userArray[j]);
        }
        System.out.println();
        System.out.println("Arrays to string: " + Arrays.toString(userArray));

    }
}
