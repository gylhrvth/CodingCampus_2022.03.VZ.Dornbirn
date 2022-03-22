package philipp.Week02;

public class DataTypeVariables {
    public static void main(String[] args) {

        intVariables();
        floatingPointVariables();
        System.out.println();
        ZeroToHundred();
        System.out.println();
        DivideEtImpera();
        System.out.println();
        Leibniz();
        System.out.println();
        Nilakantha();
        System.out.println();
        SecretRow();
        System.out.println();
        guessingGame(25);
    }

    public static void intVariables() {

        //integer variables
        byte a = 0; // 8 Bit
        short b = 0; //16 Bit
        int c = 0; //32 Bit
        long d = 0; //64 Bit

        System.out.println(100);
        a = 100;
        d = 100L;
        // a = 100L; Does not work!
        a = (byte) 100L;
        d = 123456789L;
        a = (byte) d;
        System.out.println(d + " " + a);

        System.out.println(2 + a);
        System.out.println(a - 10);
        System.out.println(a * 5);
        System.out.println(d / 1234);
        System.out.println(d % 1234);

    }

    public static void floatingPointVariables() {
        // +/- 3.456789654 (*10^ +/- 4)
        // 3.456 *10^4 ==> 34560
        // 8.112*10^-3 ==> 0.008112

        float fVariable = (float) 2.25;
        fVariable = 1.55f;
        double dVariable = 2.25;

        System.out.println(2 + fVariable);
        System.out.println(fVariable - 10);
        System.out.println(fVariable * 5);
        System.out.println(fVariable / 1234);

        double testVariable = 15f;
        System.out.println((testVariable / 3.0) * 3.0);
    }

    public static void ZeroToHundred() {
        for (double i = 0; i <= 1; i += 0.1) {
            System.out.println(i);
        }
        System.out.println();
        for (int j = 0; j <= 10; j++) {
            System.out.println(j / 10f);
        }
    }

    public static void DivideEtImpera() {
        System.out.println(4);
        System.out.println(4 / 3f);
        System.out.println(4 / 5f);
        System.out.println(4 / 7f);
    }

    public static void Leibniz() {
        double myPi = 0.0;
        int denotiator = 1;
        for (int i = 0; i < 10000000; i++) {
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
        int j = 2;
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                myPi = myPi + (4.0 / (j * (j + 1) * (j + 2)));
            } else {
                myPi = myPi - (4.0 / (j * (j + 1) * (j + 2)));
            }
            j = j + 2;
        }
        System.out.println(myPi);
    }

    public static void SecretRow() {
        double v = 1.0;
        for (int i = 0; i < 10; i++) {
            v = (v / 2) + (1 / v);
            System.out.println(v);
        }
    }

    public static void guessingGame(double root) {

        double max = root;
        double min = 1.0;
        double x = 0.0;

        while (x * x != root) {

            x = min + ((max - min) / 2);

            if (x * x > root) {
                max = x;
            } else {
                min = x;
            }
            System.out.println(x);
        }
    }
}





