package sergej.week04;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    private static void testStringConcatenation() {
        int maxLength = 100000;

        long start = System.currentTimeMillis();
        String tmp = "";

        for(int i=0; i<maxLength;i++) {
            tmp += " ";
        }

        long end = System.currentTimeMillis();

        System.out.println("Simple String concatenation took: "+(end - start)+"ms.");

        start = System.currentTimeMillis();

        StringBuilder tmp2 = new StringBuilder();

        for(int i=0; i<maxLength;i++) {
            tmp2.append(" ");
        }
        int length = tmp2.toString().length();
        end = System.currentTimeMillis();

        System.out.println("StringBuilder concatenation took: "+(end - start)+"ms."+length);
    }

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
        System.out.println(rev);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseString(sc);
        testStringConcatenation();
    }
}
