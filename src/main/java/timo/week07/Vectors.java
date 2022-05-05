package timo.week07;

import java.util.Random;
import java.util.Vector;

public class Vectors {
    static Random rand = new Random();

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 20; i++) {
            v.add(rand.nextInt(100));
        }

        Vector<Integer> v2 = new Vector<>();
        for (int i = 0; i < 20; i++) {
            v2.add(rand.nextInt(100));
        }


        System.out.println(v);
        System.out.println();
        getEvenNumbers(v);
        System.out.println("--------------------------");
        System.out.println("The smallest number is: " + getSmallestNumber(v));
        System.out.println("--------------------------");
        System.out.println("The biggest number is: " + getBiggestNumber(v));
        System.out.println("--------------------------");
        System.out.println(bubblesortVector(v));
        System.out.println("--------------------------");
        // System.out.println(deleteOddNumbers(v));
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println(bubblesortVector(v));
        System.out.println(bubblesortVector(v2));
        System.out.println(generateNewVector(v, v2));

    }

    public static void getEvenNumbers(Vector<Integer> vector) {
        System.out.println("Following numbers are even: ");
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) % 2 == 0) {
                System.out.println(vector.get(i));
            }
        }
    }

    public static int getSmallestNumber(Vector<Integer> vector) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) < min) {
                min = vector.get(i);
            }
        }
        return min;
    }

    public static int getBiggestNumber(Vector<Integer> vector) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) > max) {
                max = vector.get(i);
            }
        }
        return max;
    }

    public static Vector<Integer> bubblesortVector(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            for (int j = 0; j < vector.size() - i - 1; j++) {
                if (vector.get(j) > vector.get(j + 1)) {
                    int swap = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, swap);
                }
            }
        }
        return vector;
    }


    public static Vector<Integer> deleteOddNumbers(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) % 2 != 0) {
                vector.removeElementAt(i);
                i--;
            }
        }
        return vector;
    }


    public static Vector<Integer> generateNewVector(Vector<Integer> v1, Vector<Integer> v2) {
        Vector<Integer> v3 = new Vector<>();
        int i = 0;
        int j = 0;
        while ((i < v1.size()) || (j < v2.size())) {
            if ((j == v2.size()) || (i < v1.size() && j < v2.size() && v1.get(i) < v2.get(j))) {
               v3.add(v1.get(i));
               i++;
            } else {
                v3.add(v2.get(j));
                j++;
            }

        }
        return v3;
    }
}



