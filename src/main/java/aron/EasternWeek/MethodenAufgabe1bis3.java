package aron.EasternWeek;

public class MethodenAufgabe1bis3 {

    public static void main(String[] args) {

        aufgabe1(" x", 10);
        System.out.println("-----");
        aufgabe2(" x", 3);
        System.out.println("-----");
        aufgabe3(" x", 3);
    }

    public static void aufgabe1(String name, int number) {
        int i = 0;
        while (i < number) {
            if (i > 0){
                System.out.print(" ");
            }
            System.out.print(name);
            ++i;
        }
        System.out.println();
    }

    public static void aufgabe2(String name, int number) {
        int i = 0;
        while (i < number) {
            System.out.println(name);
            ++i;
        }
        System.out.println(" ");
    }

    public static void aufgabe3(String name, int number) {
        aufgabe1(name, number);
        aufgabe2(name, number);

    }
}
