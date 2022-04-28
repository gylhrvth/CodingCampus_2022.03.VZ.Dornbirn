package lukas.week6.day4;

import java.io.File;

public class ListDirectories {
    public static void main(String[] args) {
        printDirectories("X:\\");
    }

    public static void printDirectories(String filePath) {
        printDirectories(new File(filePath), "", 0);
    }

    private static void printDirectories(File file, String indention, int directoryLevel) {
        if(!file.exists()) {
            return;
        }
        System.out.printf("%d%s%s %s %d%n", directoryLevel, indention, file.isDirectory() ? "d" : " ", file.getName(), file.length());
        File[] fileList = file.listFiles();
        if(fileList != null) {
            for (File f : fileList) {
                printDirectories(f, indention + "-->", directoryLevel + 1);
            }
        }
    }
}
