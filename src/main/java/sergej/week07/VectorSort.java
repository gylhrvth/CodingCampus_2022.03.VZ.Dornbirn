package sergej.week07;

import java.util.Random;
import java.util.Vector;

public class VectorSort {

    public static int randomNum() {
        Random rand = new Random();
        int randNumber = rand.nextInt(100);

        return randNumber;
    }

    public static Vector<Integer> createRandomVlist() {
        Vector<Integer> randomList = new Vector<>();

        for (int i = 0; i < 20; i++) {
            randomList.add(randomNum());
        }
        return randomList;
    }

    public static Vector<Integer> bubbleDescend(Vector<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (Integer j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    Integer swap = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, swap);
                }
            }
        }

        return list;

    }


    public static void merge(Vector<Integer> list1, Vector<Integer> list2) {

        Vector<Integer> merged = new Vector<>();
        for (int i = 0; i < list1.size() - 1; i++) {
            if (list1.get(i) >= list2.get(i)) {
                merged.add(list1.get(i));
            } else {
                merged.add(list2.get(i));
            }
        }
        System.out.println(merged);

    }


    public static void main(String[] args) {

        Vector<Integer> list1 = createRandomVlist();
        Vector<Integer> list2 = createRandomVlist();

        Vector<Integer> list1Sorted = bubbleDescend(list1);
        Vector<Integer> list2Sorted = bubbleDescend(list2);
        System.out.println("Sorted List1:" + list1Sorted);
        System.out.println("Sorted List2:" + list2Sorted);


        Vector<Integer> listFinal = new Vector<>();

        listFinal.addAll(list1Sorted);
        listFinal.addAll(list2Sorted);

        //System.out.println(listFinal);

        Vector<Integer> listFinalSorted = bubbleDescend(listFinal);

        // System.out.println(listFinalSorted);

        merge(list1Sorted, list2Sorted);

    }
}
