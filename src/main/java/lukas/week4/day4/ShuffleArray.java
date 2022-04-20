package lukas.week4.day4;

import java.util.Random;

public class ShuffleArray {
    public static void shuffle(char[] letters) {
        Random random = new Random();
        for (int i = 0; i < letters.length; i++) {
            char swap = letters[i];
            int otherIndex = random.nextInt(letters.length);
            letters[i] = letters[otherIndex];
            letters[otherIndex] = swap;
        }
    }
}
