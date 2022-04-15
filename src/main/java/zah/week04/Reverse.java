package zah.week04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Reverse {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        //     for (int i = 0; i < args.length; i++) {
        // System.out.println(i + ". args: " + args[i] + " is reserved: " + reverseString(args[i]));
        //   }
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10);
        }

        System.out.println(reverseString(sc));
        System.out.println(reverseRandom(sc));

    }

    public static void swap(String[] data, int letter1, int letter2) {
        String text = data[letter1];
        data[letter1] = data[letter2];
        data[letter2] = text;


    }

    public static String input1(Scanner sc) {
        System.out.println("Please enter a word:");
        String input = sc.nextLine();
        return input;
    }

    public static String reverseString(Scanner sc) {
        String text = input1(sc);
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = chars[chars.length - 1 - i];
        }

        return new String(result);
    }


    public static String reverseRandom(Scanner sc) {

        String text = input1(sc);
        char[] chars = text.toCharArray();
        for (int i = 0; i <10*  chars.length; i++) {
        }
        int firstIndex = rand.nextInt(chars.length);
        int secondIndex = rand.nextInt(chars.length);

        char temp = chars[firstIndex];
        chars[firstIndex] = chars[secondIndex];
        chars[secondIndex] = temp;


        return new String(chars);
    }


}





