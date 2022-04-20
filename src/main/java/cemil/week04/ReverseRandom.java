package cemil.week04;

import java.util.Random;
import java.util.Scanner;

public class ReverseRandom {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(reverseString(sc, random));


    }

    public static String userInput(Scanner sc) {
        System.out.println("Please enter your word to reverse");
        String input = sc.nextLine();
        return input;
    }

    public static String reverseString(Scanner sc, Random rand) {
        String input = userInput(sc);
        char[] chars = input.toCharArray();
        char[] result = new char[chars.length];



        for (int i = 0; i < result.length; i++) {
            result[i] = chars[chars.length - 1 - i];


        }

        return new String(result);
    }


}
