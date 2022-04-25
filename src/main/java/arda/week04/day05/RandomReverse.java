package arda.week04.day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomReverse {
    static Random rand = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverse(input));
    }

    public static String reverse(String input) {
        char[] inArr = input.toCharArray();

        for (int i = 0; i < 10 * inArr.length; i++) {
            int posFirst = rand.nextInt(inArr.length);
            int posSecond = rand.nextInt(inArr.length);

            char temp = inArr[posFirst];
            inArr[posFirst] = inArr[posSecond];
            inArr[posSecond] = temp;
        }
        return new String(inArr);
    }
}

