package murat.week2.day2;

import java.text.NumberFormat;
import java.util.Scanner;

public class CirclePythagorasWithInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userValue = Integer.MAX_VALUE;          // Assign a value that user can not enter

        while (userValue == Integer.MAX_VALUE) {

            try {
                String userEntryAsAText = sc.nextLine();
                userValue = Integer.parseInt(userEntryAsAText);   // Convert the text into an integer if the user enters a text

                if ((userValue > 50) || (userValue <= 2)) {        // Limit the entry between 2 and 50
                    System.out.println("Please enter a value between 2 and 50");
                    userValue = Integer.MAX_VALUE;                // if the user enters a value other than 2-50, keep the loop work
                } else {
                    printCirclePythagoras(userValue);             // If all the conditions are met, execute the circle
                    System.out.println("A circle with the size of " + userValue + " is created.");
                }

            } catch (NumberFormatException entryError) {
                System.out.println("Please enter an integer!");
            }
        }
    }

    // Print Circle with Pythagoras
    public static void printCirclePythagoras(int size) {
        /* I divided the circle into 2 semicircles as upper and lower part.
        Then I created the full cells.
        Pushing the empty cells to the right gives us a semicircle */

        int newSize = size * 2;    // Size is radius. An upper part requires 2*size in with or so called X Axis
        int xAxis;          // Width
        double yAxis;       // Height

        // Upper semicircle
        for (int i = newSize / 2; i >= 1; i--) {
            yAxis = i;           // Top to the bottom, lowered by 1

            // if X axis decreases, X axis should be more in accordance with Pythagoras
            xAxis = (int) Math.round(Math.sqrt(size * size - yAxis * yAxis));            // Rounding the X Axis (Width) to the nearest number.

            // Empty cells push the full cells to the right
            if (i != size) {         // To erase the empty upper line
                for (int k = 0; k < size - xAxis; ++k) {
                    System.out.print(".");
                }
            }

            // Full cells
            for (int j = 1; j <= xAxis * 2; ++j) {
                System.out.print("A");
            }
            System.out.println();
        }

        // Lower semicircle
        for (int i = 1; i <= newSize / 2; i++) {
            yAxis = i;           // Top to the bottom, increased by 1

            // if X axis increases, Y axis should be less in accordance with Pythagoras
            xAxis = (int) Math.round(Math.sqrt(size * size - yAxis * yAxis));    // Rounding the X Axis (Width) to the nearest number.

            // Empty cells push the full cells to the right
            if (i != size) {      // To erase the empty bottom line
                for (int k = 0; k < (size - xAxis); ++k) {
                    System.out.print(",");
                }
            }

            // Full cells
            for (int j = 1; j <= xAxis * 2; ++j) {
                System.out.print("B");
            }
            System.out.println();
        }
    }

}
