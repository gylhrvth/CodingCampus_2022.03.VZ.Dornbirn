package gyula.week05;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Locale;

public class StringExamples {
    private static String testString = "Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared.";


    public static void main(String[] args) {
        System.out.println("startWith(\"Strings\"): " + testString.startsWith("Strings"));
        System.out.println("startWith(\"can be shared.\"): " + testString.startsWith("can be shared."));
        System.out.println("endWith(\"Strings\"): " + testString.endsWith("Strings"));
        System.out.println("endWith(\"can be shared.\"): " + testString.endsWith("can be shared."));

        System.out.println("equals(\"Hello World\"): " + testString.equals("Hello World"));
        System.out.println("equalsIgnoreCase(\"HELLO WORLD\"): " + testString.equalsIgnoreCase("HELLO WORLD"));
        System.out.println("contains(\"values cannot be\")" + testString.contains("values cannot be"));

        System.out.println("AAAA".concat("BBBB"));
        System.out.println("AAAA" + "BBBB");

        System.out.println("indexOf(\"ca\"): " + testString.indexOf("ca"));
        System.out.println("indexOf(\"XXXXX\"): " + testString.indexOf("XXXXX"));
        System.out.println("indexOf(\"a\"): " + testString.indexOf("a"));
        System.out.println("indexOf(\"a\", 20): " + testString.indexOf("a", 20));
        System.out.println("lastIndexOf(\"ca\"): " + testString.lastIndexOf("ca"));

        System.out.println("isBlank(): " + testString.isBlank());
        System.out.println("\"      \".isBlank(): " + "      ".isBlank());
        System.out.println("\"      \".isEmpty(): " + "      ".isEmpty());
        System.out.println("length(): " + testString.length());
        System.out.println("#" + "   abc    "        + "#");
        System.out.println("#" + "   abc    ".trim() + "#");
        System.out.println("#" + "   abc    ".stripLeading() + "#");
        System.out.println("#" + "   abc    ".stripTrailing() + "#");

        System.out.println("ABC".repeat(10));

        System.out.println(testString.substring(testString.indexOf("ca")));
        int position = testString.indexOf("buf");
        System.out.println(testString.substring(position, 12 + position));

        System.out.println(testString.toLowerCase());
        System.out.println(testString.toUpperCase());

        // Format Funktion
        System.out.println(String.format("*%d* *%5d* *%-5d*", 10, 10, 10));
        System.out.println(String.format("*%x* *%5x* *%-5x*", 31, 31, 31));
        System.out.println(String.format("*%f* *%10.3f* *%-10.3f*", 3.141520f, 3.141520f, 3.141520f));

        System.out.println(String.format("*%1$s* *%1$10s* *%1$-10s*", "Apfel"));


        Date now = new Date();
        System.out.println(String.format("Today:%n%1$te %1$tb %1$tY", now));
        System.out.printf("Today:%n%1$te %1$tb %1$tY%n", now);



        // Regex: matches, replace, split
        String emailToTest = "gyula.horvath@digitalcampusvorarlberg.at";
        System.out.println(emailToTest + " " + emailToTest.matches("[a-zA-Z.]+@[a-zA-Z]+.[a-zA-Z.]+"));
        emailToTest = "GyUlA.HoRvAtH@digitalCAMPUSvorarlberg.at";
        System.out.println(emailToTest + " " + emailToTest.matches("[a-zA-Z.]+@[a-zA-Z]+.[a-zA-Z.]+"));
        emailToTest = "gyula.horvath2@digitalcampusvorarlberg.at";
        System.out.println(emailToTest + " " + emailToTest.matches("[a-zA-Z.]+@[a-zA-Z]+.[a-zA-Z.]+"));
        emailToTest = "@digitalcampusvorarlberg.at";
        System.out.println(emailToTest + " " + emailToTest.matches("[a-zA-Z.]+@[a-zA-Z]+.[a-zA-Z.]+"));
        emailToTest = "gyula.horvath@";
        System.out.println(emailToTest + " " + emailToTest.matches("[a-zA-Z.]+@[a-zA-Z]+.[a-zA-Z.]+"));
        emailToTest = "gyula.horvath@digitalcampusvorarlberg.";
        System.out.println(emailToTest + " " + emailToTest.matches("[a-zA-Z.]+(@[a-zA-Z]+.)+[a-zA-Z]+"));


    }
}
