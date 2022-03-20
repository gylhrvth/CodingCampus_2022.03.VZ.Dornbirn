package philipp.Week01;

public class PrintCircle {

    public static void main(String[] args) {
        printCirclePythagoras(10);
        System.out.println();
    }

    public static void printCirclePythagoras(int radius) {
        //a2+b2=c2
        for (int i = 0; i < radius * 2; i++) {
            for (int j = 0; j < radius * 2; j++) {
                double a = Math.sqrt((radius * radius) - ((radius - i) * (radius - i)));
                double b = Math.sqrt((radius * radius) - ((radius - j) * (radius - j)));

                if ((radius * radius) < (a * a) + (b * b)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






