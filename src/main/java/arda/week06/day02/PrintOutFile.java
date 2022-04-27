package arda.week06.day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintOutFile {
    public static void main(String[] args) {
        printStream();
    }

    public static void printStream() {
        try {
            File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2022.03.VZ.Dornbirn\\assets\\tmp");
            file.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(file);
            ps.println("hello!");
            ps.close();
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
