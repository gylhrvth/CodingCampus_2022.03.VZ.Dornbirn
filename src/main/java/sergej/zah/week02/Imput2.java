package sergej.zah.week02;

import java.util.Scanner;

public class Imput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {


            String userImput = readString(sc);
            System.out.println(userImput);
        }
    }

    public static String readString(Scanner sc) {
        String userImput = sc.next();
        return userImput;

    }
}
