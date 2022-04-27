package arda.week06.day03;

import java.io.*;
import java.util.Scanner;

public class DynamicLetterCount {
    static String RESET = "\033[0m";
    static String RED = "\033[0;91m";
    public static void main(String[] args) {
        countInstanceOfWord("/intellij/FileRead/readme.txt");
    }
    public static void countInstanceOfWord(String filepath){
        System.out.println("enter the word you would like to count.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String time = "";
        int counter = 0;
        try{
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()){
                String readline = br.readLine();
                System.out.println(readline);
                if (readline.contains(input)){
                    counter++;
                }
            }
            br.close();
        }catch (FileNotFoundException exc){
            System.out.println("file could not have been found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (counter > 1){
            time = "times";
        }else{
            time = "time";
        }
        System.out.println("the word: " + RED + input + RESET + " appears: " + RED + counter + RESET + " " + time + ".");
    }
}
