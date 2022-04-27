package zah.week04;

public class CountLetter {
    public static void main(String[] args) {
        String text = lukas.week4.day4.Text.getSimpleText();

        System.out.println(text);
        int[] count = countLetters(text);

        for (int i = 1; i < count.length; i++) {
            if (count[i] > 0){
                System.out.println((i-1) + " " + (char)(i-1) + " has been found: " + count[i]);
            }
        }
        System.out.println("... und weitere " + count[0] + " Charakters.");
    }

    public static int[] countLetters(String text){
        char[] chars = text.toCharArray();

        int[] count = new int[128 + 1];

        for (int i = 0; i < chars.length; i++) {
            if (((int)chars[i] >= 0) && ((int)chars[i] < count.length)){
                ++count[1 + (int)chars[i]];
            } else {
                ++count[0];
            }
        }
        return count;
    }

}

