package timo.week05;

public class Replace {
    public static void main(String[] args) {

        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        String numbers = "749813247132984712039487123049871204398712039487";


        // Replace "wird"
        String newText = text.replaceAll("wird", "war und ist");
        System.out.println(newText);

        // Replace lowercase
        String lowerCase = "[a-z]";
        String newText1 = text.replaceAll(lowerCase, "");
        System.out.println(newText1);

        // Replace uppercase
        String upperCase = "[A-Z]";
        String newText2 = text.replaceAll(upperCase, "");
        System.out.println(newText2);

        // Replace whitespace
        String whiteSpace = " ";
        String newText3 = text.replaceAll(whiteSpace, "");
        System.out.println(newText3);

        // Replace "!"
        String exclm = "!";
        String newText4 = text.replaceAll(exclm, "");
        System.out.println(newText4);

        // ----------------------------------------------------------------------

        // Replace 0-9
        String numbers09 = "[0-9]";
        String newNumbers1 = numbers.replaceAll(numbers09, "");
        System.out.println(newNumbers1);

        // Replace 1-9
        String numbers19 = "[1-9]";
        String newNumbers2 = numbers.replaceAll(numbers19, "");
        System.out.println(newNumbers2);

        // Replace 2-4
        String numbers24 = "[2-4]";
        String newNumbers3 = numbers.replaceAll(numbers24, "");
        System.out.println(newNumbers3);

        // Replace 1-3 & 6-9
        String numbers1369 = "[1-3]+[6-9]";
        String newNumbers4 = numbers.replaceAll(numbers1369, "");
        System.out.println(newNumbers4);

    }


}
