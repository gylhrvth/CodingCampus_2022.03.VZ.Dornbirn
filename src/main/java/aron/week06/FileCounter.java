package aron.week06;

import java.io.File;

public class FileCounter {

    public static void main(String[] args) {
        listFile("T:\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\aron\\");

    }


    public static void listFile(String path) {
        File f = new File(path);
        File[] fileList = f.listFiles();
        fileSort(fileList);
        printFileList(fileList);
        System.out.println("Anzahl; " + counterFile(fileList));
        System.out.println("Summe; " + sumFile(f));

    }

    public static void printFileList(File[] fileList) {
        for (int i = 0; i < fileList.length; i++) {
            System.out.printf("%-40s %12s%n",
                    fileList[i].getName(),
                    fileList[i].isDirectory() ? "" : fileList[i].length());

        }
    }

    public static void fileSort(File[] fileList) {
        for (int i = 0; i < fileList.length; i++) {
            for (int j = 0; j < fileList.length - 1 - i; j++) {
                long file1 = fileList[j].isDirectory() ? Long.MAX_VALUE : fileList[j].length();
                long file2 = fileList[j + 1].isDirectory() ? Long.MAX_VALUE : fileList[j + 1].length();
                if (file1 < file2) {
                    swap(fileList, j, j + 1);
                }
            }
        }
    }

    public static void swap(File[] fileList, int indexA, int indexB) {
        File swap = fileList[indexA];
        fileList[indexA] = fileList[indexB];
        fileList[indexB] = swap;
    }

    public static int counterFile(File[] fileList) {

        int counter = 0;
        ;
        for (int i = 0; i < fileList.length; i++) {

            counter++;
        }
        return counter;
    }

    public static long sumFile(File file) {
        long sum = 0;
        if (file.isFile()) {
            return file.length();
        } else {
            File[] fileList = file.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    sum += sumFile(fileList[i]);
                }
            } else {
                System.out.println(file.getAbsolutePath() + " is not readable.");
            }
        }
        return sum;
    }
}


