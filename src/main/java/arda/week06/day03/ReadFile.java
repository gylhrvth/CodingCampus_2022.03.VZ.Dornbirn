package arda.week06.day03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try {
            FileReader fr = new FileReader("/intellij/FileRead/readme.txt");
            BufferedReader br = new BufferedReader(fr);

            String rad = br.readLine();
            System.out.println(rad);
            br.close();

        } catch (FileNotFoundException exc) {
            System.out.println("could not find file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
