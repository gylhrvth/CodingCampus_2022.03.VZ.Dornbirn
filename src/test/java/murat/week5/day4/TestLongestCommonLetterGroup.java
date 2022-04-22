package murat.week5.day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLongestCommonLetterGroup {
    @Test
    public void testFindLongestLetterGroup() {

        String text1 = "murat";
        String text2 = "kurat";
        String result = LongestCommonLetterGroup.findLongestLetterGroup(new StringBuilder(), text1, text2).toString();
        Assertions.assertEquals("urat", result);

        text1 = "murat";
        text2 = "kuratmurat";
        result = LongestCommonLetterGroup.findLongestLetterGroup(new StringBuilder(), text1, text2).toString();
        Assertions.assertEquals("murat", result);

        text1 = "köratmörat";
        text2 = "mörat";
        result = LongestCommonLetterGroup.findLongestLetterGroup(new StringBuilder(), text1, text2).toString();
        Assertions.assertEquals("mörat", result);

        text1 = "barabarbara";
        text2 = "";
        result = LongestCommonLetterGroup.findLongestLetterGroup(new StringBuilder(), text1, text2).toString();
        Assertions.assertEquals("", result);

        text1 = "muraaaat";
        text2 = "tarum";
        result = LongestCommonLetterGroup.findLongestLetterGroup(new StringBuilder(), text1, text2).toString();
        Assertions.assertEquals("m", result);

        text1 = "kuratmurat";
        text2 = "murat";
        result = LongestCommonLetterGroup.findLongestLetterGroup(new StringBuilder(), text1, text2).toString();
        Assertions.assertEquals("murat", result);

        text1 = "murat";
        text2 = "tarum";
        result = LongestCommonLetterGroup.findLongestLetterGroup(new StringBuilder(), text1, text2).toString();
        Assertions.assertEquals("m", result);

        text1 = "kurat murat";
        text2 = "murat";
        result = LongestCommonLetterGroup.findLongestLetterGroup(new StringBuilder(), text1, text2).toString();
        Assertions.assertEquals("murat", result);
    }

}
