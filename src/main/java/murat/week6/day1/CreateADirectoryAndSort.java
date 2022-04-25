package murat.week6.day1;

import java.io.File;

public class CreateADirectoryAndSort {
    public static void main(String[] args) {

        File file = new File("C:\\");
        File[] listOfFiles = file.listFiles();

        if (file.exists() && file.isDirectory()) {
            listingDirectory(file, listOfFiles);

            System.out.println("The number of files: " + listOfFiles.length + " and volume: " + theVolumeOfTheDirectory(listOfFiles));
        }
    }

    public static void listingDirectory(File file, File[] aFileList) {

        if (file.exists() && file.isDirectory()) {

            bubbleSortFileList(aFileList);

            for (File value : aFileList) {
                System.out.printf("%-30s %12d%n", value.getName(), value.length());
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

    public static long theVolumeOfTheDirectory(File[] aFileList) {

        long sum = 0;

        for (File file : aFileList) {
            sum += file.length();
        }
        return sum;
    }
}
