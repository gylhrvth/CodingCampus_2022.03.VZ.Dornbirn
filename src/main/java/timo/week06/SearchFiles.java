package timo.week06;

import java.io.File;
import java.util.Scanner;
import java.util.Vector;

import static timo.week06.FileTest.*;

public class SearchFiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        getLargestFile(sc);
        System.out.println();

        Vector<File> searchResult = new Vector<>();
        searchFile(new File("/Users/tika/IdeaProjects/CodingCampus_2022.03.VZ.Dornbirn/src/main/java/timo"), "er", searchResult);
        System.out.println("Found " + searchResult.size() + " matching files:");
        for (File f : searchResult) {
            System.out.println(f.getAbsolutePath());
        }


    }

    public static void getLargestFile(Scanner sc) {
        System.out.println("Enter path to check for largest file: ");
        System.out.println(">>>");
        String path = sc.nextLine();
        File f = new File(path);

        if (f.exists()) {
            File largestFile = fetchLargestFile(f);
            System.out.println();
            System.out.println("Largest file is: " + largestFile.getAbsolutePath() + " with " + largestFile.length() + " bytes");
        }
    }

    public static File fetchLargestFile(File f) {

        File largestFile = new File("");

        if (f.isFile()) {
            largestFile = f;
        } else {
            File[] data = f.listFiles();
            if (data != null) {
                for (int i = 0; i < data.length; i++) {
                    File testFile = fetchLargestFile(data[i]);
                    if (testFile.length() > largestFile.length()) {
                        largestFile = testFile;
                    }
                }
            }
        }
        return largestFile;
    }


    private static void searchFile(File f, String criteria, Vector<File> result) {
        if (f.isFile() && f.getName().contains(criteria)) {
            result.add(f);
        } else {
            File[] fileArray = f.listFiles();
            if (fileArray != null) {
                for (int i = 0; i < fileArray.length; i++) {
                    searchFile(fileArray[i], criteria, result);
                }
            }
        }
    }

}






