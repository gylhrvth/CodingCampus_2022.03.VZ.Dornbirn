package murat.week3.day1;

public class Task8BubbleSortWithNumbersDescending {
    public static void main(String[] args) {

        // Create an initial array
        int[] muratArray = {44, 33, 21, 48, 12, 86, 4, 7, 19};

        System.out.println();
        System.out.println("Initial array: ");
        displayAnArray(muratArray);

        bubbleSort(muratArray);                         // Sort it

        System.out.println("Last array: ");
        displayAnArray(muratArray);
    }

    public static void displayAnArray(int[] anArray) {

        for (int i = 0; i < anArray.length; i++) {

            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] anArray) {

        for (int i = 0; i < anArray.length; i++) {                 // Sort it throughout its length
            for (int j = 0; j < anArray.length - 1; j++) {         // Sort it once

                if (anArray[j] < anArray[j + 1]) {                 // Ascending or descending!!!
                    int temporary = anArray[j + 1];                // Create an idle variable to store for a swap
                    anArray[j + 1] = anArray[j];                   // Swap the left to the right
                    anArray[j] = temporary;                        // Swap the right value from temporary to the left
                }
            }
        }
        return anArray;
    }
}
