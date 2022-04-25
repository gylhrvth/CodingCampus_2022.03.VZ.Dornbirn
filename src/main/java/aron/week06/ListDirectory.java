package aron.week06;

import java.io.File;

public class ListDirectory {

    public static void main(String[] args) {
        listFile("C:\\");


    }

    public static void listFile(String path) {
        File f = new File(path);
        int max = 0;
        File[] fileList = f.listFiles();
        for (int i = 0; i < fileList.length; i++) {
            for (int j = 0; j < fileList.length - i - 1; j++) {
                long fileA = fileList[j].isDirectory() ? Long.MAX_VALUE : fileList[j].length();
                long fileB = fileList[j + 1].isDirectory() ? Long.MAX_VALUE : fileList[j + 1].length();
                if (fileA < fileB) {
                    swap(fileList, j, j + 1);
                }
                if (!fileList[j].isDirectory() && fileList[j + 1].isDirectory()) {
                    swap(fileList, j, j + 1);
                }
                System.out.printf("%-30s %10s%n",fileList[i].getName(),fileList[i].length());
            }
        }
    }

    public static void swap(File[] fileList, int indexA, int indexB) {
        File swap = fileList[indexA];
        fileList[indexA] = fileList[indexB];
        fileList[indexB] = swap;
    }



}

