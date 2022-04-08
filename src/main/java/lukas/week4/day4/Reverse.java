package lukas.week4.day4;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("For loop");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("For loop with two count variables");
        for (int i = 0, j = 10; i != j; i++, j--) {
            System.out.println(i + " " + j);
        }

        System.out.println("For loop with additional count variables");
        int k = 10;
        for (int i = 0; k != i; i++) {
            System.out.println(i + " " + k);
            k--;
        }

        System.out.println("Reverse without second count variable");
        int arrLength = 10;
        for (int i = 0; i < arrLength / 2; i++) {
            //int endIndex = arrLength - i;
            System.out.println(i + " " + (arrLength - i));
        }
    }
}
