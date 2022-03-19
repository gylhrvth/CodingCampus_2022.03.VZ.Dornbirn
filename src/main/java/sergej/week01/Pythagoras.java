package sergej.week01;

public class Pythagoras {

    public static double getY(int radius) {
        double y = 0d;

        for (int i = radius; i <= Math.abs(radius); i++) {

            y = Math.sqrt((double) radius * radius - i * i);


        }
        return y;
    }

    public static void printCirclePythagoras(int radius) {

        int x = 0;
        double y = 0d;

        for (int i = -radius; i <= radius; i++) {

            y = Math.sqrt((double) radius * radius - i * i);
            for (int j = 0; j < y * 2; j++) {
                System.out.print("x");
            }
            System.out.println(y);
        }

    }

    public static void main(String[] args) {

        printCirclePythagoras(10);

    }
}
