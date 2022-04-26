package murat.week6.day1;

import java.io.File;
import java.util.Scanner;

public class SearchingBiggestFile {
    public static void main(String[] args) {

        System.out.println("Please enter the path of the folder!");
        String userPath = getUserText();
        File fl = new File(userPath);

        File biggest = searchTheBiggest(fl);
        System.out.println("Biggest file size: " + biggest.length() + " Biggest File Path: " + biggest.getPath());
    }

    public static String getUserText() {

        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

    public static File searchTheBiggest(File aFile) {

        File[] listOfFiles = aFile.listFiles();
        File biggestFile = new File("");

        if (aFile.isFile()) {
            return aFile;
        }

        if (listOfFiles != null) {

            for (int i = 0; i < listOfFiles.length; i++) {
                File fileToTest = searchTheBiggest(listOfFiles[i]);

                if (fileToTest.length() > biggestFile.length()) {
                    biggestFile = fileToTest;
                }
            }
        } else {
            System.out.println("The file is not readable!");
        }
        return biggestFile;
    }
}
