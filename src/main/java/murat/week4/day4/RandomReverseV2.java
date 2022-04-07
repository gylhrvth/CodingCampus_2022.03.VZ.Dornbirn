package murat.week4.day4;

import murat.muratStandardLibrary.MuratInput;

import java.util.Random;
import java.util.Scanner;

public class RandomReverseV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Please enter your word to reverse");
        String userText = sc.nextLine();

        System.out.println("How many times do you want to shuffle? Please enter a number between [1,20]");
        int userNumber = MuratInput.readANumberFromUser(sc, 1, 20);

        //Shuffle user text x times
        for (int i = 0; i < userNumber; i++) {
            String murat = randomizedString(userText, rand);
            System.out.println(murat);
        }
    }

    public static String randomizedString(String aString, Random randNum) {

        char[] charsOfAString = aString.toCharArray();
        char[] randomCharArray = new char[charsOfAString.length];

        for (int i = 0; i < charsOfAString.length; i++) {
            int aRandomNumber;
            while (!charsOfAString[aRandomNumber].equals('a')) {
                aRandomNumber = randNum.nextInt(aString.length());
            }

            System.out.println("Random number: " + aRandomNumber);
            randomCharArray[i] = charsOfAString[aRandomNumber];
            charsOfAString[aRandomNumber] = 'a';

        }

        return new String(randomCharArray);
    }
}
