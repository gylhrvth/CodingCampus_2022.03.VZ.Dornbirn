package zah.osterFerie;

public class EasterHoliday {
    public static void main(String[] args) {

        countToTen(10, 0);
        System.out.println("---------------");
        countFrom30(-30, 30);
        System.out.println("----------------");
        countWithWhile(0, 10);
        System.out.println("---------------");
        lineStipple("X", 10);
        System.out.println("---------------");
        rowStipple("X", 3);
        System.out.println("----------------");
        stippleL();


    }

    public static void countToTen(int limitStart, int limitEnd) {
        for (int i = limitStart; i >= limitEnd; i--) {
            System.out.print(" " + i);
        }
    }

    public static void countFrom30(int limitStart, int limitEnd) {
        for (int i = limitStart; i <= limitEnd; i += 3) {
            System.out.println(i);
        }
    }

    public static void countWithWhile(int min, int max) {
        while (min <= max) {
            if (min > 6) {
                System.out.println("");

            }
            System.out.println(min);
            min++;
        }
    }

    public static void lineStipple(String text, int size) {
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(text);
        }
        System.out.println();
    }

    public static void rowStipple(String text, int size) {
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                System.out.println("");
            }
            System.out.println(text);
        }
        System.out.println();
    }
    public static void stippleL(){
        lineStipple("X ",3);
        rowStipple("X",3);

    }

}
