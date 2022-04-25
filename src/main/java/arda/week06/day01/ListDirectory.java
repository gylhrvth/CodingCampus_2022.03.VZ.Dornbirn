package arda.week06.day01;

import java.io.File;

import arda.week04.day03.BubblesortString;
import arda.week04.day03.BubblesortString.*;

public class ListDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\");
        File[] fileList = file.listFiles();
        bubbleSortFiles(fileList);
        fileList(fileList);
        System.out.println();
        countAmountOfFiles(fileList);
        System.out.println();
        sumOfFileSize(fileList);
    }

    public static void fileList(File[] fileList) {
        for (int i = 0; i < fileList.length; i++) {
            System.out.printf("%-2s %-30s %20s %n", (fileList[i].isDirectory() ? "D:" : ""),
                    fileList[i].getName(), fileList[i].isDirectory() ? "" : fileList[i].length());
        }
    }

    public static void bubbleSortFiles(File[] fileList) {
        for (int i = 1; i < fileList.length; i++) {
            for (int j = 0; j < fileList.length - 1; j++) {
                Long fileJ = fileList[j].isDirectory()?Long.MAX_VALUE:fileList[j].length();
                Long fileJnext = fileList[j + 1].isDirectory()?Long.MAX_VALUE:fileList[j + 1].length();
                if (fileJ < fileJnext) {
                    File swap = fileList[j];
                    fileList[j] = fileList[j+1];
                    fileList[j+1] = swap;
                }
            }
        }
    }

    public static void countAmountOfFiles(File[] fileList) {
        System.out.printf("== %s == %n", "file count");
        int counter = 0;
        for (int i = 0; i < fileList.length; i++) {
            if (!fileList[i].isDirectory()) {
                counter++;
            }
        }
        System.out.println("amount of files in the directory: " + counter);
    }

    public static void sumOfFileSize(File[] fileList) {
        System.out.printf("== %s == %n", "file sum");
        long sum = 0;
        for (int i = 0; i < fileList.length; i++) {
            if (!fileList[i].isDirectory()) {
                sum += fileList[i].length();
            }
        }
        System.out.println("sum of all files in the directory " + sum);
    }
}
