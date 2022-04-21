package cemil.week04;

import java.util.Arrays;
import java.util.Scanner;

public class Day5Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = userInput(sc);
        System.out.println(reverseString(text));


    }

    public static String userInput(Scanner sc) {
        System.out.println("Please enter your word to reverse");
        String input = sc.nextLine();
        return input;
    }


    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = chars[chars.length - 1 - i];
        }

        return new String(result);
    }


}