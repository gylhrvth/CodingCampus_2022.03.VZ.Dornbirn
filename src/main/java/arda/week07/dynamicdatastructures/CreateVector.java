package arda.week07.dynamicdatastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

import static arda.week04.day03.BubblesortString.swapThingy;

public class CreateVector {
    static final String RED = "\033[0;91m";
    static final String REDUNDA = "\033[4;31m";
    static final String RESET = "\033[0m";

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println(RED + "initial vector1: " + RESET);
        Vector<Integer> randomNumVec = task1(20, rand);
        Collections.sort(randomNumVec);
        System.out.println(randomNumVec);
        System.out.println(RED + "initial vector2: " + RESET);
        Vector<Integer> randomNumVec2 = task1(5, rand);
        Collections.sort(randomNumVec2);
        System.out.println(randomNumVec2);

        /*
        task2(randomNumVec);
        task3(randomNumVec);
        task4(randomNumVec);
        task5(randomNumVec);
        task6(randomNumVec);
         */

        Vector<Integer> result = mergeVectors(randomNumVec, randomNumVec2);
        System.out.println(result);
    }

    public static Vector<Integer> task1(int size, Random rand) {
        Vector<Integer> viktor = new Vector<>();
        for (int i = 0; i < size; i++) {
            int randomNum = rand.nextInt(100);
            viktor.add(randomNum);
        }
        return viktor;
    }

    public static void task2(Vector<Integer> viktor) {
        System.out.println();
        System.out.println(RED + "all even numbers: " + RESET);
        int counter = 0;
        for (int i = 0; i < viktor.size(); i++) {
            if (viktor.get(i) % 2 == 0) { //Modulo 2 asks if the given number can be divided by two without a rest.
                System.out.print(viktor.get(i) + " ");

                counter++;
            }
        }
        System.out.println("\namount of even numbers: " + RED + counter + RESET);
    }

    public static void task3(Vector<Integer> viktor) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < viktor.size(); i++) {
            if (viktor.elementAt(i) < min) {
                min = viktor.elementAt(i);
            }
        }
        System.out.println();
        System.out.println(viktor);
        System.out.println(RED + "the smallest number: " + RESET + REDUNDA + min + RESET);
    }

    public static void task4(Vector<Integer> viktor) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < viktor.size(); i++) {
            if (viktor.elementAt(i) > max) {
                max = viktor.elementAt(i);
            }
        }
        System.out.println();
        System.out.println(viktor);
        System.out.println(RED + "the biggest number: " + RESET + REDUNDA + max + RESET);
    }

    public static void task5(Vector<Integer> viktor) {
        System.out.println();
        System.out.println(RED + "sorted vector: " + RESET);
        for (int i = 1; i < viktor.size(); i++) {
            for (int j = 0; j < viktor.size() - 1; j++) {
                if (viktor.get(j) > viktor.get(j + 1)) {
                    vectorSwap(viktor, j, j + 1);
                }
            }
        }
        System.out.println(viktor);
    }

    public static void task6(Vector<Integer> viktor) {
        System.out.println();
        System.out.println(RED + "Deleted all uneven numbers: " + RESET);
        for (int i = viktor.size() - 1; i >= 0; i--) {
            if (viktor.get(i) % 2 != 0) {
                viktor.remove(i);
            }
        }
        System.out.println(viktor);
    }

    public static Vector<Integer> mergeVectors(Vector<Integer> viktor, Vector<Integer> viktorette) {
        Vector<Integer> vincent = new Vector<>();
        System.out.println();
        System.out.println("son of two parent vectors: ");

        int idxViktor = 0;
        int idxViktorette = 0;

        while (idxViktor < viktor.size() || idxViktorette < viktorette.size()) {
            if ((idxViktorette == viktorette.size()) ||
                (idxViktor < viktor.size() && idxViktorette < viktorette.size() && viktor.get(idxViktor) < viktorette.get(idxViktorette))) {
                vincent.add(viktor.get(idxViktor));
                ++idxViktor;
            } else {
                vincent.add(viktorette.get(idxViktorette));
                ++idxViktorette;
            }
        }

        return vincent;
    }

    public static void vectorSwap(Vector<Integer> viktor, int i, int j) {
        Integer swap = viktor.get(i);
        viktor.set(i, viktor.get(j));
        viktor.set(j, swap);
    }
}
