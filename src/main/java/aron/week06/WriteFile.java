package aron.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteFile {

    public static void main(String[] args) {


        try {
            File f = new File("assets/tmp/aron.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(f);
            ps.println("Hello World");
            ps.close();
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();

        }
    }
}