package philipp.Week04;

import java.util.Arrays;

public class CountLetters {

    public static void main(String[] args) {
//        countLetters("Guten Morgen! Alles okay?");
        countLetters(lukas.week4.day4.Text.getSimpleText());

    }

    private static void countLetters(String data) {
        char[] text = data.toCharArray();
        char[] lettersTemp = new char[text.length];
        int[] lettersCounterTemp = new int[text.length];

        for (int i = 0; i < text.length; i++) {
            int j = 0;
            while (true) {
                if (lettersTemp[j] == text[i]) {
                    lettersCounterTemp[j]++;
                    break;
                } else if (lettersTemp[j] == 0) {
                    lettersTemp[j] = text[i];
                    lettersCounterTemp[j]++;
                    break;
                } else {
                    j++;
                }
            }
        }

        int indexCounter = 0;
        for (int i = 0; i < lettersTemp.length; i++) {
            if (lettersTemp[i] == 0) {
                break;
            }
            indexCounter++;
        }
        char[] letters = new char[indexCounter];
        int[] lettersCounter = new int[indexCounter];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = lettersTemp[i];
            lettersCounter[i] = lettersCounterTemp[i];
        }
        sortArrays(letters, lettersCounter);

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
            System.out.println(lettersCounter[i]);
        }
    }

    private static void sortArrays(char[] inputLetters, int[] inputCounter) {
        for (int i = 0; i < inputLetters.length - 1; i++) {
            for (int j = 0; j < inputLetters.length - 1 - i; j++) {
                if (inputLetters[j] > inputLetters[j + 1]) {
                    char swap = inputLetters[j];
                    inputLetters[j] = inputLetters[j + 1];
                    inputLetters[j + 1] = swap;

                    int swapInt = inputCounter[j];
                    inputCounter[j] = inputCounter[j + 1];
                    inputCounter[j + 1] = swapInt;
                }
            }
        }
    }
}
