package lukas.week1.day3;

public class Methods {
    public static void main(String[] args) {
        System.out.println(addition(5, 10));
        int result = addition(5, 10);
        System.out.println(result);

        printTriangleBottomRight("x", 5);

        loop();
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static void loop() {
        //Die äußere Schleife wird 10 mal ausgeführt, das bedeutet dadurch wird
        //die innere Schleife 10 mal ausgeführt
        for (int i = 1; i <= 10; i++) {
            //Die innere Schleife hat hier keinen Bezug zur äußeren Schleife,
            //sie hat eine andere Zählvariable
            for (int j = 0; j < 5; j++) {
                System.out.print(i);
            }
            System.out.println("\\");
            System.out.println();
        }
    }

    public static void printTriangleBottomRight(String x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
