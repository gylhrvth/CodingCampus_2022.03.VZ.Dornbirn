package arda.week5.day04;

import arda.week05.day04.LongestCommonSubString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubStringTest {
    @Test
    public void findLongestCommonWord() {
        String input1 = "hallo";
        String input2 = "hallo ich bin hier";
        String result = LongestCommonSubString.findLongestCommonWord(input1, input2);
        //String noWord = LongestCommonSubString.ifNoCommonWord(result);
        //cant work since there is no method return and I cant return an error message
        //so how would I test this in the first place???
        Assertions.assertEquals("hallo", result);

        input1 = "hallo asdf xyz";
        input2 = "supercool";
        result = LongestCommonSubString.findLongestCommonWord(input1, input2);
        Assertions.assertEquals("supercool", result);
    }
}
