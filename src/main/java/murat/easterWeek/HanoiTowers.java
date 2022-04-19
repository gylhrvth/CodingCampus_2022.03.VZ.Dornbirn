package murat.easterWeek;

import murat.muratStandardLibrary.MuratInput;
import murat.muratStandardLibrary.MuratPrint;

import java.util.Scanner;

// Asks the user to enter the number of discs
// Moves the discs to the target rod without spoiling the initial order.
public class HanoiTowers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the discs!");

        int numberOfDiscs = MuratInput.readANumberFromUser(sc, 1, 9);
        int[][] playGround = initializeGameRods(numberOfDiscs);
        hanoiMove(playGround, numberOfDiscs, 1, 2, 3);

    }

    // Put the discs and create the playground
    public static int[][] initializeGameRods(int numberOfDiscs) {

        int[][] hanoi = new int[numberOfDiscs][3];

        for (int i = 0; i < numberOfDiscs; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    hanoi[i][0] = i + 1;
                } else {
                    hanoi[i][j] = 0;
                }
            }
        }
        return hanoi;
    }

    // Main Hanoi function
    public static void hanoiMove(int[][] hanoi, int n, int start, int through, int end) {

        // Move n-1 discs from start to a temporary rod.
        // Move the last disc from the start to the target
        // Move n-1 discs from the temporary rod to back (start)

        if (n == 1) {
            // Move n-1 discs from start to a temporary rod.
            iLikeToMoveIt(hanoi, start, end);
            System.out.println("Move disc " + n + " from " + start + ". column to " + end + ". column");
            MuratPrint.printAnInt2DArray(hanoi);

        } else {

            // Move n-1 discs from start to a temporary rod.
            hanoiMove(hanoi, n - 1, start, end, through);

            // Move the discs to the new position
            iLikeToMoveIt(hanoi, start, end);

            System.out.println("Move disc " + n + " from " + start + ". column to " + end + ". column");
            MuratPrint.printAnInt2DArray(hanoi);

            // Move n-1 discs from the temporary rod to back (start)
            hanoiMove(hanoi, n - 1, through, start, end);

        }
    }

    // Move a certain disc to a null position in the destination
    public static void iLikeToMoveIt(int[][] aMatrix, int start, int end) {

        int tempNumber = 0;   // A temporary number
        start = start - 1;    // Matrix starts with 0  (3 discs, 0-2 rows)
        end = end - 1;        // Matrix starts with 0  (3 discs, 0-2 rows)

        // Find the disc which is bigger than 1 and save it as a number, place a 0 instead
        for (int i = 0; i < aMatrix.length; i++) {
            if (aMatrix[i][start] > 0) {
                tempNumber = aMatrix[i][start];
                aMatrix[i][start] = 0;
                break;
            }
        }

        // For each column, from bottom to top, find a null position to fill with the number
        for (int j = aMatrix.length - 1; j >= 0; j--) {
            if (aMatrix[j][end] == 0) {
                aMatrix[j][end] = tempNumber;
                break;
            }
        }
    }
}
