package philipp.week06;

import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {
        listFiles("C:\\", true);

    }

    private static void listFiles(String path, boolean asc) {
        File f = new File(path);
        if (f.exists() && f.isDirectory()) {
            File[] fileList = f.listFiles();
            /*
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].isDirectory()) {
                    System.out.printf("%-30s %10s%n",
                            fileList[i].getName(),
                            (fileList[i].isDirectory() ? "" : Long.toString(fileList[i].length()))
                    );
                }
            }
             */
            bubbleSortFilesAscDsc(fileList, asc);
            for (int i = 0; i < fileList.length; i++) {
                //if (!fileList[i].isDirectory()) {
                    System.out.printf("%-30s %10s%n",
                            fileList[i].getName(),
                            (fileList[i].isDirectory() ? "" : Long.toString(fileList[i].length()))
                    );
                //}
            }
        }
    }

    private static void bubbleSortFilesAscDsc(File[] input, boolean asc) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                long fileSizeA = input[j].isDirectory()?Long.MAX_VALUE:input[j].length();
                long fileSizeB = input[j+1].isDirectory()?Long.MAX_VALUE:input[j+1].length();
                if (asc == (fileSizeA < fileSizeB)) {
                    File swap = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = swap;
                }
            }
        }
    }
}





