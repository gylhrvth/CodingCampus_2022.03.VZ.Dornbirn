package cemil.week02;

public class day1 {

    public static void ZeroToHundred(float limit) {
//        for (double i = 0; i <= limit; i += 0.1) {
//            System.out.println(i );
//        }
        System.out.println();
        for (int i = 0; i <= 10 * limit; i++) {
            System.out.println(i / 10.0);

        }
    }

    public static void DivideetImpera() {

    }

    public static void main(String[] args) {
        ZeroToHundred(20);
        System.out.println();
//        DivideetImpera(4);

    }
}
