package sergej.week02;

public class DataType {


    public static void intVariable() {

        // integer Variable
        byte a = 0; // 8 bit
        short b = 0;// 16 bit
        int c = 0; // 32 bit
        long d = 0;// 64 bit

        System.out.println(100);
        a = 100;
        d = 100L;
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

    public static void floatingPointExample() {

        //  +/- 3.45687307 (*10^ +/- 4)
        //  3.456 * 10^4 ==> 34560
        // 8.112 * 10^-3 ==> 0.008112  float comma
        float fvariable = (float) 2.25;
        fvariable = 1.55f;
        double dvariable = 2.25;

        System.out.println(2 + fvariable);
        System.out.println(fvariable - 10);
        System.out.println(fvariable * 5);
        System.out.println(fvariable / 1234);

    }

    public static void main(String[] args) {

        floatingPointExample();


    }

}


