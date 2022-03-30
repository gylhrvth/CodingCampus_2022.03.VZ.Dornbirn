package gyula.week03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temperature = {-10, 1, 5, 6, -5, 0, 2, 2, 4};

        System.out.println(temperature);
        // Print each element
        for (int i = 0; i < temperature.length; i++) {
            System.out.print(temperature[i] + " ");
        }
        System.out.println();
        // Print each element (version 2)
        System.out.println(Arrays.toString(temperature));

        ++temperature[2];
        System.out.println(Arrays.toString(temperature));

        try {
            temperature[100] = 10;
        } catch (IndexOutOfBoundsException iob){
            //aiob.printStackTrace();
            System.out.println(iob.getMessage());
        }

        int size = gyula.week02.MenuExample.readNumber(sc, "Gib mir eine Größe ein:", 1, 10);
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = 2 * i;
        }
        System.out.println(Arrays.toString(data));

        int testNumber = 5;
        int[] testArray = {5,6,7,8,9,10};
        System.out.println(testNumber);
        System.out.println(Arrays.toString(testArray));
        increaseByOne(testNumber, testArray);
        System.out.println(testNumber);
        System.out.println(Arrays.toString(testArray));

    }


    private static void increaseByOne(int testNumber, int[] testArray){
        ++testNumber;
        for (int i = 0; i < testArray.length; i++) {
            ++testArray[i];
        }
    }
}



