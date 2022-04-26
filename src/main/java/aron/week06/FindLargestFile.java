package aron.week06;

import java.io.File;

import java.util.Scanner;

public class FindLargestFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String listFile = "";
        while (listFile.trim().length() == 0) {
            System.out.println("Bitte geben Sie das  Verzeichnis ein");
            listFile = sc.nextLine();
        }
        File file = new File(listFile);

        File big = largestFile(file);
        System.out.println("With " + big.length() + " bytes is the file " + big.getAbsolutePath() + " the largest.");

    }

    public static File largestFile(File file) {

        if (file.isFile()) {
            return file;
        } else {
            File largest = new File("");
            File[] f = file.listFiles();
            if (f != null) {
                for (int i = 0; i < f.length; i++) {
                    File testFile = largestFile(f[i]);

                    if (testFile.length() > largest.length()) {
                        largest =testFile;
                    }
                }
            }
            return largest;
        }
    }
}





