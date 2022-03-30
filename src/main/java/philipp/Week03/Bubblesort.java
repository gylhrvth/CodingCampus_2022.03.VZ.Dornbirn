package philipp.Week03;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Bubblesort {
    static Random rn = new Random();

    public static void main(String[] args) {
        int[] initArray = randomNo(9900, 10000001);
        sortImproved(initArray, false);

        int[] testArray = new int[initArray.length + 100];
        for (int i = 0; i < initArray.length; i++) {
            testArray[i] = initArray[i];
        }
        for (int i = initArray.length; i < testArray.length ; i++) {
            testArray[i] = rn.nextInt(10000001);
        }

        System.out.println("bubble");
        System.out.println(Arrays.toString(testArray));

        int[] bubble = testArray.clone();
        sortImproved(bubble, true);
        System.out.println(Arrays.toString(bubble));
        System.out.println();
        System.out.println("gnome");

        int[] gnome = testArray.clone();
        System.out.println(Arrays.toString(gnome));
        gnomeSort(gnome);
        System.out.println(Arrays.toString(gnome));
        System.out.println();
        System.out.println("select");

        int[] select = testArray.clone();
        System.out.println(Arrays.toString(select));
        selectionSort(select, select.length);
        System.out.println(Arrays.toString(select));
        System.out.println();

//        sortImproved(testArray, false);
//        System.out.println(Arrays.toString(testArray));
        //sort(bubble, "test");

//        selectionSort(testArray);
//        System.out.println(Arrays.toString(testArray));
    }

    private static void gnomeSort(int[] data) {
        int i = 1;
        int countOfCompare = 0;
        while (i < data.length) {
            countOfCompare++;
            if (data[i] >= data[i - 1]) {
                i++;
            } else {
                int temp = data[i];
                data[i] = data[i - 1];
                data[i - 1] = temp;
                if (i > 1) {
                    i--;
                }
            }
        }
        System.out.println("INFO: CountOfCompare is " + countOfCompare);
    }

    private static void cocktailShakerSort(int[] data) {


    }

    private static void selectionSort(int[] data, int n) {
        int countOfCompare = 0;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                countOfCompare++;
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
        System.out.println("INFO: CountOfCompare is " + countOfCompare);
    }

    private static void sortImproved(int[] data, boolean ascending) {
        int countOfCompare = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j + 1 < data.length - i; j++) {
                countOfCompare++;
                if (ascending ^ (data[j] < data[j + 1])) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            //System.out.println(Arrays.toString(data));
        }
        System.out.println("INFO: CountOfCompare is " + countOfCompare);
    }

    private static void sort(int[] data, String ascOrdsc) {
        int countOfCompare = 0;
        if (ascOrdsc.equals("asc")) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j + 1 < data.length; j++) {
                    ++countOfCompare;
                    if (data[j] > data[j + 1]) {
                        int temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        } else if (ascOrdsc.equals("dsc")) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j + 1 < data.length; j++) {
                    ++countOfCompare;
                    if (data[j] < data[j + 1]) {
                        int temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        } else {
            System.out.println("ERROR: Please enter asc or dsc into methode sort in main!");
        }
        System.out.println("INFO: CountOfCompare is " + countOfCompare);
    }

    private static int[] randomNo(int arraySize, int bound) {
        int[] randomNo = new int[arraySize];
        for (int i = 0; i < randomNo.length; i++) {
            randomNo[i] = rn.nextInt(bound);
        }
        return randomNo;
    }
}
