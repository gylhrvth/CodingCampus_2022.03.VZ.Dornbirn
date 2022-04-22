package philipp.week05;

public class SplitAndSortAndReplace {
    static String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";

    public static void main(String[] args) {

        System.out.println(wordSplit(text, "Tag"));
        System.out.println("---");
        System.out.println(wordSplitSort(text, " ", true));
        System.out.println("---");
        System.out.println(replaceWords(text, "wird", "war und ist"));
        System.out.println("---");
        replaceWords2(text);

    }
    private static void replaceWords2(String text) {
        String output = text.replaceAll("[a-zöäü]","");
        System.out.println(output);
        output = text.replaceAll("[A-Z]","");
        System.out.println(output);
        output = text.replaceAll("[ ]","");
        System.out.println(output);
        output = text.replaceAll("[!]","");
        System.out.println(output);
        System.out.println(text.replaceAll("[^A-Za!]", ""));
    }

    private static String replaceWords(String text, String wordToReplace, String toBeReplaced) {
        text = text.replace(wordToReplace, toBeReplaced);
        return text;
    }

    private static String wordSplit(String text, String parameter) {
        String[] data = text.split(parameter);
        StringBuilder sb = new StringBuilder();
        sb.append(data[0]);
        for (int i = 1; i < data.length; i++) {
            sb.append(System.lineSeparator());
            sb.append(data[i]);
        }
        return sb.toString();
    }

    private static String wordSplitSort(String text, String parameter, boolean asc) {
        String[] data = text.split(parameter);
        StringBuilder sb = new StringBuilder();
        data = bubbleSortString(data, true);
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    private static String[] bubbleSortString(String[] input, boolean asc) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (asc != (input[j].compareTo(input[j + 1]) < 0)) {
                    String swap = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = swap;
                }
            }
        }
        return input;
    }
}
