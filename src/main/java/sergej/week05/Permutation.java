package sergej.week05;

public class Permutation {
    private static int count = 0;

    public static void permutation(char[] chars, int index) {


        if (index == chars.length - 1) {
            count++;
            System.out.println(count + ". " + String.valueOf(chars));
        }
        for (int i = index; i < chars.length; i++) {

            swap(chars, index, i);
            permutation(chars, index + 1);
            swap(chars, index, i);

        }

    }

    public static void swap(char[] chars, int indexA, int indexB) {
        char swap = chars[indexA];
        chars[indexA] = chars[indexB];
        chars[indexB] = swap;

    }

    public static void main(String[] args) {
        String text = "ABCDE";
        char chars[] = text.toCharArray();
        permutation(chars, 0);


    }
}
