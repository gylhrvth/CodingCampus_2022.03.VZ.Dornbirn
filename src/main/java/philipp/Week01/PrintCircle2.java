package philipp.Week01;

public class PrintCircle2 {

    public static void main(String[] args) {
        printCirclePythagoras(10);
        System.out.println();
    }

    public static void printCirclePythagoras(int radius) {
        //a2+b2=c2
        for (int i = -radius; i < radius; i++) {
            for (int j = -radius; j < radius; j++) {
                double a = Math.sqrt((radius * radius) - (radius - i) * (radius - i));
                double b = Math.sqrt((radius * radius) - (radius - j) * (radius - j));

                if ((radius+radius)==(a*a)+(b*b)) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }

            }
            System.out.println();
        }
    }
}





