package cemil.Week04;

import java.util.Arrays;

public class Day4StringArray {
    public static void main(String[] args) {
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};
        System.out.println(Arrays.toString(names));
        ascendingOrDescending(names, true);
        System.out.println(Arrays.toString(names));
        ascendingOrDescending(names, false);
        System.out.println(Arrays.toString(names));
        System.out.println("***** Character Index *****");
        characterIndex(names, 1, true);
        System.out.println(Arrays.toString(names));

//        descending(names);
//        System.out.println(Arrays.toString(names));


//        int compareResult = "A".compareTo("B");
//
//        if (compareResult < 0)
//
//        System.out.println("A".compareTo("B"));
//        System.out.println("B".compareTo("A"));
//        System.out.println("A".compareTo("A"));
    }


    public static void characterIndex(String[] arr, int charIndex, boolean asd) {
        // Kann man machen um mit 1 zu beginnen muss man
        // nicht weil der charIndex immer mit null beginnt!!!!
        charIndex -= 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                String currentWord = arr[j];
                String nextWord = arr[j + 1];

                if (asd) {
                    //Aufsteigend swappen
                    if (currentWord.charAt(charIndex) > nextWord.charAt(charIndex)) {
                        swap(arr, j, j + 1);
                    }
                } else {
                    //Absteigend swappen
                    if (currentWord.charAt(charIndex) < nextWord.charAt(charIndex)) {
                        swap(arr, j, j + 1);
                    }
                }
//               Ist falsch!?!?!  Falsche klammern {}!?!?!
//               Guckstdu oben wo diese {} isch und unten diese {} isch
//                if (asd) {
//                    if (currentWord.charAt(charIndex) > nextWord.charAt(charIndex)) {
//                        swap(arr, j, j + 1);
//                    } else {
//                        if (currentWord.charAt(charIndex) < nextWord.charAt(charIndex)) {
//                            swap(arr, j, j + 1);
//                        }
//                    }
//                }
            }
        }
    }


    public static void ascendingOrDescending(String[] asc, boolean ascending) {
        for (int i = 0; i < asc.length; i++) {
            for (int j = 0; j < asc.length - 1 - i; j++) {
                String currentName = asc[j];
                String nextName = asc[j + 1];
                if (ascending) {
                    if (currentName.compareTo(nextName) > 0) {
                        swap(asc, j, j + 1);
                    }
                } else {
                    if (currentName.compareTo(nextName) < 0) {
                        swap(asc, j, j + 1);
                    }
                }

            }
        }
    }

//    public static void descending(String[] des) {
//        for (int i = 0; i < des.length; i++) {
//            for (int j = 0; j < des.length - 1 - i; j++) {
//                String currentName = des[j];
//                String nextName = des[j + 1];
//                if (currentName.compareTo(nextName) < 0) {
//                    swap(des, j, j + 1);
//                }
//
//            }
//        }
//    }

    public static void swap(String[] arr, int name1, int name2) {
        String swap1 = arr[name1];
        arr[name1] = arr[name2];
        arr[name2] = swap1;
    }
}

