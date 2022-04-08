package sergej.week04;

import java.util.Arrays;
import java.util.Scanner;

public class NewReverse {

    public static String userInput(Scanner sc) {
        System.out.println("Hello please enter something:");
        String input = sc.nextLine();
        return input;
    }

    public static void reverseString(Scanner sc) {
        String text = userInput(sc);
        char[] arr = text.toCharArray();
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                char swap = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = swap;
            }
        }
        System.out.println(arr);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        reverseString(sc);

    }
}
