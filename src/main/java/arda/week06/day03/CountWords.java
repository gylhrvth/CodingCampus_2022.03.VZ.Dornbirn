package arda.week06.day03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {
        countWords("/intellij/FileRead/readme.txt");
    }
    public static void countWords(String filePath){
        int counter = 0;
        String line = "";
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()){
                line = br.readLine();
                System.out.println(line);
                if (!line.isBlank()){
                    String[] word = line.split(" ");
                    counter += word.length;
                }
            }
            br.close();
            System.out.println(counter);
        }catch (FileNotFoundException exc){
            System.out.println("the file could not be found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
