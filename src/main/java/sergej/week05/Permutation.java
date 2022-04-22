package sergej.week05;

public class Permutation {

    public static void permutation(char[] chars, int index) {


        if (index == chars.length - 1) {
            System.out.println(chars);
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
        String text = "ABC";
        char chars[] = text.toCharArray();
        permutation(chars, 0);


    }
}
