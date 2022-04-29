package philipp.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadByWord {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\IdeaProjects\\CodingCampus_2022.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt";
        System.out.println(countWords(path));
        System.out.println("------");
//        replaceWords(path, "Please enter a word which should be replaced:",
//                "Please enter the replacement:");
    }

    private static void replaceWords(String path, String msgToReplace, String msgReplacement) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msgToReplace);
        String wordToReplace = sc.nextLine();
        System.out.println(msgReplacement);
        String wordReplacement = sc.nextLine();
        try {
            Scanner fsc = new Scanner(new File(path));
            File replacedWords = new File(path + "-"+wordToReplace+"_hasBeenReplacedBy_"+wordReplacement+".txt");
            PrintStream ps = new PrintStream(new FileOutputStream(replacedWords, false));
            while (fsc.hasNextLine()) {
                String tmp = fsc.nextLine();
                tmp = tmp.replace(wordToReplace, wordReplacement);
//              System.out.println(tmp);
                ps.println(tmp);
            }
            sc.close();
            fsc.close();
            ps.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static long countWords(String path) {
        long counter = 0;
        try {
            Scanner sc = new Scanner(new File(path));
            while (sc.hasNext()) {
                sc.next();
                counter++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return counter;
    }
}
