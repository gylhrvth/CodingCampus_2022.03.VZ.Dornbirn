package philipp.week05;

public class EmailRegex {

    public static void main(String[] args) {
        String regex = "[a-zA-Z]+[0-9]?.*@[a-zA-Z0-9]+[.]+[a-zA-Z0-9]{2,}";

        System.out.println("alfons@drlue.at".matches(regex));
        System.out.println("rambina.alfons@drlue.at".matches(regex));
        System.out.println("rambina1.1alfons@drlue.at".matches(regex));
        System.out.println("1rambina1.alfons@drlue.at".matches(regex));
        System.out.println("@drlue.at".matches(regex));
        System.out.println("drlue.at".matches(regex));
        System.out.println("asdf@drlue".matches(regex));
        System.out.println("asdf@microsoft.c".matches(regex));
    }
}
