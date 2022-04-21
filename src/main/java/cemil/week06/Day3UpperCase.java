package cemil.week06;


import data.Texts;
import murat.easterWeek.BlackJack;

import java.util.Scanner;

public class Day3UpperCase {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein Word im Text ein");
        String userInput = sc.nextLine();
        String newReplace = Texts.HESSE.replace(userInput, ANSI_RED + userInput.toUpperCase() + ANSI_RESET);
        System.out.println(newReplace);
        String word = "Hesse";
        String replace = Texts.HESSE.replace(word, ANSI_RED + word.toUpperCase() + ANSI_RESET);
        System.out.print(replace);

    }
}

