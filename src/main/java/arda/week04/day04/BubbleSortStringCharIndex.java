package arda.week04.day04;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

import static arda.week04.day03.BubblesortString.swapThingy;

public class BubbleSortStringCharIndex {
    public static void main(String[] args) {
        String[] initArr = new String[]{"Philipp", "Arda", "Murat", "Cemil", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        try {
            sortWithCharIndex(initArr, 2);
        }catch (IndexOutOfBoundsException exc){
            System.out.println("Character Index is too big or small");
            System.out.println("pick a number between 0 and 3");
        }
    }

    public static String[] sortWithCharIndex(String[] arr, int chari) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < chari) {
                System.out.println("Character Index is too big or small");
                System.out.println("pick a number between 0 and 3");
                return arr;
            }
        }
        int vergleiche = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                char arrj = arr[j].charAt(chari);
                char arrj1 = arr[j + 1].charAt(chari);
                vergleiche++;
                if (arrj > arrj1) {
                    swapThingy(arr, j, j + 1);
                }
            }
        }
        System.out.println("n=" + arr.length + " Vergleiche: " + vergleiche);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

