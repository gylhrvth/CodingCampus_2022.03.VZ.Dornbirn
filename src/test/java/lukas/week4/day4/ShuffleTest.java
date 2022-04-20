package lukas.week4.day4;

import lukas.week4.day4.ShuffleArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleTest {
    @Test
    public void flakyIt() {
        for (int i = 0; i < 100; i++) {
            testShuffle();
        }
    }

    @Test
    public void testShuffle() {
        char[] testData = "Sergej".toCharArray();
        char[] originalData = "Sergej".toCharArray();

        ShuffleArray.shuffle(testData);

        int counter = 0;
        for (int i = 0; i < testData.length; i++) {
            if (testData[i] == originalData[i]) {
                counter++;
            }
        }
        Assertions.assertTrue(counter < testData.length / 2, "Array is not shuffled");

    }
}
