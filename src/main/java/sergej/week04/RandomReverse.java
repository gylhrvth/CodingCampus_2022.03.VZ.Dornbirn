package sergej.week04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomReverse {
    public static String userInput(Scanner sc) {
        System.out.println("Hello please enter something:");
        String input = sc.nextLine();
        return input;

    }

    public static void reverseString(Scanner sc) {
        String text = userInput(sc);
        char[] arr = text.toCharArray();
        System.out.println(Arrays.toString(arr));

        StringBuilder rev = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            rev.append(arr[i]);
        }
        String reversed = rev.toString();
        char[] revChar = reversed.toCharArray();
        System.out.println(Arrays.toString(revChar));

        int random = randomNum(revChar.length);

        for (int i = 0; i < revChar.length - 1; i++) {
            char swap = revChar[i];
            revChar[i] = revChar[i + 1];
            revChar[i + 1] = swap;

        }
        System.out.println(revChar);

    }

    public static void swap(String[] array, int indexA, int indexB) {
        String swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }

    public static int randomNum(int input) {
        Random rand = new Random();
        int randNumber = rand.nextInt(input);

        return randNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseString(sc);

    }
}
