package sergej.week05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubTest {
    @Test
    public void testGetLongestEqualword() {
        String text1 = "Timokant Sergej Aron";
        String text2 = "Murat Razvan Timokant";
        String result = LongestSub.getLongestEqualword(text1, text2);
        Assertions.assertEquals("Timokant", result);

        text1 = "Aron";
        text2 = "Murat Razvan Timokant";
        result = LongestSub.getLongestEqualword(text1, text2);
        Assertions.assertEquals("", result);

        text1 = "Aron           Razvan12";
        text2 = "Murat                 Razvan12 Timokant";
        result = LongestSub.getLongestEqualword(text1, text2);
        Assertions.assertEquals("Razvan12", result);


        Assertions.assertArrayEquals(new String[]{"Aron", "", "", "", "", "", "", "", "", "", "", "Razvan12"}, text1.split(" ",0));
    }
}
