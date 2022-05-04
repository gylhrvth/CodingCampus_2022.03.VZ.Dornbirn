package sergej.week07;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class MyVector {

    public static int randomNum() {
        Random rand = new Random();
        int randNumber = rand.nextInt(100);

        return randNumber;
    }

    public static int countEven(Vector<Integer> list) {
        int count = 0;
        for (Integer a : list) {
            if (a % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static Vector<Integer> createRandomVlist() {
        Vector<Integer> randomList = new Vector<>();

        for (int i = 0; i < 20; i++) {
            randomList.add(randomNum());
        }
        return randomList;
    }

    public static int biggestNum(Vector<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer a : list) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }

    public static int smallestNum(Vector<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer a : list) {
            if (min > a) {
                min = a;
            }
        }
        return min;
    }

    public static void bubbleAscending(Vector<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (Integer j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j+1)) {
                    Integer swap = list.get(j);
                    list.set(j,list.get(j+1)) ;
                    list.set(j + 1,swap) ;
                }
            }
        }
        System.out.println(list);

    }

    public static void sort(Vector<Integer>list){
        Collections.sort(list,Collections.reverseOrder());
    }

    public static Vector<Integer> deleteOdd(Vector<Integer> list) {
        list.removeIf(a -> a % 2 != 0);
        return list;
    }





    public static void main(String[] args) {

        Vector<Integer> randomList = createRandomVlist();
        System.out.println(randomList);


        int evenNumCount = countEven(randomList);
        System.out.println("this manny even nums are in the list: " + evenNumCount);

        int maxNum = biggestNum(randomList);
        System.out.println("Biggest num in list is: " + maxNum);

        int minNum = smallestNum(randomList);
        System.out.println("Smallest num in list is: " + minNum);

        bubbleAscending(randomList);

        System.out.println(randomList);

        sort(randomList);

        Vector<Integer> removedOdd = deleteOdd(randomList);

        System.out.println(removedOdd);
    }

}
