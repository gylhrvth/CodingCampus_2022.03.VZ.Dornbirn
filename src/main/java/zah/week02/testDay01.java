package zah.week02;

public class testDay01 {
    public static void main(String[] args) {
        //couter(100);
        //divide(4);
        //leibnitz(100);
        Nilakantha();


    }

    public static void couter(double value) {
        for (double i = 0; i < value; i = i + 0.1) {
            System.out.println(i);
        }
    }

    public static void divide(float value) {

        System.out.println(value);
        System.out.println(4 / 3);
        System.out.println(4 / 5);
        System.out.println(4 / 7);
    }

    public static void leibnitz(int countofInteration) {
        double myPi = 0.0;
        double denotiator = 1.0;

        for (int i = 0; i <= countofInteration; i++) {
            if (i % 2 == 0) {
                myPi = myPi + (4.0 / denotiator);
            } else {
                myPi = myPi - (4.0 / denotiator);
            }
            denotiator = denotiator + 2;
        }
        System.out.println(myPi);
    }

    public static void Nilakantha() {
        double myPi = 3.0;
        int denotiator = 2;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                myPi = myPi + (4.0 / ((denotiator) * (denotiator + 1) * (denotiator + 2)));
            } else {
                myPi = myPi - (4.0 / ((denotiator) * (denotiator + 1) * (denotiator + 2)));
            }
            denotiator = denotiator + 2;
        }
        System.out.println(myPi);


    }


}

