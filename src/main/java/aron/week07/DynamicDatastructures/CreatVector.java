package aron.week07.DynamicDatastructures;

import java.util.Random;
import java.util.Vector;

public class CreatVector {

    static Random rand = new Random();
    static Random rand2 = new Random();

    static Vector<Integer> v = new Vector<>();
    static Vector<Integer> v2 = new Vector<>(20);
    static Vector<Integer> v3 = new Vector<>(20);


    public static void main(String[] args) {
        task1();
        System.out.println(v);
        System.out.println();

        System.out.println("Gerade Zahl:");
        task2();
        System.out.println();
        System.out.println();

        System.out.println("Kleinste Zahl:");
        task3();
        System.out.println();
        System.out.println();

        System.out.println("Groesste Zahl:");
        task4();
        System.out.println();
        System.out.println();

        System.out.println("Sotieren:");
        task5();
        System.out.println();
        System.out.println();

        System.out.println("Alle Ungraden Zahlen Geloescht:");
        task6();
        System.out.println();
        System.out.println();

        System.out.println(" =============== ");
        mergeVector();
        System.out.println();
        System.out.println();
    }

    public static void task1() {
        for (int i = 0; i < 20; i++) {
            int randnum = rand.nextInt(99);
            v.add(randnum);

        }

    }

    public static void task2() {
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 == 0) {
                System.out.print(v.get(i) + " ");
            }

        }
    }


    public static void task3() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) < min) {
                min = v.get(i);
            }
        }
        System.out.println(min);

    }

    public static void task4() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) > max) {
                max = v.get(i);
            }
        }
        System.out.println(max);
    }

    public static void task5() {
        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < v.size() - i - 1; j++) {
                if (v.get(j) > v.get(j + 1)) {
                    swap(v, j, j + 1);
                }
            }
        }
        System.out.println(v);
    }

    public static void swap(Vector<Integer> v, int left, int right) {
        Integer swap = v.get(left);
        v.set(left, v.get(right));
        v.set(right, swap);
    }

    public static void task6() {
        for (int i = v.size() - 1; i >= 0; i--) {
            if (v.get(i) % 2 != 0) {
                v.remove(i);
            }
        }
        System.out.println(v);
    }

    public static void mergeVector() {

        int idxViktor = 0;
        int idxViktorette = 0;

        while (idxViktor < v.size() || idxViktorette < v2
                .size()) {
            if ((idxViktorette == v2.size()) ||
                    (idxViktor < v.size() && idxViktorette < v2.size() && v.get(idxViktor) < v2.get(idxViktorette))) {
                v3.add(v.get(idxViktor));
                ++idxViktor;
            } else {
                v3.add(v2.get(idxViktorette));
                ++idxViktorette;
            }
        }
        System.out.println(v3);

    }

}

