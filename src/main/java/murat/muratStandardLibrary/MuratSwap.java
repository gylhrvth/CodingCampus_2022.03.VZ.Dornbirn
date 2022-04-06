package murat.muratStandardLibrary;

public class MuratSwap {
    public static void main(String[] args) {

        int[] numbers = new int[]{3, 4, 5, 7, 8};
        String[] names = new String[]{"Innsbruck", "Bregenz", "Wien", "Salzburg", "Klagenfurt", "St.Pölten"};

        swapTwoStringsInArray(names, 0, 1);
        MuratPrint.printAStringArray(names, true);

    }

    public static void swapTwoStringsInArray(String[] anArray, int firstIndex, int secondIndex) {

        String anElement = anArray[secondIndex];
        anArray[secondIndex] = anArray[firstIndex];
        anArray[firstIndex] = anElement;
    }

}
