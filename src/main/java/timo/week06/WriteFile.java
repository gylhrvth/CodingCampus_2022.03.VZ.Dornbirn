package timo.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            File f = new File("assets/tmp/timo.txt");
            System.out.println(f.getAbsolutePath());
            File dir = new File(f.getParent());
            System.out.println(dir.getAbsolutePath());
            dir.mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));

            System.out.println("Please enter text: ");
            System.out.println(">>>");
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
