package sergej.week04;

public class CountChars {

    public static void countChar(char[] array) {

        for (int i = 0; i < array.length; i++) {
            char temp = array[i];
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (temp == array[j]) {
                    count++;
                }
                System.out.println(temp + " " + count);
            }
            System.out.println(temp);
        }
    }


    public static void main(String[] args) {

        String text = lukas.week4.day4.Text.getSimpleText();
        char[] textChar = "aaaa".toCharArray(); //lukas.week4.day4.Text.getSimpleText().toCharArray();
        System.out.println(text);
        System.out.println(textChar);
        countChar(textChar);
    }
}
