package murat.week3.day2;

// Copyright - made by Arda and Murat
public class InsertionSort {
    public static void main(String[] args) {

        int[] initialArray = {57, 82, 25, 31, 90, 17, 42};

        System.out.println("Initial array: ");
        displayAnArray(initialArray);

        insertionSort(initialArray);

        System.out.println("Sorted array: ");
        displayAnArray(initialArray);

    }

    public static int[] insertionSort(int[] anArray) {

        // Take the next number (except the very first one, it is already sorted)
        for (int i = 1; i < anArray.length; i++) {
            int j = i;

            // Compare the new number with the numbers in the back, and sort it
            while (j > 0 && anArray[j - 1] > anArray[j]) {

                //Swap the new number with the back number
                int temporary = anArray[j];
                anArray[j] = anArray[j - 1];
                anArray[j - 1] = temporary;

                // Move backwards in each step to compare the new number with the others
                j = j - 1;
            }
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

