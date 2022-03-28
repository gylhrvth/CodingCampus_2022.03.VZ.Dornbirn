package arda.week03.day01;

import java.util.Arrays;

public class CopyArrayParameter {
    public static void main(String[] args){
        int[] original = {2,3,3,4,6,7};
        int[] copyOf = copy(original);

        copyOf[0] = -100;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copyOf));
    }

    public static int[] copy(int[] original){
        int[] result = new int[original.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = original[i];
        }
        return result;
    }
}