package murat.week6.day1;

import java.io.File;

public class CountFolders {
    public static void main(String[] args) {

        File fl = new File("C:\\Users\\Arya\\Desktop\\GIT");

        System.out.println(recursive(fl));

    }

    public static int recursive(File file) {

        if (file.isFile()) {
            return 1;
        }

        File[] listOfFiles = file.listFiles();
        int counter = 0;
        if (listOfFiles != null) {

            for (int i = 0; i < listOfFiles.length; i++) {

                counter += recursive(listOfFiles[i]);
                System.out.println("i: " + i + " counter " + counter + " Path: " + file.getPath());
            }
        }

        return counter;
    }
}
