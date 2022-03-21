package timo.week02;

import java.sql.SQLOutput;

public class DataTypeExample {
    public static void main(String[] args) {

        // Integer Variablen
        byte a = 0; // 8 Bit
        short b = 0; // 16 Bit
        int c = 0; // 32 Bit
        long d = 0; // 64 Bit

        System.out.println(100);
        a = 100;
        d = 100L;
        // a = 100L; // Es geht nicht!
        a = (byte)100L;
        d = 123456789L;
        a = (byte)d;
        System.out.println(d + " " +a);

        System.out.println(2 + a);
        System.out.println(a - 10);
        System.out.println(a * 5);
        System.out.println(d / 1234);
        System.out.println(d % 1234);

    }

    public static void floatingPointExample() {
       // +/- 3.45687307 (*10^+/- 4)

        // 3.456 * 10^4 ==> 34560
        // 8.112 * 1ß^-3 ==> 0.008112


        float fVariable = (float)2.25;
        fVariable = 1.55f;
        double dVariable = 2.25;

        System.out.println(2 + fVariable);
        System.out.println(fVariable - 10);
        System.out.println(fVariable * 5);
        System.out.println(fVariable / 1234);
        System.out.println(fVariable % 1234);

    }

}
