package philipp.Week04;

import java.util.Random;
import java.util.Scanner;

public class ReverseStringExercises {
    static Scanner sc = new Scanner(System.in);
    static Random rn = new Random();

    public static void main(String[] args) {
//        reverseString();
        reverseStringRandom();
    }

    private static void reverseStringRandom() {
        String word = readString(sc, "Please enter a word to random reverse:");
//        int shuffleTimes = readNumber(sc, "How many times you want to shuffle? (1 to 20)",
//                "Please enter a correct number", 1, 20);
//        String revRanWord = randomReversedWord(word, shuffleTimes);
        String revRanWord2 = randomReversedWord2(word);
        System.out.println("Random reversed: ");
//        System.out.println(revRanWord);
        System.out.println(revRanWord2);
    }

    private static String randomReversedWord2(String input) {
        char[] inputWord = input.toCharArray();
        char[] temp = new char[inputWord.length];
//        version Gyula
        int inputUsableLength = inputWord.length;
        for (int indexTemp = 0; indexTemp < inputWord.length; indexTemp++) {
            int indexInput = rn.nextInt(inputUsableLength);
            temp[indexTemp] = inputWord[indexInput];
            inputWord[indexInput] = inputWord[inputUsableLength - 1];
            --inputUsableLength;
        }
//        version Philipp
//        for (int i = 0; i < inputWord.length; i++) {
//            int indexA = rn.nextInt(inputWord.length);
//            while (true) {
//                if (temp[indexA] == 0) {
//                    temp[indexA] = inputWord[i];
//                    break;
//                } else {
//                    indexA = rn.nextInt(inputWord.length);
//                }
//            }
//        }
//        System.out.println(temp);
        return new String(temp);
    }

    private static String randomReversedWord(String input, int shuffleTimes) {
        char[] inputWord = input.toCharArray();
        char[] temp = new char[inputWord.length];
        for (int i = 0; i <= shuffleTimes; i++) {
            int indexA = rn.nextInt(inputWord.length);
            int indexB = rn.nextInt(inputWord.length);
            char swap = inputWord[indexA];
            inputWord[indexA] = inputWord[indexB];
            inputWord[indexB] = swap;
        }
//        System.out.println(input);
        return new String(inputWord);
    }

    private static void reverseString() {
        String word = readString(sc, "Please enter a word to reverse:");
        String revWord = reversedWord(word);
        System.out.print("Reversed:  ");
        System.out.println(revWord);
    }

    private static String reversedWord(String input) {
        char[] inputWord = input.toCharArray();
        for (int i = 0; i < inputWord.length / 2; i++) {
            char swap = inputWord[i];
            inputWord[i] = inputWord[inputWord.length - 1 - i];
            inputWord[inputWord.length - 1 - i] = swap;
        }
        String revWo = new String(inputWord);
        return revWo;
    }

    private static String readString(Scanner sc, String inputMsc) {
        System.out.println(inputMsc);
        String text = sc.nextLine();
        return text;
    }

    private static int readNumber(Scanner sc, String inputMsc, String alertMessage, int sizeMin, int sizeMax) {
        System.out.println(inputMsc);
        int n = Integer.MIN_VALUE;
        while (n == Integer.MIN_VALUE) {
            try {
                String text = sc.nextLine();
                n = Integer.parseInt((text));
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
