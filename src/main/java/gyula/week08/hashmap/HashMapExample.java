package gyula.week08.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> dayNames = new HashMap<>();

        dayNames.put(1, "Montag");
        dayNames.put(2, "Dienstag");
        dayNames.put(3, "Mittwoch");

        for (int i = 0; i < 6; i++) {
            if (dayNames.containsKey(i)){
                System.out.println(i + ": " + dayNames.get(i));
            } else {
                System.out.println(i + " ist Wochenende!");
            }
        }
        dayNames.remove(2);
        dayNames.put(3, "Wednesday");
        System.out.println(dayNames);

        for (Integer key: dayNames.keySet()){
            System.out.println("Key: " + key + " Value: " + dayNames.get(key));
        }
/*
        Integer[] keys = dayNames.keySet().toArray(new Integer[0]);
        for (int i = 0; i < keys.length; i++) {
            System.out.print(dayNames.get(keys[i]) + " ");
        }
        System.out.println();
*/


        HashMap<Integer, List<Integer>> listMap = new HashMap<>();
        List<Integer> data = new Vector<>();
        for (int i = 1; i < 10; i++) {
            data.add(10 * i);
            List<Integer> currentData = new Vector<>(data);
            listMap.put(i, currentData);
        }
        System.out.println(listMap);

        listMap.get(3).add(13);
        System.out.println(listMap);

    }
}
