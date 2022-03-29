package murat.week3.day2;

// Copyright: Made by Arda and Murat!
public class SelectionSort {
    public static void main(String[] args) {

        int[] initialArray = {57, 82, 25, 31, 90, 17, 42};

        System.out.println("Initial array: ");
        displayAnArray(initialArray);

        selectionSort(initialArray);

        System.out.println("Sorted array: ");
        displayAnArray(initialArray);

    }

    public static int[] selectionSort(int[] anArray) {

        int counter = 0;
        for (int i = 0; i < anArray.length; i++) {

            int min = i;   // Starting from the beginning to scan the other numbers

            for (int j = i + 1; j < anArray.length; j++) {

                // If we find a new minimum, assign its location as the new min.
                if (anArray[j] < anArray[min]) {
                    min = j;
                }
            }

            // Swap min with index
            int temporary = anArray[min];
            anArray[min] = anArray[i];
            anArray[i] = temporary;
        }
        return anArray;
    }

    public static void displayAnArray(int[] anArray) {

        for (int i = 0; i < anArray.length; i++) {

            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    }
}
