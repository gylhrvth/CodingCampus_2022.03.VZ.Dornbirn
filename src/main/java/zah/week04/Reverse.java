package zah.week04;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
           // System.out.println(i + ". args: " + args[i] + " is reserved: " + reverseString(args[i]));
        }
        System.out.println(reverseString(sc));
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

    public static String reverseString(Scanner sc){
        String text= input1(sc);
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = chars[chars.length - 1 - i];
        }

        return new String(result);
    }
}




