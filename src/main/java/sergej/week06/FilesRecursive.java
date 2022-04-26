package sergej.week06;

import java.io.File;

public class FilesRecursive {

    public static void getFilesRec(File f) {

        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            FileExample.sortFiles(fileList);

            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    getFilesRec(fileList[i]);
                    System.out.printf(
                            "%1s %-100s %12s%n",
                            (fileList[i].isDirectory() ? "D" : " "),
                            fileList[i].getAbsolutePath().substring(Math.max(0, fileList[i].getAbsolutePath().length() - 100)),
                            (fileList[i].isDirectory() ? "" : Long.toString(fileList[i].length())));
                }
            }
        }
    }


    public static int countFiles(File f) {
        int counter = 0;

        if (f.isFile()) return 1;
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    counter += countFiles(fileList[i]);
                }
            }
        }
        return counter;
    }

    public static long sumSizeFiles(File f,long filesize) {
        long sumFiles = 0;

        if(f.isFile()) return f.length();
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                        sumFiles += sumSizeFiles(fileList[i],fileList[i].length());
                }
            }
        }
        return sumFiles;
    }

    public static void main(String[] args) {

        getFilesRec(new File("C:\\Users\\orasc\\Programming\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\sergej"));
        int sumFiles = countFiles(new File("C:\\Users\\orasc\\Programming\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\sergej"));
        System.out.println("Total Sum of Files: " + sumFiles);
        long sumSizeFile = sumSizeFiles(new File("C:\\Users\\orasc\\Programming\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\java\\sergej"),0);
        System.out.println("Total sum of size all files combined: "+sumSizeFile);

    }
}
