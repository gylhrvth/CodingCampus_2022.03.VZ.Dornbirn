package timo.week03;

import java.util.Arrays;

import static timo.week03.ArraysRandom.generateRandomArray;

public class HeapsortArray {
    public static void main(String[] args) {

        int[] myArray = generateRandomArray(10);
        System.out.println(Arrays.toString(myArray));

        heapsortArray(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    public static void heapsortArray(int[] data) {
        buildHeap(data);
        int maxN = data.length - 1;
        while (maxN > 1) {
            int temp = data[0];
            data[0] = data[maxN];
            data[maxN] = temp;
            maxN--;
            siftDown(data, maxN, 0);
        }
    }

    public static void buildHeap(int[] data) {
        for (int i = data.length / 2; i >= 0; i--) {
            siftDown(data, data.length, i);
            System.out.println("buildHeap() " + Arrays.toString(data));
        }
    }

    public static void siftDown(int[] data, int maxN, int i) {
        System.out.println("shiftDown(..., " + maxN + ", " + i + ") " + Arrays.toString(data));
        if ((2 * i) >= maxN) {
            return;
        }
        int k = 2 * i;
        if ((2 * i + 1 < maxN) && (data[2 * i] <= data[2 * i + 1])) {
            k = k + 1;
        }
        if (data[i] < data[k]) {
            int temp = data[i];
            data[i] = data[k];
            data[k] = temp;
            siftDown(data, maxN, k);
        }
    }
}
