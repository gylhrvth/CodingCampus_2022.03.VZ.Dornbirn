package sergej.week01;

public class Pythagoras {

    public static void getY(int radius) {
        double y = 0d;

        for (int i = -radius; i <= radius; i++) {

            y = Math.ceil(Math.sqrt((double) radius * radius - i * i));

            System.out.println(y);
        }

    }

    public static void printCirclePythagoras(int radius) {

        double y = 0d;

        for (int i = -radius; i <= radius; i++) {

            y = Math.ceil(Math.sqrt((double) radius * radius - i * i));
            if (y < radius) {
                for (int k = 0; k < radius - y; ++k) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < y * 2 - 1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        printCirclePythagoras(10);
        //getY(10);
    }
}
