package sergej.week06;

import java.io.File;

public class FileExample {

    public static void getLIstOfD(String path) {
        File f = new File(path);
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            countFiles(fileList);
            sortFiles(fileList);
            for (int i = 0; i < fileList.length; i++) {
                System.out.printf(
                        "%1s %-30s %12s%n",
                        (fileList[i].isDirectory() ? "D" : " "),
                        fileList[i].getName(),
                        (fileList[i].isDirectory() ? "" : Long.toString(fileList[i].length()))
                );
            }
        }
    }

    public static void sortFiles(File[] fileList) {
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

            }
        }
    }

    public static void swap(File[] fileList, int indexA, int indexB) {
        File swap = fileList[indexA];
        fileList[indexA] = fileList[indexB];
        fileList[indexB] = swap;
    }

    public static void countFiles(File[] fileList) {
        int counter = 0;
        long sumFiles = 0;
        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].isFile()) {
                sumFiles += fileList[i].length();
                counter++;
            }
        }
        System.out.println("Total sum of Files: " + counter);
        System.out.println("Total size of all files combined: " + sumFiles);
    }

    public static void main(String[] args) {

        File f = new File("C:\\");
        getLIstOfD("C:\\");
        System.out.println("---------");
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.isDirectory());
    }
}
