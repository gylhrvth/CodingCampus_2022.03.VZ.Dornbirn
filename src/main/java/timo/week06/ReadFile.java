package timo.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter file name");
        String input = sc.nextLine();
        File userFile = new File(input);
        Scanner fileScanner = new Scanner(userFile);

        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }

}
