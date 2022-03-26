package aron.week02;

public class VisitCardTry {
    public static void main(String[] args) {

       // topBottom("*", 25);

        printEmptySquare("*",7,20 );

    }
        public static void topBottom(String name, int amount) {
       int i = 0;
        while (i <= amount) {
            System.out.print(name);
            ++i;
        }
        System.out.println();
    }

        public static void printEmptySquare(String x, int size, int topsize) {
        topBottom(x, topsize);

        for (int i = 0; i < size - 2; )break; {
            System.out.print("******No Chaos*******");

        }
            System.out.println();
        topBottom(x, topsize);
    }
    }

