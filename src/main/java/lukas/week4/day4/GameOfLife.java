package lukas.week4.day4;

import lukas.week3.day4.ConwaysGameOfLife;
import lukas.week4.day3.Color;

import java.util.Random;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] random = new int[100][200];
        Random randomizer = new Random();
        for (int y = 0; y < random.length; y++) {
            for (int x = 0; x < random[y].length; x++) {
                random[y][x] = randomizer.nextBoolean() ? 1 : 0;
            }
        }
        gameOfLife(random);
    }

    private static void gameOfLife(int[][] arr) {
        int width = arr[0].length;
        int height = arr.length;

        int colorIndex = 0;

        while (true) {
            ConwaysGameOfLife.clearScreen();
            System.out.print(Color.COLORS[colorIndex]);
            printArr(arr);
            System.out.print(Color.RESET);

            colorIndex = (colorIndex + 1) % Color.COLORS.length;

            arr = calculateNextGeneration(arr, width, height);

            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                //noop
            }
        }
    }

    private static int[][] calculateNextGeneration(int[][] lastGeneration, int width, int height) {
        int[][] nextGeneration = new int[height][width];

        for (int y = 0; y < lastGeneration.length; y++) {
            for (int x = 0; x < lastGeneration[y].length; x++) {
                nextGeneration[y][x] = calculateNextCellState(lastGeneration, width, height, x, y);
            }
        }
        return nextGeneration;
    }

    private static int calculateNextCellState(int[][] lastGeneration, int width, int height, int x, int y) {
        int sum = getCellValue(lastGeneration, width, height, x - 1, y)
                + getCellValue(lastGeneration, width, height, x - 1, y - 1)
                + getCellValue(lastGeneration, width, height, x, y - 1)
                + getCellValue(lastGeneration, width, height, x + 1, y - 1)
                + getCellValue(lastGeneration, width, height, x + 1, y)
                + getCellValue(lastGeneration, width, height, x + 1, y + 1)
                + getCellValue(lastGeneration, width, height, x, y + 1)
                + getCellValue(lastGeneration, width, height, x - 1, y + 1);

        int currentValue = lastGeneration[y][x];

        if (currentValue == 0 && sum == 3) {
            return 1;
        }
        if (currentValue == 1 && sum < 2) {
            return 0;
        }
        if (currentValue == 1 && (sum == 2 || sum == 3)) {
            return 1;
        }
        if (currentValue == 1 && sum > 3) {
            return 0;
        }
        return 0;
    }

    private static int getCellValue(int[][] lastGeneration, int width, int height, int x, int y) {
        int newX = x;
        int newY = y;

        if (newX < 0) {
            newX = width - 1;
        } else if (newX >= width) {
            newX = 0;
        }
        if (newY < 0) {
            newY = height - 1;
        } else if (newY >= height) {
            newY = 0;
        }
        return lastGeneration[newY][newX];
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = arr[i][j];
                System.out.print(val == 0 ? " " : "*");
            }
            System.out.println();
        }
    }
}
