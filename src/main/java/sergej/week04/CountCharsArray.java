package sergej.week04;

public class CountCharsArray {

    
    public static void countChars(char[] array) {
        int[] count = new int[array.length];

        char charr[] = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            charr[i] = array[i];
            int counter = 0;
            for (int j = 0; j <= i; j++) {

                if (array[i] == charr[j]) {
                    counter++;
                }
            }
            System.out.print(charr[i] + " ");
            System.out.println(counter);
        }

    }

    public static void main(String[] args) {
        char[] arrChar = "Hallo Welt".toCharArray();
        countChars(arrChar);

    }
}
