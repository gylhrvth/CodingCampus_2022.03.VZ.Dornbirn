package philipp.Week04;

import java.util.Arrays;

public class CountLettersRevised {

    public static void main(String[] args) {
//        countLetters("Guten Morgen! Alles okay?");
        countLetters(lukas.week4.day4.Text.getSimpleText());
    }

    private static void countLetters(String data) {
        char[] text = data.toCharArray();

        int index = 50;
        char[] lettersTemp = new char[index];
        int[] lettersCounterTemp = new int[index];

        for (int i = 0; i < text.length; i++) {
            if (i == index) {
                index = (index * 2);
                lettersTemp = copyCharArray(lettersTemp, index);
                lettersCounterTemp = copyIntArray(lettersCounterTemp, index);
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
            } else {
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
        }

        int indexCounter = indexCounterCharArray(lettersTemp);

        char[] letters = copyCharArray(lettersTemp, indexCounter);
        int[] lettersCounter = copyIntArray(lettersCounterTemp, indexCounter);

        sortArrays(letters, lettersCounter);

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
            System.out.println(lettersCounter[i]);
        }
    }

    private static int indexCounterCharArray(char[] input) {
        int indexCounter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                break;
            }
            indexCounter++;
        }
        return indexCounter;
    }

    private static char[] copyCharArray(char[] originalChar, int indexCopyChar) {
        char[] copyChar = new char[indexCopyChar];
        int copyIndexChar = originalChar.length;
        if (indexCopyChar < originalChar.length) {
            copyIndexChar = indexCopyChar;
        }
        for (int i = 0; i < copyIndexChar; i++) {
            copyChar[i] = originalChar[i];
        }
        return copyChar;
    }

    private static int[] copyIntArray(int[] originalInt, int indexCopyInt) {
        int[] copyInt = new int[indexCopyInt];
        int copyIndexInt = originalInt.length;
        if (indexCopyInt < originalInt.length) {
            copyIndexInt = indexCopyInt;
        }
        for (int i = 0; i < copyIndexInt; i++) {
            copyInt[i] = originalInt[i];
        }
        return copyInt;
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
