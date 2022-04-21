package sergej.week05;

public class SplitString {

    public static String[] splitString(String text, String replaceWord) {
        String[] splitText = text.split(replaceWord);
        return splitText;
    }

    public static void newText(String[] text){
        StringBuilder word = new StringBuilder();
        String linesep = System.lineSeparator();

        for (int i = 0; i < text.length; i++) {
            word.append(text[i]+linesep);


        }
        System.out.println(word);
    }

    public static void main(String[] args) {

        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";

        String[] words = splitString(text, "Tag");
        newText(words);

    }
}
