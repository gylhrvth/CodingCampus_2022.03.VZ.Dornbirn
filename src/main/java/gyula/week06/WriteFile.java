package gyula.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteFile {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            File f = new File("assets/tmp/gyula.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(f);
            //PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\gyula.horvath\\Desktop\\gyula.txt", true));
            ps.println("Hello World!");
            ps.close();
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }
}
