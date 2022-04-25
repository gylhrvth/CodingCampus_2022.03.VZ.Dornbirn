package murat.week6.day1;

import java.io.File;
import java.util.Scanner;

public class SearchingBiggestFolder {
    public static void main(String[] args) {

        System.out.println("Please enter the path of the folder!");
        String userPath = getUserText();
        File fl = new File(userPath);

        System.out.println("The size of the folder: " + searchTheBiggest(fl));
    }

    public static String getUserText() {

        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

    public static long searchTheBiggest(File aFile) {

        File[] fileList = aFile.listFiles();
        long max = 0;
        String maxFile = "";

        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                if (!fileList[i].isDirectory()) {
                    if (fileList[i].length() > max) {
                        max = fileList[i].length();
                        maxFile = fileList[i].getName();
                    }
                }
            }
        }
        System.out.println("The biggest folder is: " + maxFile);
        return max;
    }
}
