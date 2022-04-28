package sergej.week06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteMyFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\orasc\\OneDrive\\Desktop\\output.txt", true));
            //PrintStream ps = new PrintStream("C:\\Users\\orasc\\OneDrive\\Desktop\\output.txt");
            String input = " ";

            while (input.length() != 0) {
                input = sc.nextLine();
                ps.println(input);
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}

