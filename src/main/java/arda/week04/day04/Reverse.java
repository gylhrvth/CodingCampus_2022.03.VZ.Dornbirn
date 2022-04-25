package arda.week04.day04;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //inReverser(sc);
        System.out.println(reverse(sc));
    }

    public static void inReverser(Scanner sc) {
        System.out.println("enter something to reverse");
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[chars.length - 1 - i]);
        }
        System.out.println();

        /*
        int lastIndex = input.length() - 1;
        int firstIndex = 0;
        System.out.println("first index:" + firstIndex +" " + input + " last index:"+ lastIndex);

        for (int i = firstIndex; i < lastIndex; i++) {
            for (int j = lastIndex; j > firstIndex; j--){
                int swap = firstIndex;
                firstIndex = lastIndex;
                lastIndex = swap;
            }
        }
        System.out.println();
         */
    }


    public static String reverse(Scanner sc){
        System.out.println("enter something to reverse!");
        String text = sc.nextLine();
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[chars.length - 1 - i];
        }
        return new String(result);
    }
}
