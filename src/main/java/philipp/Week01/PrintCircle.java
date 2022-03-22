package philipp.Week01;

public class PrintCircle {

    public static void main(String[] args) {
        printCirclePythagoras(10);
        System.out.println();
        printCirclePythagoras2(10);
        System.out.println();
    }

        public static void printCirclePythagoras(int radius) {
        //a2+b2=c2
        for (int i = 0; i < radius * 2; i++) {
            for (int j = 0; j < radius * 2; j++) {
                if ((radius * radius) > ((radius - j) * (radius - j)) + (((radius - i)*2.6) * ((radius - i)*2.6))) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printCirclePythagoras2(int radius) {
        //a2+b2=c2
        for (int i = 0; i < radius * 2; i++) {
            for (int j = 0; j < radius * 2; j++) {
                if ((radius * radius) > ((radius - j) * (radius - j)) + ((radius - i) * (radius - i))) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






