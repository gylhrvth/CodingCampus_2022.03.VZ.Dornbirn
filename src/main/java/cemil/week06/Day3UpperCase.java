package cemil.week06;


import data.Texts;

import java.util.Scanner;

public class Day3UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein Word im Text ein");
        String userInput = sc.nextLine();
        String newReplace = Texts.HESSE.replace(userInput,userInput.toUpperCase());
        System.out.println(newReplace);
        String word = "Hesse";
        String replace = Texts.HESSE.replace(word,word.toUpperCase());
        System.out.print(replace);

    }
}

