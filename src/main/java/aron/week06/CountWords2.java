package aron.week06;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class CountWords2 {

    public static void main(String[] args) {

        int count = 0;
        Reader reader = new InputStreamReader(Objects.requireNonNull(CountWords2.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        Scanner sc = new Scanner(reader);

        while (sc.hasNext()) {
            String text = sc.next();
            count++;
//                System.out.printf("%-19s %5d\n", text, count);
        }
        System.out.println("Es sind " + count + " Wörter im Text");
    }

    public static int counter(Reader reader, char c) {
        BufferedReader br = null;
        int count = 0;
        try {
            br = new BufferedReader(reader);
            while (br.ready()) {
                String line = br.readLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == c) {
                        ++count;
                    }
                }
            }
        } catch (IOException e) {
            //noop
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    //noop
                }
            }
        }
        return count;
    }
}
