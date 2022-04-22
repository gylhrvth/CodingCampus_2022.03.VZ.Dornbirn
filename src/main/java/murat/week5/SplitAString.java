package murat.week5;

public class SplitAString {
    public static void main(String[] args) {

        StringBuilder buildString = new StringBuilder();
        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";

        String[] words = wordSplit(text, "Tag");

        for (int i = 0; i < words.length; i++) {
            buildString.append(words[i]).append(System.lineSeparator());
        }
        System.out.print(buildString);

    }

    public static String[] wordSplit(String aText, String aWord) {
        return aText.split(aWord);
    }

}
