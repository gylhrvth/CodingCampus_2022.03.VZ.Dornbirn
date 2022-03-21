package murat.week2.day1;

public class DataTypeCastingExercises {
    public static void main(String[] args) {

        byteToInt();
        intToByte();
        intToLong();
        //longToInt();      // 50000000000 to Int -> Error: Integer number too large

    }

    public static void byteToInt() {

        // Byte to Integer
        byte muratByte = 10;
        int muratInt = 8500;
        muratInt = (int) muratByte;
        System.out.println("Byte 10 to Int: " + muratInt);
    }

    public static void intToByte() {

        // Integer to Byte
        byte muratByte = 10;
        int muratInt = 85000000;
        muratByte = (byte) muratInt;
        System.out.println("Int 85000000 to Byte: " + muratByte);
    }

    public static void intToLong(){

        // Integer to Long
        int muratInt = 8500;
        long muratLong = 5000000;
        muratLong = (long) muratInt;
        System.out.println("Int 8500 to Long: " + muratLong);
    }

    public static void longToInt(){

        // Long to Int
        int muratInt = 8500;
       // long muratLong = 50000000000;
       // muratInt = (int) muratLong;
       // System.out.println("Long 50000000000 to Int: "+ muratInt);
    }

}
