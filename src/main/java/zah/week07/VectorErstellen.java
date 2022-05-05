package zah.week07;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class VectorErstellen {
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
        evenNUmber(v);
        System.out.println("-----------------");

        System.out.println(getSmallest(v));
        System.out.println(getBiger(v));
        absteigt(v);
       // deleteNotEvenNUmber(v);
        System.out.println("------------------------");
        Collections.sort(v);
        Collections.sort(v2);
        System.out.println(v);
        System.out.println(v2);
        System.out.println(generateNewVector(v,v2));

    }

    public static void evenNUmber(Vector<Integer> v) {
        for (int i = 0; i < 20; i++) {
            if (v.get(i) % 2 == 0) {
                System.out.print(" " + v.get(i));
            }
        }
    }

    public static int getSmallest(Vector<Integer> v) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) < min) {
                min = v.get(i);
            }
        }
        return min;
    }

    public static int getBiger(Vector<Integer> v) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) > max) {
                max = v.get(i);
            }
        }
        return max;
    }

    public static void absteigt(Vector<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.size() - 1 - i; j++) {
                if (v.get(j) < v.get(j + 1)) {
                    int swap = v.get(j);
                    v.set(j, v.get(j + 1));
                    v.set(j + 1, swap);
                }
            }
        }
        System.out.println(v);
    }
    public static void deleteNotEvenNUmber(Vector<Integer> v) {
        Vector<Integer> toDelete = new Vector<>();
        for (Integer i: v) {
            if (i % 2 != 0){
                toDelete.add(i);
            }
        }
        for (Integer i: toDelete){
            v.remove(i);
        }
        System.out.println(v);

        /*
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 != 0) {
                v.removeElementAt(i);
                --i;
            }
        }
        System.out.println(v);
         */
    }
    public static Vector<Integer> generateNewVector(Vector<Integer> v1,Vector<Integer> v2 ){
        Vector<Integer> v3 = new Vector<>();
        int i = 0;
        int j = 0;
        while ((i < v1.size()) || (j < v2.size())) {
            if ((j == v2.size()) ||
                (i < v1.size() && j < v2.size() && v1.get(i) < v2.get(j))) {
                v3.add(v1.get(i));
                ++i;
            }else {
                v3.add(v2.get(j));
                ++j;
            }
        }
        return v3;
    }
}




