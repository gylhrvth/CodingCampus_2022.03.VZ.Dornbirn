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
                if ((radius * radius) > ((radius - i) * (radius - i)) + ((radius - j) * (radius - j))) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






