package murat.week5.day5;

public class ReplaceAllExercises {
    public static void main(String[] args) {

        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        int eraseKey = 4;  // 1 for lower cases, 2 for upper cases, 3 for blanks, 4 for exclamation marks
        //replaceAllVersion1(text);
        replaceAllVersion2(text, eraseKey);

    }

    public static void replaceAllVersion1(String aText) {

        aText = aText.replaceAll("wird", "war");
        aText = aText.replaceAll("wird", "ist");

        System.out.println(aText);
    }

    public static void replaceAllVersion2(String aText, int key) {

        if (key == 1) {
            System.out.println("\nLower cases were removed.");
            aText = aText.replaceAll("[a-z]+", "");
            System.out.println(aText);
        } else if (key == 2) {
            System.out.println("\nUpper cases were removed.");
            aText = aText.replaceAll("[A-Z]+", "");
            System.out.println(aText);
        } else if (key == 3) {
            System.out.println("\nBlanks were removed.");
            aText = aText.replaceAll("[ ]+", "");
            System.out.println(aText);
        } else if (key == 4) {
            System.out.println("\nExclamation marks were removed.");
            aText = aText.replaceAll("[!]+", "");
            System.out.println(aText);
        } else {
            System.out.println("Please enter a valid value!");
        }

    }
}
