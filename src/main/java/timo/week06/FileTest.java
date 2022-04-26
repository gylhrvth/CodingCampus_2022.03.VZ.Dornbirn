package timo.week06;

import java.io.File;


public class FileTest {

    public static void main(String[] args) {
        String path = "/Users/tika/IdeaProjects/CodingCampus_2022.03.VZ.Dornbirn/src/main/java/timo";
        getFileList(path);
        System.out.println("=============================");
        System.out.println("Sum of files is: " + getSumOfFiles(new File(path)) + " bytes");
        System.out.println("Number of files: " + countFiles(new File(path)));

    }


    public static void getFileList(String path) {
        File f = new File(path);
        File[] listOfFiles = f.listFiles();

        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            sortFiles(fileList);
            printFiles(fileList);

            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    getFileList(file.getPath());
                    System.out.println("File name: " + file.getName());
                    System.out.println("File path: " + file.getAbsolutePath());
                    System.out.println();
                }
            }
        }
    }


    public static File[] swapFiles(File[] array, int indexA, int indexB) {
        File swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
        return array;
    }


    public static void sortFiles(File[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                long fileA = data[j].isDirectory() ? Long.MAX_VALUE : data[j].length();
                long fileB = data[j + 1].isDirectory() ? Long.MAX_VALUE : data[j + 1].length();
                if (fileA < fileB) {
                    swapFiles(data, j, j + 1);
                }
                if (!data[j].isDirectory() && data[j + 1].isDirectory()) {
                    swapFiles(data, j, j + 1);
                }
            }
        }
    }


    public static void printFiles(File[] fileList) {
        int counter = 0;
        long sumSize = 0;
        for (int i = 0; i < fileList.length; i++) {
            System.out.printf(
                    "%1s %-40s %10s%n",
                    (fileList[i].isDirectory() ? "D" : " "),
                    fileList[i].getName(),
                    (fileList[i].isDirectory() ? "" : Long.toString(fileList[i].length())));

            if (!fileList[i].isDirectory()) {
                counter++;
                sumSize += fileList[i].length();
            }
        }
        System.out.println();
        System.out.println("Total number of files: " + counter);
        System.out.println("Total size of files: " + sumSize + " bytes");
        System.out.println();
    }

    public static long getSumOfFiles(File f) {
        if (f.isFile()) return f.length();
        long sum = 0;
        File[] fileList = f.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                sum += getSumOfFiles(fileList[i]);
            }
        }
        return sum;
    }


    public static int countFiles(File f) {
        if (f.isFile()) return 1;

        int count = 0;
        File[] fileList = f.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                count += countFiles(fileList[i]);
            }
        }
        return count;
    }

}


