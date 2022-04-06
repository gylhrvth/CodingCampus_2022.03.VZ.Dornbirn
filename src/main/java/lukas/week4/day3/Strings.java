package lukas.week4.day3;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String text = "Jimmy";
        String text2 = "Jimbo Junior";

        System.out.println("Compare value: " + text.equals(text2));

        text2 = "Jimmy";
        System.out.println("Compare value: " + text.equals(text2));

        String text3 = "Philipp";
        String text4 = "Philipp";

        System.out.println("Compare reference: " + (text3 == text4));

        text3 = text4;

        System.out.println("Compare reference: " + (text3 == text4));


        String[] names = {"Sergej", "Timo", text, "Aron", "Arda", text4, "Razvan", "Murat"};
        System.out.println(Arrays.toString(names));
        swap2(names, 0, 1);
        System.out.println(Arrays.toString(names));

        System.out.println((int) '.');
        System.out.println((int) 'A');
        System.out.println((int) 'a');

        System.out.println("A.".compareTo("AA"));

        String text6 = "Hallo Sergej wAS geHt aB?";
        System.out.println(text6.toLowerCase());

        char[] letters = text6.toCharArray();
        for (char letter : letters) {
            System.out.println(letter);
        }
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }

    private static void swap(String[] array, int indexA, int indexB) {
        String programmiererA = array[indexA];
        String programmiererB = array[indexB];
        array[indexA] = programmiererB;
        array[indexB] = programmiererA;
    }

    private static void swap2(String[] array, int indexA, int indexB) {
        String swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }
}
