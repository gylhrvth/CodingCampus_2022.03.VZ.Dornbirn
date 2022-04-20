package aron.EasternWeek;

public class ArrayAufgabe1 {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 23, 5, 12, 4, 4, 2, 5, 2, 10};
        int firstNum = arr[0];
        int lastNum = arr[arr.length - 1];
        System.out.println("First: " + firstNum + " ,Last: " + lastNum);

        int[] arr2 = new int[]{123, 19471, 1, 4, 15715, 15, 1, 5, 15, 1, -10, -100};
        int firstNum2 = arr2[0];
        int lastNum2 = arr2[arr2.length - 1];
        System.out.println("First: " + firstNum2 + " ,Last: " + lastNum2);

        int[] arr3 = new int[]{478199, 7812973, 12387123, 12, 3, 123, 12, 3, 1, 3, 1, 3, 1, 8, 9, 15, 1, 5, 1, 5, 1, 5, 15, 1, 5, 0};
        int firstNum3 = arr3[0];
        int lastNum3 = arr3[arr3.length - 1];
        System.out.println("First: " + firstNum3 +  " ,Last: " + lastNum3);
    }
}
