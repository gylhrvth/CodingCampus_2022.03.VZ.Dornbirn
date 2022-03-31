package zah.week03;

import zah.week02.Ratenspiel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PascalTriangle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] number = twoArray(picNumber(sc, 0, 20, "Enter a row number:"), (picNumber(sc, 0, 20, "Enter a column number:")));

        for (int i = 0; i < number.length; i++) {
            System.out.println(Arrays.toString(number[i]));
        }
    }

    public static int[][] twoArray(int row, int colum) {
        int[][] data = new int[row][colum];
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[y].length; x++) {
                if (y == 0 || x == 0) {
                    data[y][x] = 1;
                } else {
                    int leftNumber = data[y][x - 1];
                    int topNumber = data[y - 1][x];
                    data[y][x] = leftNumber + topNumber;
                }
            }
        }
        return data;
    }

    public static int picNumber(Scanner sc, int min, int max, String message) {
        int result = Integer.MIN_VALUE;
        while ((result < min) || (result > max)) {
            System.out.print(message);
            String text = sc.nextLine();

            try {
                result = Integer.parseInt(text);
            } catch (NumberFormatException nfc) {
                //
            }
        }
        return result;
    }
}
