package arda.week06.day01;

import java.io.File;
import java.util.Scanner;

public class BiggestFileSize {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String userPath = userInputPath();
        File file = new File(userPath);
        System.out.println();
        File largestFile = biggestFileSizePath(file);
        System.out.println("the largest file is: " + largestFile.getName());
        System.out.println("file size: " + largestFile.length());
    }

    //does not go into the sub directories.
    public static File biggestFileSizePath(File file) {
        File[] fileList = file.listFiles();
        File temp = null;
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].isFile()) {
                    temp = fileList[i];
                }
                if (fileList[i].isDirectory()) {
                    temp = biggestFileSizePath(fileList[i]);
                }
                if (temp.length() > file.length()) {
                    file = temp;
                }
            }
        }
        return file;
    }

    public static String userInputPath() {
        String input = "";
        while (!input.matches("([a-zA-Z]:)?(\\\\[a-zA-Z0-9_.-]+)+\\\\?")) {
            System.out.println("please enter a valid directory path");
            input = sc.nextLine();
        }
        return input;
    }
}
