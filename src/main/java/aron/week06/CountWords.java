package aron.week06;

import java.io.*;
import java.util.Objects;

public class CountWords {

    public static void main(String[] args) {

        Reader reader = new InputStreamReader(Objects.requireNonNull(CountWords.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        System.out.println(countLetter(reader, 'a'));
    }

    public static int countLetter(Reader reader, char c) {
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

    public static String readCompleteFile(String filename) {

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while (br.ready()) {
                sb.append(br.readLine());
                sb.append('\n');

            }
        } catch (IOException ioe) {

        }

        return sb.toString();
    }

    public static int counterLetter2(String filename, char c) {

        int count = 0;
        String filecontent = readCompleteFile(filename);
        for (int i = 0; i < filecontent.length(); i++) {
            if (filecontent.charAt(i) == c) {
                ++count;
            }

        }
        return count;
    }

    public static void generateLargeFile(String filename, long size) {
        long counter = 0;
        File f = new File(filename);
        f.getParentFile().mkdirs();
        try {
            PrintStream ps = new PrintStream(f);
            while (f.length() < size) {
                for (int i = 0; i < 10; i++) {
                    ps.println("***" + counter + "***");
                    ps.println();
                }
                ps.flush();
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}