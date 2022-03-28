package sergej.week03;

import java.util.Arrays;
import java.util.Scanner;

public class MyFirstArray {

    public static int userInput(Scanner sc) {
        int number = 0;

        System.out.println("Enter a number:");
        number = sc.nextInt();

        return number;
    }


    public static int[] ascendingNumbers(int number) {
        int[] mylist = new int[number];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = i + 1;
        }
        System.out.println(Arrays.toString(mylist));

        return mylist;
    }

    public static int[] descendingNumbers(int number) {
        int[] mylist = new int[number];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = number - i;
        }
        System.out.println(Arrays.toString(mylist));

        return mylist;

    }

    public static int[] makeCopy(int[] original) {
        int[] copyArray = new int[original.length];
        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] = original[i];
        }

        return copyArray;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userNumber = userInput(sc);
        // System.out.println(userNumber);
        //int[] testList = buildList(userNumber);
        //System.out.println(Arrays.toString(buildList(userNumber)));
        int[] testList = ascendingNumbers(userNumber);
        descendingNumbers(userNumber);

        int[] ascendingCopy = makeCopy(testList);
        ascendingCopy[0] = -100;
        System.out.println(Arrays.toString(testList));
        System.out.println(Arrays.toString(ascendingCopy));

        int[] testlistecopy = testList;


    }
}
