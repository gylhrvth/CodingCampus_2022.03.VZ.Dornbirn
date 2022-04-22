package zah.week05;

public class LongWords {
    public static void main(String[] args) {
        String text = "Hallo wie gehts razvanz  dir?";
        String text2 = "Mir gehts razvanz gut !";
        System.out.println(findTheLongWord(text, text2));

        String X = "Barbara";
        String Y = "Rhabarber";
        findTheLongCharacter(X,Y);



    }

    public static String findTheLongWord(String firstWord, String secondWord) {

        String[] first = firstWord.split(" ");
        String[] second = secondWord.split(" ");
        String word = "";
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i].equals(second[j]) && word.length() < first[i].length()) {
                    word = first[i];
                    break;
                }
            }
        }
        return word;
    }

    public static void findTheLongCharacter(String firstWord, String secondWord) {
       // StringBuilder sb = new StringBuilder();


        for (int i = 0; i < firstWord.length(); i++) {
            for (int j = 0; j < secondWord.length(); j++) {
                char x = firstWord.charAt(i);
                char x1 = secondWord.charAt(j);
                if (x ==x1) {
                    System.out.println(x);

                }else {
                    System.out.print(x1);
                }


            }

        }

    }

}



