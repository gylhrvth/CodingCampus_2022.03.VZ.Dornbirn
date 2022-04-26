package zah.week06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteFileExample {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            //PrintStream ps = new PrintStream("C:\\Users\\gyula.horvath\\Desktop\\gyula.txt");
            PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\zah_r\\Desktop\\text\\Razvan.txt", true));
            ps.println("Hello !");
            ps.close();
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }
}
