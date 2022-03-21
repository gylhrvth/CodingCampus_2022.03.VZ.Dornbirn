package zah.week02;

public class DataTypeDay01 {
    public static void main(String[] args) {
        floatingPointVariableExampleVariable();


    }
        public static void IntegerVariable(String[] args){

        //Integer Variable
        byte a= 0; // 8 Bit
        short b= 0;  // 16 Bit
        int c = 0; // 32 Bit
        long d = 0; // 64 Bit
        System.out.println(100);
        a = 100;
        d = 100L;
        //a = 100L; // Es ghet nicht!
        a = (byte) 100L;

        d= 123456789L;
        a = (byte) d;
        System.out.println( d+ " " + a);
        System.out.println(2 +a);
        System.out.println(a - 10);
        System.out.println( a * 5);
        System.out.println( d/ 1234);
        System.out.println( d% 1234);
    }
    public static void floatingPointVariableExampleVariable(){
        //+/- 3.45687307 ( *10 ^ +/- 4)
        // 3.456 * 10^4 == 3.456    >>>>>>> 34560
        // 8.112 *10^-3== 8.122      >>> 0.008112
        float fVariable = (float) 2.25;
        fVariable = 2.25f;
        double dVariable= 2.25;
        System.out.println( 2 + fVariable);
        System.out.println(fVariable- 10);
        System.out.println( 10* fVariable);
        System.out.println( fVariable/1234);



    }
}
