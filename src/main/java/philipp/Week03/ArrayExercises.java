package philipp.Week03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Number Array countUp");
        int arraySize = readNumber(sc, "Please enter a number between 1 and 10:", "Please enter a number between 1 and 10", 0, 11);
        int[] arrayNumberUp = new int[arraySize];
        arrayNumberUp = increaseNumbers(arrayNumberUp);
        System.out.println(Arrays.toString(arrayNumberUp));
        System.out.println();

        System.out.println("Number Array countDown");
        arraySize = readNumber(sc, "Please enter a number between 1 and 10:", "Please enter a number between 1 and 10", 0, 11);
        int[] arrayNumberDown = new int[arraySize];
        arrayNumberDown = decreaseNumbers(arrayNumberDown);
        System.out.println(Arrays.toString(arrayNumberDown));
        System.out.println();

        System.out.println("Array makeCopy");
        int[] original = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(original));
        System.out.println();
        int[] copyResult = makeACopy(original);
        copyResult[0] = -1000;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copyResult));
        System.out.println();

        System.out.println("Random Number Array");
//        Random rn = new Random();
//        arraySize = 10;
        //arraySize = readNumber(sc, "Please enter a number between 1 and 10:", "Please enter a number between 1 and 10", 0, 11);

        int[] randomNo = randomNo(10, 101);
//        for (int i = 0; i < randomNo.length; i++) {
//            randomNo[i] = rn.nextInt(100);
//        }
        System.out.println(Arrays.toString(randomNo));
        System.out.println();
        for (int j : randomNo) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();

        printArray(randomNo);

        System.out.println();
        System.out.print(randomNo[2] + " ");
        System.out.print(randomNo[5] + " ");
        System.out.println(randomNo[9] + " ");
        System.out.println();

        for (int k = 0; k < randomNo.length; k = k + 2) {
            System.out.print(randomNo[k] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Random Number Array Crazy Range");
        //arraySize = readNumber(sc, "Please enter a number between 1 and 10:", "Please enter a number between 1 and 10", 0, 11);
        int[] randomCrazy = randomNo(10, 101);
        for (int i = 0; i < randomCrazy.length; i++) {
            randomCrazy[i] = rn.nextInt(101) - 50;
        }
        for (int j : randomCrazy) {
            System.out.print(j + ", ");
        }
        System.out.println();
        printArray(randomCrazy);
        System.out.println();

        System.out.println("Random Number Array Count >=30");
        //arraySize = 10;
        //arraySize = readNumber(sc, "Please enter a number between 1 and 10:", "Please enter a number between 1 and 10", 0, 11);
        int[] numbersCount = randomNo(10, 101);
//        for (int i = 0; i < numbersCount.length; i++) {
//            numbersCount[i] = rn.nextInt(101);
//        }
        System.out.println(Arrays.toString(numbersCount));
        int counter = 0;
        for (int j = 0; j < numbersCount.length; j++) {
            if (numbersCount[j] >= 30) {
                counter = counter + 1;
            }
        }
        System.out.println(counter);
        System.out.println();

        System.out.println("Random Number Array Sum");
        //arraySize = 10;
        int[] numbersSum = randomNo(10, 101);
//        for (int i = 0; i < numbersSum.length; i++) {
//            numbersSum[i] = rn.nextInt(101);
//        }
        System.out.println(Arrays.toString(numbersSum));
        int sum = 0;
        for (int k = 0; k < numbersSum.length; k++) {
            sum = sum + numbersSum[k];
        }
        System.out.println(sum);
        System.out.println();

        System.out.println("Random Number Array Min/Max/Avg");
        int[] d = randomNo(10, 101);
        System.out.println(Arrays.toString(d));
        System.out.println("Number Min: " + numberMin(d));
        System.out.println("Index Min: " + numberMinIndex(d));
        System.out.println("Number Max: " + numberMax(d));
        System.out.println("Index Max: " + numberMaxIndex(d));
        System.out.println("Number Avg: " + numberAvg(d));
    }

    private static int[] randomNo(int arraySize, int bound) {
        Random rn = new Random();
        int[] randomNo = new int[arraySize];
        for (int i = 0; i < randomNo.length; i++) {
            randomNo[i] = rn.nextInt(bound);
        }
        return randomNo;
    }

    private static void printArray(int[] arrayInput) {
        System.out.print("[");
        for (int i = 0; i + 1 < arrayInput.length; i++) {
            System.out.print(arrayInput[i] + ", ");
            if (i + 2 == arrayInput.length) {
                System.out.println(arrayInput[i + 1] + "]");
            }
        }
    }

    private static int numberMin(int[] arrayInput) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < arrayInput.length; j++) {
            if (arrayInput[j] < min) {
                min = arrayInput[j];
            }
        }
        return min;
    }

    private static int numberMinIndex(int[] arrayInput) {
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] < min) {
                min = arrayInput[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int numberMax(int[] arrayInput) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < arrayInput.length; j++) {
            if (arrayInput[j] > max) {
                max = arrayInput[j];
            }
        }
        return max;
    }

    private static int numberMaxIndex(int[] arrayInput) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] > max) {
                max = arrayInput[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static float numberAvg(int[] arrayInput) {
        int sum = 0;
        for (int j = 0; j < arrayInput.length; j++) {
            sum = sum + arrayInput[j];
        }
        return (float) sum / arrayInput.length;
    }

    private static int[] makeACopy(int[] original) {
        //int[] makeACopy = original.clone();
        int[] makeACopy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            makeACopy[i] = original[i];
        }
        return makeACopy;
    }

    private static int[] increaseNumbers(int[] arrayIncrease) {
        for (int i = 0; i < arrayIncrease.length; i++) {
            arrayIncrease[i] = i + 1;
        }
        return arrayIncrease;
    }

    private static int[] decreaseNumbers(int[] arrayDecrease) {
        for (int j = 0; j < arrayDecrease.length; j++) {
            arrayDecrease[j] = arrayDecrease.length - j;
        }
        return arrayDecrease;
    }

    private static int readNumber(Scanner sc, String inputMsg, String alertMessage, int sizeMin, int sizeMax) {
        System.out.println(inputMsg);
        int n = Integer.MIN_VALUE;
        while (n == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Integer.parseInt(text);
                if (n < sizeMin || n > sizeMax) {
                    n = Integer.MIN_VALUE;
                    System.out.println(alertMessage);
                }
            } catch (NumberFormatException nfe) {
                System.out.println(alertMessage);
            }
        }
        return n;
    }
}
