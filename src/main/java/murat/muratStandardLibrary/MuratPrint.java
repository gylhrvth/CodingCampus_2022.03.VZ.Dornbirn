package murat.muratStandardLibrary;

public class MuratPrint {
    public static void main(String[] args) {

        int[] numbers = new int[]{3, 4, 5, 7, 8};
        String[] names = new String[]{"Philipp", "Arda", "Murat", "Jimmy \"Cemil\" McGill", "Sergej", "Razvan", "Timo", "Aron", "Gyula", "Lukas"};

        printAStringArray(names, true);
        printAnIntegerArray(numbers);
    }

    public static void printAStringArray(String[] anArray, boolean horizontal) {

        if (!horizontal) {
            for (int i = 0; i < anArray.length; i++) {
                System.out.println(anArray[i]);
            }
        } else {
            for (int i = 0; i < anArray.length; i++) {
                System.out.print(anArray[i] + " ");
            }
        }

    }

    public static void printAnIntegerArray(int[] anArray) {

        for (int i = 0; i < anArray.length; i++) {

            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    }
}
