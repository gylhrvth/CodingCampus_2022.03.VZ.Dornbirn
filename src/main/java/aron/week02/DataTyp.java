package aron.week02;

public class DataTyp {
    public static void main(String [] args) {
        // Integer Variablen
    }

    public static void intVariable(String[]args){


    byte a = 0;     //8 bit
    short b = 0;    //16bit
    int c = 0;      //32 bit
    long d = 0;     //64bit

        System.out.println(100);
        a = 100;
        d = 100;
        //a 100; 77Es geht nicht!!!
        a = (byte)100;

        d = 123456789L;
        a =(byte)d;
        System.out.println(d + " " +a);

        System.out.println(2 + a);
        System.out.println(a -10);
        System.out.println(a * 5);
        System.out.println(d / 12324);
        System.out.println(d % 1234);
    }
public static void floatingPointExample(){

        //+/-3.4567307 (*10^ +/-4)

        // 3.45 * 10^4 ==> 34560

        //8.112 *18^-3 ==> 0.008112

        float fVariable = (float)2.25;
        //fVariable = 1.55f
        double  dVariable = 2.25;

    System.out.println(2 * dVariable);
    System.out.println(dVariable - 10);
    System.out.println(dVariable * 5);
    System.out.println(dVariable / 1234);


}
}

