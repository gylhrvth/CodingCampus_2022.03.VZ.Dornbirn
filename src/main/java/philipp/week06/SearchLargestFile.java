package philipp.week06;

import java.io.File;
import java.util.Scanner;

public class SearchLargestFile {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        File f = userInput(sc, "Please enter a correct path:");
        File largestFile = biggestFile(f);
        System.out.println("The largest File is: " +
                largestFile.getAbsolutePath());
        System.out.println("The size of this file is: " +
                largestFile.length());
    }

    private static File biggestFile(File f) {
        File biggest = new File("");
        File[] fileList = f.listFiles();
        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {
                File testBiggest = null;
                if (fileList[i].isDirectory()) {
                    testBiggest = biggestFile(fileList[i]);
                } else {
                    testBiggest = fileList[i];
                }
                if (testBiggest.length() > biggest.length()) {
                    biggest = testBiggest;
                }
            }
        } else {
            System.out.println("Cannot read: " + f.getAbsolutePath());
        }
        return biggest;
    }

    private static File userInput(Scanner sc, String msg) {
        System.out.println(msg);
        String text = sc.nextLine();
        File userInput = new File(text);
        while (!userInput.exists() && !userInput.isDirectory()) {
            System.out.println(msg);
            text =sc.nextLine();
            userInput = new File(text);
        }
        return userInput;
    }
}
