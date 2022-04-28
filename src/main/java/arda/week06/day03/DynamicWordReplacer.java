package arda.week06.day03;

import java.io.*;
import java.util.Scanner;

public class DynamicWordReplacer {
    static String RESET = "\033[0m";
    static String RED = "\033[0;91m";

    public static void main(String[] args) {
        wordReplace("/intellij/FileRead/readme.txt");
    }

    public static void wordReplace(String filePath) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word you would like to replace.");
        String replacedWord = sc.nextLine();
        System.out.println("now enter the word you would like to replace it with");
        String word = sc.nextLine();
        String result = "";
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();
                String replacedLine = line.replaceAll("[!?,.]+", " ");
                String[] splitLine = replacedLine.split(" ");
                for (int i = 0; i < splitLine.length; i++) {
                    if (replacedWord.equals(splitLine[i])) {
                        System.out.println(replacedLine.replaceAll(replacedWord, RED + word + RESET));
                    }
                }
            }
        } catch (IOException exc) {
            System.out.println("cannot find file!");
        }
    }
}
