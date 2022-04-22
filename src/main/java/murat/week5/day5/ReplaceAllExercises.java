package murat.week5.day5;

public class ReplaceAllExercises {
    public static void main(String[] args) {

        String firstText = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";
        String secondText = "749813247132984712039487123049871204398712039487";

        int eraseKeyForText = 4;             // 1 for lower cases, 2 for upper cases, 3 for blanks, 4 for exclamation marks
        int eraseKeyForNumbers = 1;          // 1 for 1-9,  2 for 0-9, 3 for 2-4 and 4 for 1-3,6-9
        // replaceAllVersion1(firstText);
        // replaceAllVersion2(firstText, eraseKeyForText);
        replaceAllVersion3(secondText, eraseKeyForNumbers);

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

    public static void replaceAllVersion3(String aText, int key) {

        if (key == 1) {
            System.out.println("\nNumbers between 0-9 are removed.");
            aText = aText.replaceAll("[0-9]+", "");
            System.out.println(aText);
        } else if (key == 2) {
            System.out.println("\nNumbers between 1-9 are removed.");
            aText = aText.replaceAll("[1-9]+", "");
            System.out.println(aText);
        } else if (key == 3) {
            System.out.println("\nNumbers between 2-4 are removed.");
            aText = aText.replaceAll("[2-4]+", "");
            System.out.println(aText);
        } else if (key == 4) {
            System.out.println("\nNumbers between 1-3 and 6-9 are removed.");
            aText = aText.replaceAll("[1-36-9]+", "");
            System.out.println(aText);
        } else {
            System.out.println("Please enter a valid value!");
        }
    }
}
