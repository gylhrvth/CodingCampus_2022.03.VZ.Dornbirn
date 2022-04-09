package murat.week4.day5;

// Compares the text with ASCII Table 32-126 and returns the number of characters
public class CountingLettersV1 {
    public static void main(String[] args) {

        String lukasText = lukas.week4.day4.Text.getSimpleText();
        System.out.println(lukasText);
        System.out.println();
        char[] wordsInAnArray = lukasText.toCharArray();

        // Fill a char array with the characters in ASCII No: 32-126
        char letter;
        char[] abc = new char[95];
        int inc = 0;
        for (letter = ' '; letter <= '~'; letter++) {
            abc[inc] = letter;
            inc++;
        }

        // Compare the characters with the text
        int counter;
        for (int i = 0; i < abc.length; i++) {

            counter = 0;
            for (int j = 0; j < wordsInAnArray.length; j++) {

                if (abc[i] == wordsInAnArray[j]) {
                    counter++;
                }
            }
            System.out.println(abc[i] + ": " + counter);
        }
    }

}
