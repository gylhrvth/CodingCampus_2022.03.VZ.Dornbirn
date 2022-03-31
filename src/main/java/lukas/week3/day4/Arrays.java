package lukas.week3.day4;

public class Arrays {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        double[] unserArray = new double[10];
        for (int i = 0; i < unserArray.length; i++) {
            unserArray[i] = i;
        }
        System.out.println(java.util.Arrays.toString(unserArray));

        double[] unserArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //double[] unserArray3 = unserArray2.clone();

        //Nicht möglich
        //unserArray2 = {1, 2, 3, 462, 5, 6, 7, 8, 9, 10};

        double[] unserArray5 = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sum(unserArray5));

        //2te Dimension
        String[][] unsereMatrix = new String[10][10];

        unsereMatrix[3] = new String[3];

        for (int y = 0; y < unsereMatrix.length; y++) {
            for (int x = 0; x < unsereMatrix[y].length; x++) {
                unsereMatrix[y][x] = x + "/" + y;
            }
        }

        for (int y = 0; y < unsereMatrix.length; y++) {
            System.out.println(java.util.Arrays.toString(unsereMatrix[y]));
        }

        System.out.println("---");

        //Koordinatensystem 0/0 links unten
        for (int y = unsereMatrix.length - 1; y >= 0; y--) {
            System.out.println(java.util.Arrays.toString(unsereMatrix[y]));
        }
    }

    private static double sum(double[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}
