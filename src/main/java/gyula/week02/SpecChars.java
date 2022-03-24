package gyula.week02;

import java.util.Scanner;

public class SpecChars {
    public static void main(String[] args) {
        System.out.println("^");
        Scanner sc = new Scanner(System.in);
        String test;
        do {
            System.out.println("Add operator");
            test = sc.nextLine();
        } while (!test.equals("^"));
    }
}
