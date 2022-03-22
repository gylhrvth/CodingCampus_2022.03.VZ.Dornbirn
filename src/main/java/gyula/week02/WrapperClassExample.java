package gyula.week02;

public class WrapperClassExample {
    public static void main(String[] args) {
        int testValue;
        try {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i < j){
                        testValue = Integer.parseInt("99999999999999999999999999999999999999999999999999");
                    }
                }
            }
        } catch (NumberFormatException nfe){
            System.out.println("The text cannot be converted to value");
            testValue = -1;
        }




        int value = 20;
        Integer value2 = 20;
        int value3 = Integer.parseInt("20");
        System.out.println(value2.toString());
        System.out.println(Integer.toString(value3));

        byte byteValue = 5;
        Byte byteValue2 = byteValue;
        byte byteValue3 = Byte.parseByte("5");

        double doubleValue = 3.4;
        Double doubleValue2 = 3.2;
        double doubleValue3 = Double.parseDouble("-3.33335");
    }
}
