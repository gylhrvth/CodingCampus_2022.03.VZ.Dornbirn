package murat.week2.day2;

public class WrapperClassExample {
    public static void main(String[] args) {

        try {
            int testValue = Integer.parseInt("Apfelsaft");
        } catch (NumberFormatException nfe) {
            System.out.println("The text can not be converted to a number");
        }

        int value = 20;
        Integer value2 = 20;
        int value3 = Integer.parseInt("20");
        System.out.println("Parse Integer: " + value3);
        System.out.println("Parse Integer Value2 toString: " + value2.toString());
        System.out.println("Parse Integer Integer.toString.Value3: " + Integer.toString(value3));

        byte byteValue = 5;
        Byte byteValue2 = byteValue;
        byte byteValue3 = Byte.parseByte("5");
        System.out.println("Parse Byte: " + byteValue3);

        double doubleValue = 3.4;
        Double doubleValue2 = 3.2;
        double doubleValue3 = Double.parseDouble("-3.33335");
        System.out.println("Parse Double: " + doubleValue3);
    }
}
