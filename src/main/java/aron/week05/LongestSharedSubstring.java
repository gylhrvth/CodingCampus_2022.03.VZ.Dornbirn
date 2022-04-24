package aron.week05;

import java.util.Scanner;

public class LongestSharedSubstring {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        String text1 = "";
        while (text1.trim().length() == 0) {
            System.out.println("Bitte geben Sie den ersten Satz ein:");
            text1 = sc1.nextLine();

        }

        Scanner sc2 = new Scanner(System.in);

        String text2 = "";
        while (text2.trim().length() == 0) {
            System.out.println("Bitte geben Sie den zweiten Satz ein:");
            text2 = sc2.nextLine();

        }
        String[] wordArr1 = text1.split(" ");
        String[] wordArr2 = text2.split(" ");
        String word = "";



        for (int i = 0; i < wordArr1.length; i++) {
            for (int j = 0; j < wordArr2.length; j++) {
               if (wordArr1[i].equals(wordArr2[j]) && word.length() < wordArr1[i].length()) {

                    break;
                }

            }
        }
        System.out.println("The longest word is:" + word);


    }
}
