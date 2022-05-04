package murat.week7.day3;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class VectorExamples {
    public static void main(String[] args) {

        // Task 1
        Vector<Integer> vecti = task1CreateNewVector();
        System.out.println("\nGenerated vector is:: ");
        System.out.println(vecti);

        // Task 2
        task2FindEvenNumbers(vecti);

        // Task 3
        System.out.println("\n\nSmallest number is: ");
        System.out.println(task3FindSmallestNumber(vecti));

        // Task 4
        System.out.println("\nBiggest number is: ");
        System.out.println(task4FindBiggestNumber(vecti));

        // Task 5
        System.out.println("\nDescending sorted vector: ");
        task5SortVector(vecti);

        // Task 6
        System.out.println("\nOdd numbers are removed: ");
        task6RemoveOddNumbers(vecti);

        // Task 7
        System.out.println("\n2 merged vectors: ");
        System.out.println("Merged vector: " + task7MergeTwoVectors());

        // Task 8
        System.out.println("\nPermutation: ");
        implementPermutation();

    }

    public static Vector<Integer> task1CreateNewVector() {

        Vector<Integer> vec = new Vector<>();
        Random rand = new Random();
        int randomNumber;

        for (int i = 0; i < 20; i++) {
            randomNumber = rand.nextInt(99);
            vec.add(randomNumber);
        }
        return vec;
    }

    public static void task2FindEvenNumbers(Vector<Integer> aVector) {

        System.out.println("\nEven numbers are: ");
        for (int i = 0; i < aVector.size(); i++) {

            if ((aVector.get(i) % 2) == 0) {
                System.out.print(aVector.get(i) + " ");
            }
        }
    }

    public static int task3FindSmallestNumber(Vector<Integer> aVector) {

        int min = aVector.get(0);
        for (Integer i : aVector) {

            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int task4FindBiggestNumber(Vector<Integer> aVector) {

        int max = aVector.get(0);
        for (Integer i : aVector) {

            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void task5SortVector(Vector<Integer> aVector) {

        Collections.sort(aVector, Collections.reverseOrder());
        System.out.println(aVector);
    }

    public static void task6RemoveOddNumbers(Vector<Integer> aVector) {

        for (int i = 0; i < aVector.size(); i++) {
            if (aVector.get(i) % 2 != 0) {
                aVector.remove(i);
                i--;
            }
        }
        System.out.println(aVector);
    }

    public static Vector<Integer> task7MergeTwoVectors() {

        Vector<Integer> first = task1CreateNewVector();
        Vector<Integer> second = task1CreateNewVector();
        Vector<Integer> mergedVector = task1CreateNewVector();

        Collections.sort(first, Collections.reverseOrder());
        Collections.sort(second, Collections.reverseOrder());

        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        mergedVector.addAll(first);
        mergedVector.addAll(second);

        Collections.sort(mergedVector, Collections.reverseOrder());

        return mergedVector;
    }

    private static void implementPermutation() {

        Vector<Character> charVec = new Vector<>();

        charVec.add(0, 'A');
        charVec.add(1, 'B');
        charVec.add(2, 'C');
        charVec.add(3, 'D');

        permutation("", charVec);

    }

    private static void permutation(String prefix, Vector<Character> text) {

        int textLength = text.size();

        if (textLength == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < textLength; i++) {
                //System.out.println("i: " + i + " Combined_(Prefix): " + (prefix + text.get(i)) + " Chosen_Letter: " + text.get(i) + " Left: " + text.subList(0, i) + " Right: " + text.subList(i + 1, textLength) + " New_Text_to_Iterate: " + text.subList(i + 1, textLength) + text.subList(0, i));

                Vector<Character> merged = new Vector<>();
                merged.addAll(text.subList(i + 1, textLength));
                merged.addAll(text.subList(0, i));

                permutation(prefix + text.get(i), merged);
            }
        }
    }
}
