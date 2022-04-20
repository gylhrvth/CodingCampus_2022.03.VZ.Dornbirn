package sergej.week04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NewRandom {

    public static String userInput(Scanner sc) {
        System.out.println("Hello please enter something:");
        String input = sc.nextLine();
        return input;

    }

    public static void reverseString(Scanner sc) {
        String text = userInput(sc);
        char[] arr = text.toCharArray();
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length * 10; i++) {
            int randomRight = randomNum(arr.length);
            int randomLeft = randomNum(arr.length);
            char swap = arr[randomLeft];
            arr[randomLeft] = arr[randomRight];
            arr[randomRight] = swap;
        }

        System.out.println(arr);
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
