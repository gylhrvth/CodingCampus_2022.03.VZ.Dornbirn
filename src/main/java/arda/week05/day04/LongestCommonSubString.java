package arda.week05.day04;

import java.util.Scanner;

public class LongestCommonSubString {
    static Scanner sc = new Scanner(System.in);
    static String redBR = "\033[1;91m";
    static final String reset = "\033[0m";

    public static void main(String[] args) {

        System.out.println("please enter you first sentence. (" + redBR + "LOWERCAPS" + reset + ")");
        String input1 = userInput1();
        System.out.println("now enter your second sentence. (" + redBR + "LOWERCAPS" + reset + ")");
        String input2 = userInput2();
        String commonWord = findLongestCommonWord(input1, input2);
        ifNoCommonWord(commonWord);

    }

    public static String userInput1() {
        return sc.nextLine();
    }

    public static String userInput2() {
        return sc.nextLine();
    }

    public static String findLongestCommonWord(String input1, String input2) {
        String[] input1Arr = input1.split(" ");
        String[] input2Arr = input2.split(" ");
        String commonWord = "";
        for (int i = 0; i < input1Arr.length; i++) {
            for (int j = 0; j < input2Arr.length; j++) {
                if (input1Arr[i].equals(input2Arr[j]) && commonWord.length() <= input1Arr[i].length()) {
                    commonWord = input1Arr[i];
                    break;
                }
            }
        }
        return commonWord;
    }

    public static void ifNoCommonWord(String word) {
        if (word.length() > 0) {
            System.out.println("the longest common word is: " + redBR + word + reset);
        }else{
            System.out.println("the is no " + redBR + "longest common word!" + reset);
        }
    }
}