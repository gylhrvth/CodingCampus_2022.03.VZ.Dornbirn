package sergej.zah.week03;

import java.util.Arrays;
import java.util.Scanner;

public class FirstExample {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] incArray = increasByOne(10);
        System.out.println(Arrays.toString(incArray));

        int[] decArray = decreasByOne(20);
        System.out.println(Arrays.toString(decArray));


        int[] copyOfDecArray = makeCopy(decArray);
        copyOfDecArray[0] = 20;
        System.out.println(Arrays.toString(incArray));
        System.out.println(Arrays.toString(decArray));

    }

    public static int[] increasByOne(int size) {
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }

        return data;
    }

    public static int[] decreasByOne(int size) {
        int[] data1 = new int[size];
        for (int i = 0; i < data1.length; i++) {
            data1[i] = data1.length - i;

        }

        return data1;

    }


    public static int[] makeCopy(int[] original) {
        int[] makeRow = new int[original.length];
        for (int i = 0; i < original.length ; i++) {
            makeRow[i]=original[i];
        }

        return makeRow;
    }


}



