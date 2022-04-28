package zah.week06;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CountLetterWithBuufferOrScanner {
    public static void main(String[] args) {
        String text = "assets/tmp/output.txt";
        char[] charsToCount = new char[]{'a', 'x', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'};
        System.out.println(countLetter(text));
        System.out.println(countLetter2(text, 'e'));
        System.out.println(countLetter3(text, charsToCount));
        System.out.println(Arrays.toString(countLetter4(text, charsToCount)));

    }

    public static int countLetter(String text) {

        int count = 0;
        try {
            File f = new File("assets/tmp/output.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String line = sc.next();
                for (int i = 0; i < line.length(); i++) {
                    count++;

                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;

    }

    public static int countLetter2(String text, char ch) {
        int cout = 0;
        try {
            FileReader fr = new FileReader("assets/tmp/output.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        cout++;
                    }


                }
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cout;
    }

    public static int countLetter3(String text, char[] ch) {
        int cout = 0;
        try {
            FileReader fr = new FileReader("assets/tmp/output.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();

                for (int i = 0; i < line.length(); i++) {
                    for (int j = 0; j < ch.length; j++) {
                        if (line.charAt(i) == ch[j]) {
                            cout++;
                        }
                    }
                }
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cout;
    }

    public static int[] countLetter4(String text, char[] ch) {
        int[] cout = new int[ch.length];
        try {
            FileReader fr = new FileReader("assets/tmp/output.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();

                for (int i = 0; i < line.length(); i++) {
                    for (int j = 0; j < ch.length; j++) {
                        if (line.charAt(i) == ch[j]) {
                            cout[j]++;
                        }
                    }
                }
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cout;
    }
}
