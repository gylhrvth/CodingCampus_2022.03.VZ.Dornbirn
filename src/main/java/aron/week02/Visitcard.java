package aron.week02;

public class Visitcard {
    public static void main(String[] args) {

        top();
        borda();
        bottom();

    }

    public static void top() {
        int i = 0;
        float amount = 25.0f;


        while (i <= amount) {
            System.out.print("*");
            ++i;
        }
            System.out.print("");

    }

    public static void borda() {
        int i = 0;
        float size = 8.0f;


        for (int k = 0; i < size - 2; i++) {
            System.out.print("*");

            for (int j = 0; j < size - 2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void bottom() {

        int k = -1;
        float amount = 25.0f;


        while (k <= amount) {
            System.out.print("*");
            ++k;
        }
            System.out.print("");

    }


}





