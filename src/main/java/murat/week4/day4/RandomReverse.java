package murat.week4.day4;

import murat.muratStandardLibrary.MuratInput;
import murat.muratStandardLibrary.MuratSwap;

import java.util.Random;
import java.util.Scanner;

// Creates 2 random numbers and shuffles the positions of letters in the user text.
// User decides how many times the program shuffles
public class RandomReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Please enter your word to reverse");
        String userText = sc.nextLine();

        System.out.println("How many times do you want to shuffle? Please enter a number between [1,20]");
        int userNumber = MuratInput.readANumberFromUserWithMaxValue(sc, 1, 20);

        //Shuffle user text x times
        for (int i = 0; i < userNumber; i++) {
            String murat = reverseString(userText, rand);
            System.out.println(murat);
        }

    }

    public static String reverseString(String aString, Random randNum) {

        char[] charsOfAString = aString.toCharArray();

        // Generate two numbers
        int firstRandNum = randNum.nextInt(aString.length());
        int secRandNum = randNum.nextInt(aString.length());

        char first = charsOfAString[firstRandNum];
        charsOfAString[firstRandNum] = charsOfAString[secRandNum];
        charsOfAString[secRandNum] = first;

        return new String(charsOfAString);
    }
}
