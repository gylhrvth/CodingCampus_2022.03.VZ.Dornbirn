package arda.week02.day04and05;

import java.util.Scanner;

public class CallingCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while()
        System.out.println("welcome to the calling card creator!");
        String name = userInput(sc, 30);
        String birthday = inputBirthday(sc,10);
    }

    public static String userInput(Scanner sc, int characterlength) {
        System.out.println("please enter your name full name to begin");
        String name = "";
        boolean b = true;
        while (b) {
            name = sc.nextLine();
            if (name.length() > characterlength) {
                System.out.println("your name cannot exceed" + characterlength + "characters");
            } else {
                System.out.println("nice to meet you" + name);
                b = false;
            }
        }
        return name;
    }
    public static String inputBirthday(Scanner sc, int characterlength2){
        System.out.println("please enter your date of birth");
    }
}
// todo: make user input work with custom messages and add function to next two methods also try to fit user input
// todo: into empty square
