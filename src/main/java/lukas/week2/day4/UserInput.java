package lukas.week2.day4;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //readNumberUntilNumber();
        Scanner sc = new Scanner(System.in);
        double number = readNumber(sc);
        System.out.println(" your number is " + number);

        double numberElegant = readNumberVariantElegant(sc);
        System.out.println(" your number is " + numberElegant);
    }

    private static void readString() {
        Scanner sc = new Scanner(System.in);

        //Eingabe: Hallo asdf 123\n
        //sc.next() -> Hallo
        //sc.nextLine() -> Hallo asdf 123
        String name = sc.nextLine();

        System.out.println(name);

        System.out.println("Please enter 3 Words:");
        String name1 = sc.next();
        String name2 = sc.next();
        String name3 = sc.next();

        System.out.println(name1 + "|" + name2 + "|" + name3);
    }

    private static void readNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        if (!sc.hasNextInt()) {
            System.out.println("This is not a number");
        } else {
            int number = sc.nextInt();
            System.out.println(number);
        }
    }

    private static void readNumberUntilNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");

        int number;
        while (true) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                break;
            } else {
                sc.next();
                System.out.println("Please enter a number!!!:");
            }
        }
        System.out.println(number);
    }

    private static double readNumber(Scanner sc){
        System.out.println("Enter number:");
        
        double number;
        while (true) {
            if (sc.hasNextDouble()) {
                number = sc.nextDouble();
                break;
            } else {
                sc.next();
                System.out.println("Please enter a number!!!:");
            }
        }
        return number;
    }

    private static double readNumberVariantElegant(Scanner sc){
        System.out.println("Enter number:");

        while(!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Please enter a number!!!:");
        }
        return sc.nextDouble();
    }
}
