package aron.week06;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {
        File f = new File("Hello.txt");
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.isDirectory());
        File[] files = f.listFiles();

    }
}
