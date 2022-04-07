package sergej.week04;

import java.util.Arrays;

public class BubbleStringChar {

    public static void sortString(String[] array, boolean ascending, int character) {
        boolean toBig = checkMin(array, character);

        if (!toBig) {
            System.out.println("Please enter a smaller number");
            System.out.println(Arrays.toString(array));
            return;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {


                if (ascending) {
                    if (Character.compare(array[j].charAt(character), array[j + 1].charAt(character)) > 0) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (Character.compare(array[j].charAt(character), array[j + 1].charAt(character)) < 0) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void swap(String[] array, int indexA, int indexB) {
        String swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }

    public static boolean checkMin(String[] array, int character) {
        boolean toSmall = true;
        int first = array[0].length();
        for (String s:array) {
            first = Math.min(first,s.length());
            if(first <= character){
                toSmall = false;
            }
        }
        return toSmall;
    }


    public static void main(String[] args) {

        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};

        sortString(names, true, 3);


    }
}
