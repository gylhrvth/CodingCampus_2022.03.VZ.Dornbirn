package murat.week6.day1;

import java.io.File;

public class CreateADirectoryAndSort {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Arya\\Desktop\\GIT");

        listingDirectory(file);
        System.out.println("The total size of the files is: " + theSize(file));
    }

    public static void listingDirectory(File file) {

        File[] listOfFiles = file.listFiles();
        if (file.exists() && file.isDirectory() && listOfFiles != null) {

            bubbleSortFileList(listOfFiles);
            for (int i = 0; i < listOfFiles.length; i++) {
                System.out.printf("%-30s %12s%n", listOfFiles[i].getName(),
                        listOfFiles[i].isDirectory() ? "" : listOfFiles[i].length());
            }
        }
    }

    public static void bubbleSortFileList(File[] aFileList) {

        for (int i = 0; i < aFileList.length; i++) {

            for (int j = 0; j < aFileList.length - i - 1; j++) {

                if (aFileList[j].length() < aFileList[j + 1].length()) {
                    File temp = aFileList[j + 1];
                    aFileList[j + 1] = aFileList[j];
                    aFileList[j] = temp;
                }
            }
        }
    }

    public static long theSize(File file) {

        File[] aFileList = file.listFiles();
        long sum = 0;

        if (aFileList != null) {
            for (int i = 0; i < aFileList.length; i++) {

                if (file.exists() && !aFileList[i].isDirectory()) {
                    sum += aFileList[i].length();
                }
            }
        }
        return sum;
    }
}
