package aron.Week04;


import java.util.Arrays;
import java.util.Random;

public class BubblesortWithStringCharacterIndex {


    public static void main(String[] args) {

        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        System.out.println(Arrays.toString(names));
        Character(names,3);
    }

    public static void Character(String[] names, int index) {

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                String currentname = names[j];
                String nextname = names[j + 1];
                if (currentname.charAt(index-1) > nextname.charAt(index-1)) {
                    swap(names, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }

    private static void swap(String[] array, int right, int left) {
            String swap = array[right];
            array[right] = array[left];
            array[left] = swap;

    }
}

