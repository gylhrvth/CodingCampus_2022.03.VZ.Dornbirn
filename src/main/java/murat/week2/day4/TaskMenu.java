package murat.week2.day4;

import java.util.Scanner;

public class TaskMenu {
    public static void main(String[] args) {

        boolean exitDoor = false;

        while (!exitDoor) {
            System.out.println("Welcome to my tasks");
            System.out.println("What would you like to draw?");
            System.out.println("1 - A Christmas Tree");
            System.out.println("2 - A Square");
            System.out.println("3 - A Rhombus");
            System.out.println("Please choose one of above.");
            Scanner input = new Scanner(System.in);

            int chosenShape = readANumberBetween1And3(input);
            System.out.println("Please enter a size between [3-50].");
            int chosenSize = chooseTheSize(input);
            System.out.println("Please enter the symbol to display the shape. (The first character will be displayed)");
            char chosenSymbol = chooseTheSymbol(input);

            switch (chosenShape) {
                case 1 -> no1printChristmasTree(chosenSymbol, chosenSize);
                case 2 -> no2printSquare(chosenSymbol, chosenSize);
                case 3 -> no3printRhombus(chosenSymbol, chosenSize);
            }
            System.out.println("Would you like to try again?");
            System.out.println("To continue press Enter, to exit press any key");
            String enterPress = "";
            if (!enterPress.equals(readUserInputAsString(input))){
                System.out.println("Game Over");
                exitDoor = true;
            }
        }
    }

    public static String readUserInputAsString(Scanner sc) {

        return sc.nextLine();
    }

    public static int readANumberBetween1And3(Scanner sc) {

        int number = Integer.MAX_VALUE;
        while (number == Integer.MAX_VALUE) {
            try {
                String readAnyText = sc.nextLine();
                number = Integer.parseInt(readAnyText);

                if (number < 1 || number > 3) {
                    System.out.println("A number between [1-3] is required. Please try again.");
                    number = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("A number is required!");
            }
        }
        return number;
    }

    public static int chooseTheSize(Scanner sc) {

        int number = Integer.MAX_VALUE;
        while (number == Integer.MAX_VALUE) {
            try {
                String readAnyText = sc.nextLine();
                number = Integer.parseInt(readAnyText);

                if (number < 3 || number > 50) {
                    System.out.println("A number between [3-50] is required. Please try again.");
                    number = Integer.MAX_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("A number is required!");
            }
        }
        return number;
    }

    public static char chooseTheSymbol(Scanner sc) {

        String userEntersAValue = sc.nextLine();
        return userEntersAValue.charAt(0);
    }

    public static void no1printChristmasTree(char text, int size) {

        System.out.println("Your Christmas Tree");

        // Formating the size for the base number For Example:The size is 3, but the base is 5
        int newSize = (size * 2) - 1;
        int peakOFTree = (newSize - 1) / 2;

        // Beginning from the peak point of the tree we generate it to the bottom.
        for (int i = peakOFTree; i < newSize; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (((i + j) <= (peakOFTree * 2 - 1))) {
                    System.out.print(" ");             // Shoving the tree to the right, otherwise we have a triangle leaning to the left.
                } else {
                    System.out.print(text);             // Tree leaves
                }
            }
            System.out.println();
        }

        // Bottom - Null
        for (int z = 0; z < newSize; ++z) {
            System.out.print("O");
        }
        System.out.println();

        // Bottom - Plus
        for (int x = 0; x < 2; ++x) {
            for (int y = 0; y < newSize; ++y) {
                if (y < peakOFTree - 2 || y > newSize - peakOFTree + 1) {
                    System.out.print(" ");     // Blank cells
                } else {
                    System.out.print("+");     // Plus cells
                }
            }
            System.out.println();
        }
    }

    public static void no2printSquare(char text, int size) {

        System.out.println("Your Square");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                System.out.print(text);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void no3printRhombus(char text, int size) {

        // In case of a size which even is, a perfect rhombus can not be formed.
        if (size % 2 == 0) {
            System.out.println("Your rhombus will be 1 character smaller because your size " + size + "is an even number.");
            size = size - 1;
        }

        System.out.println("Your Rhombus");

        // Creating a full rectangle with the new base
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {

                // Bottom left or top right or top left or bottom right
                // Example: Size= 9   Bottom Left: i-j = 4   Top Right: j-i = 4  Top Left: i+j=4  Bottom Right: i+j = 1
                if ((i - j == ((size - 1) / 2)) || (j - i == ((size - 1) / 2)) || ((i + j) == ((size - 1) / 2)) || ((i + j) == ((size - 1) + ((size - 1) / 2)))) {
                    System.out.print(text);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
