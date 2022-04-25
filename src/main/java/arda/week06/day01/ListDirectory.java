package arda.week06.day01;

import java.io.File;

import arda.week04.day03.BubblesortString;
import arda.week04.day03.BubblesortString.*;

public class ListDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\");
        File[] fileList = bubbleSortFiles(file);
        fileList(fileList, file);
    }

    public static void fileList(File[] fileList, File file) {
        if (file.exists() && file.isDirectory()) {
            for (int i = 0; i < fileList.length; i++) {
                System.out.printf("%-2s %-30s %20s %n", (fileList[i].isDirectory() ? "D:" : ""),
                        fileList[i].getName(), fileList[i].isDirectory() ? "" : fileList[i].length() + " KB");
            }
        }
    }

    public static File[] bubbleSortFiles(File file) {
        File[] fileList = file.listFiles();
        for (int i = 1; i < fileList.length; i++) {
            for (int j = 0; j < fileList.length - 1; j++) {
                if (!fileList[i].isDirectory()) {
                    if (fileList[j].compareTo(fileList[j + 1]) < 0) {
                        File swap = fileList[i];
                        fileList[i] = fileList[j];
                        fileList[j] = swap;
                    }
                }
            }
        }
        return fileList;
    }
}
