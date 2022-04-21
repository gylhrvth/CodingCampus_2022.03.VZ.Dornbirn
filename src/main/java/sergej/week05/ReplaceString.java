package sergej.week05;

public class ReplaceString {

    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
        String newtext = text.replaceAll("wird", "war und ist");
        System.out.println(newtext);
    }
}
