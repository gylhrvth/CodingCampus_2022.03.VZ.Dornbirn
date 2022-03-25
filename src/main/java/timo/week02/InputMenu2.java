package timo.week02;

import java.util.Scanner;

public class InputMenu2 {

    public static void main(String[] args) {
        boolean startAgain = true;

        Scanner sc = new Scanner(System.in);
        String mainMenuMessage = ("Was möchten Sie zeichnen?\n" + "1) Christbaum\n" +
                "2) Quader\n" +
                "3) Rhombus");
        System.out.println("Willkommen bei meinen Aufgaben!");

        while (startAgain) {
            int selectedMenu = readNumber(sc, mainMenuMessage, 1, 3);
            String nameofDrawing = "";
            if (selectedMenu == 1) {
                nameofDrawing = "Christbaum";
            } else if (selectedMenu == 2) {
                nameofDrawing = "Quader";
            } else if (selectedMenu == 3) {
                nameofDrawing = "Rhombus";
            } else {
                nameofDrawing = "Object";
            } // This may not happen

            if (selectedMenu == 1) {
                int size = readNumber(sc, "Wie groß soll der Christbaum sein?", 3, 50);
                timo.week01.LoopMethods.printChristmasTree(size);
            } else if (selectedMenu == 2) {
                int size = readNumber(sc, "Wie groß soll der Quader sein?", 3, 50);
                String symbol = readSymbol(sc, "Welches Zeichen soll verwendet werden?");
                timo.week01.LoopMethods.printEmptySquare(symbol, size);
            } else if (selectedMenu == 3) {
                int size = readNumber(sc, "Wie groß soll der Rhombus sein?", 3, 50);
                String symbol = readSymbol(sc, "Welches Zeichen soll verwendet werden?");
                timo.week01.LoopMethods.printRhombus(symbol, size);
            } else { // These may not happen
                System.out.println("Dieses Feature ist noch nicht implementiert!");
            }
            startAgain = readYesOrNo(sc, "Möchten Sie noch etwas zeichnen? (j,n)", "j", "n");
        }
        System.out.println("Auf Wiedersehen!");
    }


    public static int readNumber(Scanner sc, String message, int minValue, int maxValue) {
        int result = Integer.MIN_VALUE;
        while ((result < minValue) || (result > maxValue)) {
            System.out.println(message);
            System.out.println(">>>");
            String text = sc.nextLine();
            try {
                result = Integer.parseInt(text);
            } catch (NumberFormatException nfe) {
                System.out.println("Bitte wählen Sie eine Zahl");
            }
        }

        return result;
    }

    public static String readSymbol(Scanner sc, String message) {
        String result = "";
        while (result.length() != 1) {
            System.out.println(message);
            System.out.println(">>>");
            result = sc.nextLine();
        }
        return result;
    }

    public static boolean readYesOrNo(Scanner sc, String message, String yesAnswer, String noAnswer) {
        String text = "";
        while (!text.equals(yesAnswer) && !text.equals(noAnswer)) {
            System.out.println(message);
            System.out.println(">>>");
            text = sc.nextLine();
        }
        return text.equals(yesAnswer);
    }

}
