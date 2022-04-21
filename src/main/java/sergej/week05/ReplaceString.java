package sergej.week05;

public class ReplaceString {

    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
        String newtext = text.replaceAll("wird", "war und ist");
        System.out.println(newtext);


        String regexLow = "[a-z]";
        String newtextLower = text.replaceAll(regexLow, "");
        System.out.println(newtextLower);

        String regexUpp = "[A-Z]";
        String newtextUpp = text.replaceAll(regexUpp,"");
        System.out.println(newtextUpp);


        String regexSpace = " ";
        String newtextSpace = text.replaceAll(regexSpace,"");
        System.out.println(newtextSpace);

        String regexEx = "!";
        String newtextEx = text.replaceAll(regexEx,"");
        System.out.println(newtextEx);
    }
}
