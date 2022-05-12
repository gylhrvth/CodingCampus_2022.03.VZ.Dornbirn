package zah.week07.hashMap;

import java.util.HashMap;

public class HashMapCoutLetters {
    public static void main(String[] args) {
        String text = lukas.data.Texts.getSimpleText();
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character nextChar = text.charAt(i);
            if (count.containsKey(nextChar)){
                count.put(nextChar, count.get(nextChar) + 1);

            } else {
                count.put(nextChar, 1);
            }
        }
        System.out.println(count);
    }

}
