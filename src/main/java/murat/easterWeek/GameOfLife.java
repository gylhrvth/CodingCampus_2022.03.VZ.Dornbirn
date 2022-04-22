package murat.easterWeek;

import lukas.week3.day4.ConwaysGameOfLife;
import murat.muratStandardLibrary.MuratPrint;

// Conway's Game of Life
public class GameOfLife {

    public static void main(String[] args) {

        MuratPrint.printAnInt2DArray(ConwaysGameOfLife.GLEITER);
        int[][] nextGen = ConwaysGameOfLife.GLEITER;
        System.out.println();

        // Make the wheels spinning
        while (true) {
            nextGen = createNextGeneration(nextGen);              // create the next generation
            lukas.week3.day4.ConwaysGameOfLife.clearScreen();     // clear screen
            MuratPrint.printAnInt2DArray(nextGen);                // print it out

            // Freeze the console for 1 second
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                //noop
            }
            System.out.println();
        }
    }

    // Get the next generation based on the neighbours
    public static int[][] createNextGeneration(int[][] oldCommunity) {

        int[][] babyCommunity = new int[oldCommunity.length][oldCommunity[0].length];    // Next generation

        // Go through the game matrix
        for (int row = 0; row < oldCommunity.length; row++) {
            for (int col = 0; col < oldCommunity[row].length; col++) {

                // Count the neighbours and create the next generation
                int livingNeighbours = countLivingNeighbours(oldCommunity, row, col);
                createNewBabyCommunity(oldCommunity, babyCommunity, row, col, livingNeighbours);
            }
        }
        return babyCommunity;
    }

    // Counting 8 neighbours if they are alive.
    public static int countLivingNeighbours(int[][] aMatrix, int rowNum, int colNum) {

        int aliveNeighbours = 0;

        for (int neighRow = -1; neighRow < 2; neighRow++) {
            for (int neighCol = -1; neighCol < 2; neighCol++) {

                // Do not count the cell itself!  (i,j) = (0,0)
                if (neighRow != 0 || neighCol != 0) {
                    int y = rowNum + neighRow;
                    if (y >= aMatrix.length) {
                        y = 0;
                    } else if (y == -1) {
                        y = aMatrix.length - 1;
                    }
                    int x = colNum + neighCol;
                    if (x >= aMatrix[0].length) {
                        x = 0;
                    } else if (x == -1) {
                        x = aMatrix[0].length - 1;
                    }
                    aliveNeighbours += aMatrix[y][x];
                }
            }
        }
        return aliveNeighbours;
    }

    // Create the new matrix if the conditions of neighbourhood is ok.
    public static void createNewBabyCommunity(int[][] oldMatrix, int[][] newMatrix, int rowNum, int colNum, int livingNeighbours) {

        // Living cells with 2-3 living neighbours
        if (oldMatrix[rowNum][colNum] == 1 && (livingNeighbours == 2 || livingNeighbours == 3)) {
            newMatrix[rowNum][colNum] = 1;
        } else if (oldMatrix[rowNum][colNum] == 0 && livingNeighbours == 3) {         // Dead cells with 3 living neighbours
            newMatrix[rowNum][colNum] = 1;
        } else {
            newMatrix[rowNum][colNum] = 0;      // Other cells
        }
    }
}
