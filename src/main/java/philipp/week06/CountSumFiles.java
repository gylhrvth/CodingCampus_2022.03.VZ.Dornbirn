package philipp.week06;

import java.io.File;

public class CountSumFiles {

    public static void main(String[] args) {
        amountOfFiles("C:\\");
        System.out.println("-----");
        sizeOfFiles("C:\\");
        System.out.println("-----");
        System.out.println("amountOfFilesRec: " + amountOfFilesRec(new File("C:\\Users\\user\\Downloads")));
        System.out.println("-----");
        System.out.println("sizeOfFilesRec: " + sizeOfFilesRec(new File("C:\\Users\\user\\Downloads")));
        System.out.println("-----");

    }

    private static void amountOfFiles(String path) {
        File f = new File(path);
        int countFiles = 0;
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].isFile()) {
                    countFiles++;
                }
            }
        }
        System.out.println(countFiles);
    }

    private static void sizeOfFiles(String path) {
        File f = new File(path);
        long sizeofFiles = 0;
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles(File::isFile);
            for (int i = 0; i < fileList.length; i++) {
                sizeofFiles = sizeofFiles + fileList[i].length();
            }
        }
        System.out.println(sizeofFiles);
    }

    private static long amountOfFilesRec(File f) {
        long countFilesRec = 0;
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    if (fileList[i].isDirectory()) {
                        countFilesRec += amountOfFilesRec(fileList[i]);
                    }
                    if (fileList[i].isFile() && !fileList[i].isDirectory()) {
                        countFilesRec++;
                    }
                }
            } else {
                System.out.println("Cannot read content of: " + f.getAbsolutePath());
            }
        }
        return countFilesRec;
    }

    private static long sizeOfFilesRec(File f) {
        long sizeOfFilesRec = 0;
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            if (fileList != null) {
                for (int i = 0; i < fileList.length; i++) {
                    if (!fileList[i].isDirectory()) {
                        sizeOfFilesRec += fileList[i].length();
                    } else {
                        sizeOfFilesRec += sizeOfFilesRec(fileList[i]);
                    }
                }
            } else {
                System.out.println("Cannot read content of: " + f.getAbsolutePath());
            }
        }
        return sizeOfFilesRec;
    }
}


