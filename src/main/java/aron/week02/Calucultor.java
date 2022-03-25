package aron.week02;

import java.util.Scanner;

public class Calucultor {


    public static void main(String[] args) {


        float num1 = Float.MIN_VALUE;
        float num2 = Float.MIN_VALUE;
        String operator = "";
        boolean valiuOp = true;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        String answer;

        while (run) {


            double number = TryCaulator.numInput(sc);

            TryCaulator.valiuOP();

            TryCaulator.askUser();

            TryCaulator.calculationReturn(operator, num1, num2);



        }
    }
}
