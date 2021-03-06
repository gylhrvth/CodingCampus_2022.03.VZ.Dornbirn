package zah.week04;

import java.util.Arrays;
import java.util.Random;

public class BubblesortmitStrings {
    public static void main(String[] args) {
        int[] data = new int[20];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length ; j++) {
            }
            data[i] = rand.nextInt(20);


        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                int number = data[j];
                int nextNUmber = data[j + 1];
                if (number < nextNUmber) {
                    swap(data, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(data));

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                int number = data[j];
                int nextNUmber = data[j + 1];
                if (number > nextNUmber) {
                    swap(data, j, j + 1);
                }
            }
        }

        System.out.println(Arrays.toString(data));
        System.out.println("----------------");
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Cemil", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas" };
        System.out.println(Arrays.toString(names));
        ascending(names);
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(names));
        descending(names);
        System.out.println(Arrays.toString(names));
        System.out.println("---------------------------");
        stringExtended(names, true);
        System.out.println(Arrays.toString(names));
        stringExtended(names, false);
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------");
        character(names,1);
        System.out.println(Arrays.toString(names));



    }


    public static void swap(int[] data, int indexA, int indexB) {
        int swap1 = data[indexA];
        data[indexA] = data[indexB];
        data[indexB] = swap1;

    }

    public static void swap2(String[] data, int name1, int name2) {
        String swap = data[name1];
        data[name1] = data[name2];
        data[name2] = swap;

    }

    public static void ascending(String[] asc) {

        for (int i = 0; i < asc.length; i++) {
            for (int j = 0; j < asc.length - 1 - i; j++) {
                String name = asc[j];
                String nextName = asc[j + 1];
                if (name.compareTo(nextName) > 0) {
                    swap2(asc, j, j + 1);
                }
            }
        }

    }

    public static void descending(String[] dsc) {

        for (int i = 0; i < dsc.length; i++) {
            for (int j = 0; j < dsc.length - 1 - i; j++) {
                String name = dsc[j];
                String nextName = dsc[j + 1];
                if (name.compareTo(nextName) < 0) {
                    swap2(dsc, j, j + 1);
                }
            }
        }

    }

    public static void stringExtended(String[] extend, boolean ascending) {
        for (int i = 0; i < extend.length; i++) {
            for (int j = 0; j < extend.length - 1 - i; j++) {
                String name = extend[j];
                String nextName = extend[j + 1];

                if (ascending) {
                    if (name.compareTo(nextName) > 0) {
                        swap2(extend, j, j + 1);
                    }
                } else {
                    if (name.compareTo(nextName) < 0) {
                        swap2(extend, j, j + 1);

                    }
                }
            }
        }

    }

    public static void character(String[] text, int charCharacter) {
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length - 1 - i; j++) {
                String name = text[j];
                String nextName = text[j + 1];
                if (name.charAt(charCharacter)>nextName.charAt(charCharacter)) {
                    swap2(text, j, j + 1);
                }
            }
        }
    }
}

