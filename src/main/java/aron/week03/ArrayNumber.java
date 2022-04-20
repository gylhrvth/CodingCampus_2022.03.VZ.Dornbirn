package aron.week03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ascendingNumbers(10);

    }

    public static void ascendingNumbers(int number) {
        int[] mylist = new int[number];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = i + 1;
        }
        System.out.println(Arrays.toString(mylist));
    }



}
