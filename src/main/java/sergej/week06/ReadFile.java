package sergej.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter file path: ");
        String input = sc.nextLine();
        File file = new File(input);
        Scanner scf = new Scanner(file);


        while (scf.hasNextLine()) {
            System.out.println(scf.nextLine());

        }
    }
}
