package lukas.week2.day4;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double userImput = readNumber(sc);
        System.out.println(userImput);
//        for (int i = 0; i < 10; i++) {
//            String userImput = readString(sc);
//            System.out.println(userImput);
//        }

    }

    public static String readString(Scanner sc) {
        return sc.next();

    }
    public  static  double readNumber(Scanner sc){
        while (!sc.hasNextDouble()){
            System.out.println("error");
            sc.next();
        }
        return sc.nextDouble();
    }

}

