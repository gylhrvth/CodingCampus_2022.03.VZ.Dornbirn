package cemil.week07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day3FilesReader {
    public static void main(String[] args) {
        String f = "assets/tmp/output.txt";
        System.out.println(count(f, 'a'));
        System.out.println(count2(f));

    }

    public static int count2(String f) {
        int counter = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                String text = br.readLine();
                for (int i = 0; i < text.length(); i++) {
                    counter++;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }

    public static int count(String f, char ch) {
        int cou = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                String text = br.readLine();

                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == ch) {
                        cou++;
                    }
                }
            }
            br.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return cou;
    }

}

