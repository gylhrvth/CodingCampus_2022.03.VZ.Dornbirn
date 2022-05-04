package sergej.week07;

import java.util.Vector;

public class VectorPermutation {

    private static int count = 0;

    public static void permutation(Vector<Character> chars, int index) {


        if (index == chars.size() - 1) {
            count++;
            System.out.println(count + ". " + chars);
        }
        for (int i = index; i < chars.size(); i++) {

            swap(chars, index, i);
            permutation(chars, index + 1);
            swap(chars, index, i);

        }

    }

    public static void swap(Vector<Character> chars, int indexA, int indexB) {
        char swap = chars.get(indexA);
        chars.set(indexA, chars.get(indexB));
        chars.set(indexB, swap);

    }
    public static void main(String[] args) {

        Vector<Character> text = new Vector<>();
        text.add('A');
        text.add('B');
        text.add('C');
        text.add('D');

        permutation(text,0);

    }
}
