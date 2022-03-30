package aron.week03;

import java.util.Arrays;

public class Arraycopy {
    public static void main(String[] args) {
        int[] testArray = new int[20];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = 1 + i;
        }

        int[] copyOfTest = makeACopy(testArray);
        copyOfTest[0] = 1;

        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(copyOfTest));
    }


    public static int[] makeACopy(int[] original) {
        int[] copyArray = new int[original.length];
        for (int k = 0; k < original.length; k++) {
            copyArray[k] = original[k];


        }
        return copyArray;
    }
}
