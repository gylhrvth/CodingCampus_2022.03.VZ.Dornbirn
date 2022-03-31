package sergej.zah.week02;

import java.util.Scanner;

public class ImputMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen bei meinen Aufgaben!\n" +
                "Was möchten Sie zeichnen?");

    }
    public static int readNumber(Scanner sc, int min, int max){
        int result = Integer.MIN_VALUE;

        while ((result< min) || (result>max )){
            System.out.println();
            String number= sc.nextLine();
            try {
                result= Integer.parseInt(number);

            }catch (NumberFormatException nfs){
                //
            }
        }
        return result;

    }
}
