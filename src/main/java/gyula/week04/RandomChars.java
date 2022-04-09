package gyula.week04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomChars {
    static Random rand = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie einen Text ein:");
        System.out.print(">>> ");
        String input = sc.nextLine();

        System.out.println(randomize(input));
        System.out.println(randomize2(input));
    }

    public static String randomize(String text){
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < result.length; i++) {
            int randIndex = rand.nextInt(chars.length - i);
            result[i] = chars[randIndex];
            chars[randIndex] = chars[chars.length - 1 - i];
        }
        return new String(result);
    }

    public static String randomize2(String text){
        char[] chars = text.toCharArray();

        for (int i = 0; i < 10 * chars.length; i++) {
            int firstIndex = rand.nextInt(chars.length);
            int secondIndex = rand.nextInt(chars.length);

            char temp = chars[firstIndex];
            chars[firstIndex] = chars[secondIndex];
            chars[secondIndex] = temp;
        }
        return new String(chars);
    }


}
