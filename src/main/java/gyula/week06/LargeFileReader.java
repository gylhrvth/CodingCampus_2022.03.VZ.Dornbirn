package gyula.week06;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        //generateLargeFile("assets/tmp/large.txt", 1400000000);

        String filename = "assets/tmp/large.txt";
        System.out.println(countLetter(filename, 'o'));
        System.out.println(countLetter2(filename, 'o'));


    }


    public static int countLetter(String filename, char c){
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while (br.ready()){
                String line = br.readLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == c){
                        ++count;
                    }
                }
            }
        } catch (IOException ioe){

        }
        return count;
    }

    public static String readCompleteFile(String filename){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while (br.ready()){
                sb.append(br.readLine());
                sb.append('\n');
            }
        } catch (IOException ioe){

        }
        return sb.toString();
    }

    public static int countLetter2(String filename, char c){
        int count = 0;
        String fileContent = readCompleteFile(filename);
        for (int i = 0; i < fileContent.length(); i++) {
            if (fileContent.charAt(i) == c){
                ++count;
            }
        }
        return count;
    }

    public static void generateLargeFile(String filename, long size){
        String s = lukas.week4.day4.Text.getSimpleText();
        long counter = 0;
        File f = new File(filename);
        f.getParentFile().mkdirs();
        try {
            PrintStream ps = new PrintStream(f);
            while (f.length() < size) {
                for (int i = 0; i < 10; i++) {
                    ++counter;
                    ps.println("*** " + counter + " ***");
                    ps.println(s);
                }
                ps.flush();
            }
            ps.close();
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }
}
