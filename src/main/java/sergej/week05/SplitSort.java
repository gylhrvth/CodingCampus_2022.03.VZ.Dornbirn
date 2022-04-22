package sergej.week05;

public class SplitSort {

    public static String[] splitString(String text) {
        String[] splitText = text.split(" ");
        return splitText;
    }

    public static String[] sortString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }

    public static void swap(String[] array, int indexA, int indexB) {
        String swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }

    public static void newText(String[] text){
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length; i++) {
            word.append(text[i]+" ");

        }
        System.out.println(word);
    }

    public static void main(String[] args) {

        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
        String[] splitText = splitString(text);
        String[] sorted = sortString(splitText);
        newText(sorted);

    }
}
