package murat.week2;

public class DataTypeExample {
    public static void main(String[] args) {

        // intVariables();
        floatingPointExample();

    }

    public static void intVariables() {
        // Integer Variation
        byte a = 0;     // 8 Bit
        short b = 0;    // 16 Bit
        int c = 0;      // 32 Bit
        long d = 0;     // 64 Bit

        System.out.println(100);
        a = 100;
        d = 100L;
        // a =100L // Es geht nicht!!!
        a = (byte) 100L;
        d = 123456789L;
        a = (byte) d;
        System.out.println("d: " + d + " a: " + a);
        System.out.println("2+a= " + (2 + a));
        System.out.println("a-10= " + (a - 10));
        System.out.println("a*5 = " + (a * 5));
        System.out.println("d/1234 = " + (d / 1234));
        System.out.println("d % 1234 = " + (d % 1234));
    }

    public static void floatingPointExample() {
        // +/- 3.45687387 (*18^ +/- 4)
        // 3.456 * 18^4 ===> 34568

        // 8,112 * 10^-3 ==> 0,008112

        float fVariable = (float) 2.25;
        fVariable = 1.55f;
        double dVariable = 2.25;
        System.out.println(2 * fVariable);
        System.out.println(fVariable-10);
        System.out.println(fVariable*5);
        System.out.println(fVariable/1234);

    }
}
