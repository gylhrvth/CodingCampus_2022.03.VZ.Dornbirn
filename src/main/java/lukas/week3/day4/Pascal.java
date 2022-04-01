package lukas.week3.day4;

public class Pascal {
    public static void main(String[] args) {
        int[][] arr = createPascal(10);
        buildPascal(arr);
        printPascal(arr);
    }

    private static void buildPascal(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (y == 0 || x == 0) {
                    int[] row = arr[y];
                    row[x] = 1;
                } else {
                    int leftNumber = arr[y][x - 1];
                    int topNumber = arr[y - 1][x];
                    arr[y][x] = leftNumber + topNumber;
                }
            }
        }
    }

    private static int[][] createPascal(int size) {
        return new int[size][size];
    }

    private static void printPascal(int[][] data) {
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[y].length; x++) {
                //http://if-schleife.de/
                int[] row = data[y];
                int col = row[x];
                System.out.printf("%1$8d", col);
            }
            System.out.println();
        }
    }
}
