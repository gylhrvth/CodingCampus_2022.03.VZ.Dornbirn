package arda.week09.filetraversal;

import java.io.File;

public class FileTraversal {
    public static void main(String[] args) {
        File file = new File("C:\\");
        File[] fileList = file.listFiles();
        fileLister(fileList);
    }

    public static void fileLister(File[] file) {
        if (file != null) {
            for (int i = 0; i < file.length; i++) {
                System.out.printf("%s %n", (file[i].isDirectory()) ? "D:" + file[i].getName() : (file[i].isFile()) ? "    F:" + file[i].getName() : "");
                if (file[i].isDirectory()){
                    fileLister(file[i].listFiles());
                }
            }
        }
    }
}
