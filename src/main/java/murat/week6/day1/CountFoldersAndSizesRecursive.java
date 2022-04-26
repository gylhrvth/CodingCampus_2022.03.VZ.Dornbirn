package murat.week6.day1;

import java.io.File;

public class CountFoldersAndSizesRecursive {
    public static void main(String[] args) {

        File fl = new File("C:\\Users\\Arya\\Desktop\\GIT");

        System.out.println("The number of files: " + recursiveNumberOfFiles(fl));
        System.out.println("The sum of the file sizes: " + recursiveSizeOfFiles(fl));

    }

    public static int recursiveNumberOfFiles(File file) {

        File[] listOfFiles = file.listFiles();
        int counter = 0;

        if (file.isFile()) {
            return 1;
        }

        if (listOfFiles != null) {

            for (int i = 0; i < listOfFiles.length; i++) {

                counter += recursiveNumberOfFiles(listOfFiles[i]);
                // System.out.println("i: " + i + " Counter " + counter + " Path: " + file.getPath());
            }
        } else {
            System.out.println("File ist not readable.");
        }

        return counter;
    }

    public static long recursiveSizeOfFiles(File file) {

        File[] listOfFiles = file.listFiles();
        long sum = 0;

        if (file.isFile()) {
            return file.length();
        }

        if (listOfFiles != null) {

            for (int i = 0; i < listOfFiles.length; i++) {

                sum += recursiveSizeOfFiles(listOfFiles[i]);
                // System.out.println("i: " + i + " File_length " + file.length() + " Path: " + file.getPath());
            }
        } else {
            System.out.println("File ist not readable.");
        }

        return sum;
    }
}
