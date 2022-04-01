package arda.week03.day04;

import java.util.Scanner;

public class GladiatorTicTacToe {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean fightAgain = true;

        while(fightAgain){
            int size = 3;
            int[][] arena = new int[size][size];
            boolean executingGame = true;
            System.out.println("==!Welcome to Gladiator TicTacToe!==");

            emptyArena(arena);
            printArena(arena);

            while (executingGame) {

                turn(sc, arena, 1);
                printArena(arena);

                if (checkForWin(arena, 1)) {
                    System.out.println("Gladiator 1 has won");
                    executingGame = false;
                    break;
                }
                if (checkDraw(arena)) {
                    System.out.println("a draw. what a pity.");
                    executingGame = false;
                    break;
                }
                turn(sc, arena, 2);
                printArena(arena);

                if (checkForWin(arena, 2)) {
                    System.out.println("Gladiator 2 has won");
                    executingGame = false;
                    break;
                }
                if (checkDraw(arena)) {
                    System.out.println("it's a draw! they both are worthless.");
                    executingGame = false;
                    break;
                }
            }
            fightAgain = restartGame(sc);
        }

    }

    public static int userInput(Scanner sc) {
        boolean execute = true;
        int userInput = Integer.MIN_VALUE;

        while (execute) {
            try {
                String Text = sc.nextLine();
                userInput = Integer.parseInt(Text);
                if (userInput < 1 || userInput > 3) {
                    System.out.println("please pick a number between 1 and 3");
                } else {
                    execute = false;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("please enter a valid number");
            }
        }
        return userInput;
    }

    public static void emptyArena(int[][] arena) {
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[i].length; j++) {
                arena[i][j] = 0;
            }
        }
    }

    public static void printArena(int[][] arena) {
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[i].length; j++) {
                System.out.print(arena[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void turn(Scanner sc, int[][] arena, int player) {
        while (true) {
            System.out.println("Gladiator " + player + " choose row pos 1-3");
            int row = userInput(sc) - 1;

            System.out.println("Gladiator " + player + " choose col pos 1-3");
            int col = userInput(sc) - 1;
            if (arena[row][col] == 0) {
                arena[row][col] = player;
                break;
            } else {
                System.out.println("there has been struck already, can't you see!?");
            }
        }
    }

    public static boolean checkForWin(int[][] arena, int player) {
        //check for row win.
        for (int y = 0; y < arena.length; y++) {
            boolean lost = false;
            for (int x = 0; x < arena[y].length; x++) {
                if (arena[y][x] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                System.out.println("a clean horizontal strike! your enemy had no chance!");
                return true;
            }
        }
        //Check for col win
        for (int y = 0; y < arena.length; y++) {
            boolean lost = false;
            for (int x = 0; x < arena[y].length; x++) {
                if (arena[x][y] != player) {
                    lost = true;
                    break;
                }
            }
            if (!lost) {
                System.out.println("your vertical strike was supreme. you win.");
                return true;
            }
        }

        //Check \
        boolean lost = false;
        for (int i = 0; i < arena.length; i++) {
            if (arena[i][i] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            System.out.println("a diagonal slash! victory is yours.");
            return true;
        }

        //Check /
        lost = false;
        for (int x = 0; x < arena.length; x++) {
            int y = arena.length - 1 - x;
            if (arena[y][x] != player) {
                lost = true;
                break;
            }
        }
        if (!lost) {
            System.out.println("reverse diagonal slash? victory!");
            return true;
        }

        return false;
    }

    public static boolean checkDraw(int[][] arena) {
        boolean draw = true;
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[i].length; j++) {
                if (arena[i][j] == 0) {
                    draw = false;
                    break;
                }
            }
        }
        if (draw) {
            return true;
        }
        return false;
    }

    public static boolean restartGame(Scanner sc) {
        System.out.println("would you dare to fight once more? yes or no?");
        boolean fightAgain = true;
        boolean executing = true;

        while (fightAgain) {
            String answer = sc.nextLine();

            if (answer.equals("yes")) {
                executing = true;
                fightAgain = false;
            } else if (answer.equals("no")) {
                System.out.println("alright then.");
                executing = false;
                fightAgain = false;
            } else {
                System.out.println("victory has gone to your head. give a proper answer or be executed!");
            }
        }
        return executing;
    }
}