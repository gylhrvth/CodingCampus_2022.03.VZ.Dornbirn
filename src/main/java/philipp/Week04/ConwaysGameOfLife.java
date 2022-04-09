package philipp.Week04;

import aron.week01.Couting2;

import java.util.Arrays;

public class ConwaysGameOfLife {

    public static void main(String[] args) {
//        int[][] test = {{1, 2, 3}, {1, 5, 3}, {1, 2, 3}};
//
//        for (int i = 0; i < test.length; i++) {
//            System.out.println(Arrays.toString(test[i]));
//        }
//        runGameOfLife(glider);
        runGameOfLife(sailor);
    }

    private static void runGameOfLife(int[][] board) {
        int loop = 0;
        while (true) {
            printArray(board);
//            System.out.println();
            int[][] temp = new int[board.length][];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = new int[board[i].length];
                for (int j = 0; j < temp[i].length; j++) {
                    temp[i][j] = 0;
                }
            }
//            philipp.Week03.Array2D.printArray(temp);
//            System.out.println();
            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board[x].length; y++) {
                    int sum = checkNeighbours(board, x, y);
                    temp[x][y] = applyRules(board, temp, sum, x, y);
                }
            }
//            philipp.Week03.Array2D.printArray(temp);
//            System.out.println();
//            System.out.println();
            board = new int[temp.length][];
            for (int i = 0; i < temp.length; i++) {
                board[i] = new int[temp[i].length];
                for (int j = 0; j < temp[i].length; j++) {
                    board[i][j] = temp[i][j];
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException exc) {
                //noop
            }
            clearScreen();
            loop++;
        }
    }

    private static int applyRules(int[][] board, int[][] temp, int sumOfNeighbours, int x, int y) {
        if (board[x][y] == 0) {
            if (sumOfNeighbours == 3) {
                temp[x][y] = 1;
            } else {
                temp[x][y] = 0;
            }
        } else if (board[x][y] == 1) {
            if (sumOfNeighbours < 2) {
                temp[x][y] = 0;
            } else if (sumOfNeighbours > 3) {
                temp[x][y] = 0;
            } else {
                temp[x][y] = 1;
            }
        }
        return temp[x][y];
    }

    private static int checkNeighbours(int[][] field, int x, int y) {

        int nb1 = getValue(field, x, y - 1);
        int nb2 = getValue(field, x, y + 1);
        int nb3 = getValue(field, x - 1, y);
        int nb4 = getValue(field, x + 1, y);
        int nb5 = getValue(field, x - 1, y - 1);
        int nb6 = getValue(field, x - 1, y + 1);
        int nb7 = getValue(field, x + 1, y - 1);
        int nb8 = getValue(field, x + 1, y + 1);

        int sumOfNeighbours = nb1 + nb2 + nb3 + nb4 + nb5 + nb6 + nb7 + nb8;

        return sumOfNeighbours;
    }

    private static int getValue(int[][] board, int x, int y) {
        if (x < 0) {
            x = board.length - 1;
        }
        if (y < 0) {
            y = board[0].length - 1;
        }
        if (x > board.length-1) {
            x = 0;
        }
        if (y > board[0].length-1) {
            y = 0;
        }
        return board[x][y];
    }

    private static void printArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                int value = input[i][j];
                if (value > 0) {
                    System.out.print(input[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static final int[][] glider = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    private static final int[][] sailor = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    /**
     * https://stackoverflow.com/questions/2979383/java-clear-the-console
     */
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
