package philipp.Week02;

import java.util.Scanner;


public class InputTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int treeSize = Integer.MIN_VALUE;
        boolean b = true;
        System.out.println("Enter a decimal number:");
        while (b) {
            try {
                String text = sc.nextLine();
                treeSize = Integer.parseInt(text);
                b = treeSize < 3 || treeSize > 50;
                if (b) {
                    System.out.println("A number between 3 and 50 is requested");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("A number between 3 and 50 is requested");
            }
        }

        System.out.println("Enter Needles");
        String textNeedles = sc.nextLine();
        System.out.println();

        //tree2(n, "o", "+", treeSize);
        tree(textNeedles, treeSize);
    }

    //from here starts Tree-Codes
    public static void tree(String textNeedles, int amount) {
        for (int i = 0; i < amount; i++) {
            printCharsNoNewLine(" ".repeat(textNeedles.length()), (amount - 1 - i));
            if (i > 0) {
                System.out.print(textNeedles);
                printCharsNoNewLine(textNeedles, i * 2 - 1);
            }
            System.out.println(textNeedles);
        }
        printChars("O".repeat(textNeedles.length()), amount*2-1);
        for (int j = 0; j < amount / 4; j++) {
            int s = (amount / 4 * 2) + 1;
            printCharsNoNewLine(" ".repeat(textNeedles.length()), (amount - 1 - s / 2));
            printCharsNoNewLine("+".repeat(textNeedles.length()), s);
            System.out.println();
        }
    }

    /*
            public static void tree2 (String textNeedles, String textBalls, String textStump,int amount){
                for (int i = 0; i < amount; i++) {
                    printCharsNoNewLine(" ".repeat(textNeedles.length()), (amount - 1 - i));
                    if (i > 0) {
                        printCharsNoNewLine(textNeedles, i * 2);
                    }
                    System.out.println(textNeedles);
                }
                printChars(textBalls.substring(0, 1).repeat(textNeedles.length()), 2 * amount - 1);
                for (int j = 0; j < amount / 4; j++) {
                    int s = (amount / 4 * 2) + 1;
                    printCharsNoNewLine(" ".repeat(textNeedles.length()), (amount - 1 - s / 2));
                    printCharsNoNewLine(textStump.substring(0, 1).repeat(textNeedles.length()), s);
                    System.out.println();
                }
            }
    }
    */
    public static void printCharsNoNewLine(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(name);
        }
    }

    public static void printChars(String name, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(name);
        }
        System.out.println();
    }
}




