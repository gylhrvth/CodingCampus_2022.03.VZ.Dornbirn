package murat.week2.day1;

import java.text.DecimalFormat;

public class dataTypesTask2DivideEtImpera {
    public static void main(String[] args) {

        DivideEtImpera(10);
    }

    public static void DivideEtImpera(int number) {

        float oneThird =  number / 3f;            // Divide the number with 3
        float oneForth =  number / 4f;            // Divide the number with 4
        float oneSeventh = number / 7f;          // Divide the number with 7

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("The Number is: " + number + " One Third: " + df.format(oneThird) + " One Forth: " + df.format(oneForth) + " One Seventh: " + df.format(oneSeventh));

    }
}
