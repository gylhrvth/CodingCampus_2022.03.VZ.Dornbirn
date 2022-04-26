package murat.week6.day2;

import java.io.File;
import java.util.Scanner;

public class SearchAFileForUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userPath = readUserText(input, "Please enter your file path.");
        File userFile = new File(userPath);
        String searchCriterion = readUserText(input, "Please enter your search criterion.");

        if (searchRecursively(userFile, searchCriterion).exists()) {
            System.out.println("Found path: " + searchRecursively(userFile, searchCriterion).getPath());
        } else {
            System.out.println("There is no such a file!");
        }

    }

    public static String readUserText(Scanner sc, String message) {

        System.out.println(message);
        String userText = sc.nextLine();
        while (userText.isEmpty()) {
            System.out.println("A value is required!");
            userText = sc.nextLine();
        }
        return userText;
    }

    public static File searchRecursively(File aFile, String searchedWord) {

        File[] listOfFiles = aFile.listFiles();
        File fileFound = new File("");
        if (aFile.isFile()) {
            return aFile;
        }

        if (listOfFiles != null) {
            for (int i = 0; i < listOfFiles.length; i++) {
                File nextFile = searchRecursively(listOfFiles[i], searchedWord);
                if (nextFile.getPath().contains(searchedWord)) {
                    fileFound = nextFile;
                }
            }
        } else {
            System.out.println("The file is not readable!");
        }

        return fileFound;
    }
}
