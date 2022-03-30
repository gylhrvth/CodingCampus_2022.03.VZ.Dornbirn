package sergej.week03;

import java.util.Arrays;

public class CocktailShakerSort {

    public static void cocktailShaker(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int move = low;
        while (low < high) {
            for (int i = high; i > low ; i--) {
                if (array[i - 1] > array[i]) {
                    int swap = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = swap;
                    move = i;
                }

            }
            low = move;
            for (int i = low; i < high ; i++) {
                if (array[i] > array[i + 1]) {
                    int swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                    move = i;
                }

            }
            high = move;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] newList = RandomArray.randomList(10);
        cocktailShaker(newList);

    }
}
