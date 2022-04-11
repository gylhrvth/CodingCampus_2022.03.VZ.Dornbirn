package aron.Week04;

import java.util.Arrays;
import java.util.Scanner;

public class Revers {
static Scanner sc = new Scanner(System.in);
    public static String user(Scanner sc) {
        System.out.println("write a word");
        String input = sc.nextLine();
        return input;
    }

    public static void reverse(Scanner sc) {
        String text = user(sc);
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
        reverse(sc);
    }
}




