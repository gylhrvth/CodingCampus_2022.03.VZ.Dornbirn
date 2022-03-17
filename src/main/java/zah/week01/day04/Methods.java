package zah.week01.day04;

public class Methods {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            printGreetings(i % 2 == 0);

        }
    }

    public static void printGreetings(boolean printGoodDay) {
        if (printGoodDay) {
            System.out.println("GutenTag!");
        } else {
            System.out.println("GuteNacht!");
        }
    }
}
