package aron.EasternWeek;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAufgabe3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of size of array");
        size = sc.nextInt();

        int[] number = fillArr(size);
        System.out.println(Arrays.toString(number));
    }

    public static int[] fillArr(int size){
        int[] number = new int[size + 1];
        for (int i = 0 ; i < number.length; i++) {
            number[i] = i;
        }
        return number;
    }
}
