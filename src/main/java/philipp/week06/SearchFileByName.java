package philipp.week06;

import java.io.File;
import java.util.Scanner;

public class SearchFileByName {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        File path = userInputPath(sc, "Please enter the path for searching:");
        String searchTerm = userInputSearch(sc, "Please enter the search phrase:");
        searchFile(path, searchTerm);

    }

    private static void searchFile(File path, String searchTerm) {
        File[] fileList = path.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].isDirectory()) {
                    searchFile(fileList[i], searchTerm);
                }
                String check = fileList[i].toString();
                if (check.toLowerCase().contains(searchTerm.toLowerCase())) {
                    System.out.printf("%-50s %-500s%n", fileList[i].getName(), fileList[i].getAbsolutePath());
                }
            }
        } else {
            System.out.println("Cannot read: " + path.getAbsolutePath());
        }
    }

    private static File userInputPath(Scanner sc, String msg) {
        System.out.println(msg);
        String text = sc.nextLine();
        File userInput = new File(text);
        while (!userInput.exists() && !userInput.isDirectory()) {
            System.out.println(msg);
            text = sc.nextLine();
            userInput = new File(text);
        }
        return userInput;
    }

    private static String userInputSearch(Scanner sc, String msgSearch) {
        System.out.println(msgSearch);
        return sc.nextLine();
    }
}
