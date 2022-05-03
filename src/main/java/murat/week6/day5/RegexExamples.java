package murat.week6.day5;

public class RegexExamples {
    public static void main(String[] args) {

        String text1 = "123";
        System.out.println(text1 + " ===> [a-z]  ===> " + text1.matches("[a-z]"));
        System.out.println(text1 + " ===> [0-9]  ===> " + text1.matches("[0-9]"));
        System.out.println(text1 + " ===> [0-9]+ ===> " + text1.matches("[0-9]+"));

        String text2 = "2";
        System.out.println(text2 + " ===> \\d+  ===> " + text2.matches("\\d"));    // Digits
        System.out.println(text2 + " ===> ^d ===> " + text2.matches("^d"));    // Non-Digits

        String text3 = ".";
        System.out.println(text3 + " ===> . ===> " + text3.matches("."));

        String text4 = " ";
        System.out.println(text4 + " ===> \\s ===> " + text4.matches("\\s"));     // Blank

        String text5 = "aaaa";
        System.out.println(text5 + " ===> a{4} ===> " + text5.matches("a{4}"));   // Exactly 4 times
        String text6 = "aaa";
        System.out.println(text6 + " ===> a{4} ===> " + text6.matches("a{4}"));   // Exactly 4 times

        String text7 = "x";
        System.out.println(text7 + " ===> x? ===> " + text7.matches("x?"));    // Once or none
        String text8 = "xx";
        System.out.println(text8 + " ===> x? ===> " + text8.matches("x?"));    // Once or none
        String text10 = " ";
        System.out.println(text10 + " ===> x? ===> " + text10.matches("x?"));    // Once or none

        String text11 = "a";
        System.out.println(text11 + " ===> \\w ===> " + text11.matches("\\w"));    // Word character [a-zA-Z0-9]
        String text12 = "murat123";
        System.out.println(text12 + " ===> \\w+ ===> " + text12.matches("\\w+"));    // Word character [a-zA-Z0-9]

        String text9 = "a";
        System.out.println(text9 + " ===> [abc] ===> " + text9.matches("[abc]"));

        String text13 = "aa";
        System.out.println(text13 + " ===> [abc] ===> " + text13.matches("[abc]"));

        String text14 = "aa";
        System.out.println(text14 + " ===> [abc]+ ===> " + text14.matches("[abc]+"));

        String text15 = "abc";
        System.out.println(text15 + " ===> [abc] ===> " + text15.matches("[abc]"));

    }
}
