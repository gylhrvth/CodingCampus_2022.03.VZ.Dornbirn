package sergej.week05;

public class StringExamples {

    public static String testString = "Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared.";

    public static void main(String[] args) {

        System.out.println("start with: "+ testString.startsWith("Strings"));
        System.out.println("start with: "+ testString.startsWith("can be shared"));
        System.out.println("end with: "+ testString.endsWith("Strings"));
        System.out.println("end with: "+ testString.endsWith("can be shared."));

        System.out.println(testString.equals("Hello World"));
        System.out.println(testString.equalsIgnoreCase("VALUES"));


    }
}
