package arda.week05.day04;

import java.util.Arrays;
import java.util.Scanner;

public class FindLongestCommonCharChain {
    static Scanner sc = new Scanner(System.in);
    static String redBR = "\033[1;91m";
    static final String reset = "\033[0m";

    public static void main(String[] args) {
//        System.out.println("please enter your first sentence. (" + redBR + "LOWERCAPS" + reset + ")");
//        String userInput1 = LongestCommonSubString.userInput1();
//        System.out.println("please enter your second sentence. (" + redBR + "LOWERCAPS" + reset + ")");
//        String userInput2 = LongestCommonSubString.userInput2();
        //String[] input1Arr = userInput1.split("");
        //String[] input2Arr = userInput2.split("");

        //String firstCommon = findFirstCommon(input1Arr, input2Arr);
        //String restCommon = findRest(input1Arr, input2Arr);

        //String commonInbetween = findInbetween(firstCommon, lastCommon, input1Arr, input2Arr);
        //System.out.println("commons inbetween" + commonInbetween);

        String userInput1 = "Arda op";
        String userInput2 = "lrdk op";

        String restCommon = findLongesCommon(userInput1, userInput2);
        System.out.println("longest common character chain: " + redBR + restCommon + reset);

    }

    private static String findLongesCommon(String text1, String text2){
        for (int testLength = text1.length(); testLength > 0; testLength--) {
            for (int testPos = 0; testPos <= text1.length() - testLength; testPos++) {
                String textToTest = text1.substring(testPos, testPos + testLength);
                if (text2.indexOf(textToTest) > 0){
                    return textToTest;
                }
            }
        }
        return "";
    }


    public static String findFirstCommon(String[] input1Arr, String[] input2Arr) {
        //finds first common letter in both sentences.
        String firstCommon = "";
        for (int i = 0; i < input1Arr.length; i++) {
            if (input1Arr[i].equals(input2Arr[i])) {
                firstCommon = input1Arr[i];
                break;
            }
        }
        return firstCommon;
    }

    public static String findRest(String[] input1Arr, String[] input2Arr) {

        for (int i = 0; i < input1Arr.length; i++) {
            for (int j = 0; j < input2Arr.length; j++) {
                if (input1Arr[i].equals(input2Arr[j])) {

                    break;
                }
            }
        }
        return ""; // Arrays.toString(allCommons);
    }

    /*
    //this way does not work since every index is 0.
    public static String findInbetween(String firstCommon, String lastCommon, String[] in1Arr, String[] in2Arr) {
        int firstIndex = firstCommon.indexOf(firstCommon);
        int lastIndex = lastCommon.indexOf(lastCommon);
        String commonInbetween = "";

        for (int i = firstIndex; i < lastIndex; i++) {
            if (in1Arr[i].equals(in2Arr[i])) {
                commonInbetween = in1Arr[i];
                break;
            }
        }
        return commonInbetween;
    }

     */
}
