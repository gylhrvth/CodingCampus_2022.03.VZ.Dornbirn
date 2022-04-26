package aron.week06;

import java.io.File;
import java.util.Scanner;


public class SearchNameOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String listFile = "";
        while (listFile.trim().length() == 0) {
            System.out.println("Bitte geben Sie das  Verzeichnis ein: ");
            listFile = sc.nextLine();
        }

        String name = "";
        while (name.trim().length() == 0) {
            System.out.println("Bitte geben Sie den Daten Name ein: ");
            name = sc.nextLine();

            File file = new File(listFile);
            fileSearchByName(file, name);
        }
    }

    public static void fileSearchByName(File file, String criteria) {
        if (file.isFile()) {
            if (file.getName().contains(criteria)) {
                System.out.println(file.getAbsolutePath());
            }
        } else {
            File[] f = file.listFiles();
            if (f != null) {
                for (int i = 0; i < f.length; i++) {
                    fileSearchByName(f[i], criteria);
                }
            }
        }
    }
}
