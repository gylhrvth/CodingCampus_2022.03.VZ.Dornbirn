package timo.week05;

public class StringExamples {
    public static String testString = "hello biatch sergej orasch";


    public static void main(String[] args) {
        System.out.println("startsWith: " + testString.startsWith("hello"));
        System.out.println("endsWith: " + testString.endsWith("biatch"));

        System.out.println("isEqual " + testString.equals("hello biatch"));
        System.out.println("contains " + testString.contains("biatch"));

        System.out.println("AAAA".concat(testString)); // = "+"

        System.out.println(testString.indexOf("ia"));

        System.out.println(testString.length());

        System.out.println(testString.repeat(5));

        System.out.println("isBlank(): " + testString.isBlank());
        System.out.println("\"      \".isEmpty(): " + " ".isEmpty());
        System.out.println("#" + "   abc   ".trim() + "#");

        String test = testString.substring(testString.indexOf("bi"));


        System.out.println(test);

        int position = testString.indexOf("bi");

        System.out.println(testString.substring(position, 19));

        System.out.println(testString.indexOf("j"));


        System.out.println(String.format("*%1$s* *%1$10s* *%1$-10s*", "Apfel", "Orange"));

        // Format Function


        String number = "0043664 3865873";
        String number2 = "+43664 3865873";

        System.out.println(number2.matches("[+|0-9]+\\s[0-9]+"));


    }


}
