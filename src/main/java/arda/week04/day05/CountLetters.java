package arda.week04.day05;

import java.util.Arrays;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println("welcome to the letter counter!\nplease enter a word/sentence.");
        char[] inArr = inToArr();
        char[] alphabet = alphabet();
        char[] bigAlphabet = bigAlphabet();
        countLetters(inArr, alphabet, bigAlphabet);
    }

    public static char[] inToArr() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input.toCharArray();
    }

    public static void countLetters(char[] inArr, char[] alphabet, char[] bigAlphabet) {
        int letterCount = 0;
        for (int i = 0; i < inArr.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (inArr[i] == alphabet[j]) {
                    letterCount++;
                }else if (inArr[i] == alphabet[0]){

                }
            }
        }
        for (int i = 0; i < inArr.length; i++) {
            for (int j = 0; j < bigAlphabet.length; j++) {
                if (inArr[i] == bigAlphabet[j]){
                    letterCount++;
                }
            }
        }
        /*
        String str = Arrays.toString(inArr);
        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i)]++;
        }
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == ch[j]){
                    find++;
                }
            }
            if (find == 1){
                System.out.println(str.charAt(i) + " = " + alphabet[str.charAt(i)]);
            }
        }
        */
        System.out.println("your word/sentence has: " + letterCount + " letters!");
    }

    public static char[] alphabet() {
        char[] alphabet = new char[26];
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet[ch - 'a'] = ch;
        }
        return alphabet;
    }

    public static char[] bigAlphabet() {
        char[] bigAlphabet = new char[26];
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            bigAlphabet[ch - 'A'] = ch;
        }
        return bigAlphabet;
    }
}
