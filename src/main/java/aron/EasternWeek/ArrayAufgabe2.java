package aron.EasternWeek;

import java.util.Arrays;

public class ArrayAufgabe2 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 23, 5, 12, 4, 4, 2, 5, 2, 10};
        int minValue = min(arr);
        System.out.println("Kleinste Zahl: " + minValue);
        int maxValue = max(arr);
        System.out.println("Größte Zahl: " + maxValue);
        float avarageValue = avarage(arr);
        System.out.println("Durchschnitts Zahl: " + avarageValue);

        int[] arr2 = new int[]{123, 19471, 1, 4, 15715, 15, 1, 5, 15, 1, -10, -100};
        int minValue2 = min(arr2);
        System.out.println("Kleinste Zahl: " + minValue2);
        int maxValue2 = max(arr2);
        System.out.println("Größte Zahl: " + maxValue2);
        float avarageValue2 = avarage(arr2);
        System.out.println("Durchschnitts Zahl: " + avarageValue2);

        int[] arr3 = new int[]{478199, 7812973, 12387123, 12, 3, 123, 12, 3, 1, 3, 1, 3, 1, 8, 9, 15, 1, 5, 1, 5, 1, 5, 15, 1, 5, 0};
        int minValue3 = min(arr3);
        System.out.println("Kleinste Zahl: " + minValue3);
        int maxValue3 = max(arr3);
        System.out.println("Größte Zahl: " + maxValue3);
        float avarageValue3 = avarage(arr3);
        System.out.println("Durchschnitts Zahl: " + avarageValue3);

    }

    public static int min(int[] data) {
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < Min) {
                Min = data[i];
            }
        }
        return Min;
    }

    public static int max(int[] data) {
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > Max) {
                Max = data[i];
            }
        }
        return Max;
    }

    public static float avarage(int[] data) {
        int summe = 0;
        for (int i = 0; i < data.length; i++) {
            summe += data[i];
        }

        return (float) summe / data.length;
    }


}
