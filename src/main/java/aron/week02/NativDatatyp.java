package aron.week02;

import com.sun.jdi.Value;

public class NativDatatyp {
    public static void main(String[] args) {
        //printstep(100);
        System.out.println();
        //printDivideEtImpera();
        System.out.println();
        //printLeibniz(100);
        //System.out.println("*********************************************");
        //System.out.println(Math.PI);
        // printNilakantha(100);
        System.out.println();
        //printsecretRow();
        System.out.println();
        printGuessPlay(100);
    }

    public static void printstep(float Value) {

        for (float i = 0.0f; i <= Value; i = i + 0.1f) {
            System.out.println(i);
        }
        System.out.println(4 % 3);


    }

    public static void printDivideEtImpera() {

        System.out.println(4 / 3f);

        System.out.println(4 / 5f);

        System.out.println(4 / 7f);
    }

    public static void printLeibniz(int countofintegration) {

        double myPi = 0.0;
        int denotiator = 1;

        for (int i = 0; i <= countofintegration; i++) {
            if (i % 2 == 0) {
                myPi = myPi + (4.0 / denotiator);
            } else {
                myPi = myPi - (4.0 / denotiator);
            }
            denotiator = denotiator + 2;
        }
        System.out.println(myPi);

    }

    public static void printNilakantha(int countofintegration) {

        double myPi = 3.0;
        double denotiator = 2;

        for (int i = 0; i <= countofintegration; i++) {

            if (i % 2 == 0) {
                myPi = myPi + (4 / ((denotiator) * (denotiator + 1) * (denotiator + 2)));
            } else {
                myPi = myPi - (4 / ((denotiator) * (denotiator + 1) * (denotiator + 2)));

            }
            denotiator = denotiator + 2;

            System.out.println(myPi);
        }
    }

    public static void printsecretRow() {
        double value = 1.0;
        for (int i = 0; i < 100; i++) {
            value = value / 2 + 1 / value;
            System.out.println(value);
        }

    }

    public static void printGuessPlay(double input) {
        double min = 1.0;
        double max = input;
        double target = 0.0;

        //for (int i = 0; i < 100; i++)
        while (target * target != input) {
            target = min + (max - min) / 2;
            if (target * target > input) {
                max = target;
                System.out.println(target);
            } else {
                min = target;
                System.out.println(target);
            }
        }
    }
}








