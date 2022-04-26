package philipp.week06;

public class SearchFileByNameRegex {

    public static void main(String[] args) {

//        String s= "[A-Z]*[Ee][Xx][Ee][Rr].*";
//        System.out.println("Apflesaft".matches(s));
//        System.out.println("Excel".matches(s));
//        System.out.println("Berexer".matches(s));
//        System.out.println("REGEXER".matches(s));
//        System.out.println("EREXEXER".matches(s));
        String test = "philipp";
        System.out.println(regExSearch(test));
    }

    public static String regExSearch(String input) {
        String regExSearch = ".*";
        for (int i = 0; i < input.length(); i++) {
            String s = input.substring(i, i + 1);
            regExSearch += ("[" + s.toLowerCase() + s.toUpperCase() + "]");
        }
        regExSearch += ".*";
        return regExSearch;
    }
}
