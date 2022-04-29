package philipp.week06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordsOfFile {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String path = "assets/tmp/text.txt";
        countWordsFile(path);
        System.out.println("-----");

        System.out.println(replaceWordsFile("assets/tmp/large.txt", "Please enter a word which should be replaced:",
                "Please enter the replacement:"));
        System.out.println("-----");
    }

    private static String replaceWordsFile(String pathOfFile, String msgToReplace, String msgReplacement) {
        String text = "";
        System.out.println(msgToReplace);
        String wordToReplace = sc.nextLine();
        System.out.println(msgReplacement);
        String wordReplacement = sc.nextLine();
        try {
            FileReader fr = new FileReader(pathOfFile);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            while (br.ready()) {
                sb.append(br.readLine());
                sb.append("\n");
            }
            text = sb.toString();
            text = text.replace(wordToReplace, wordReplacement);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private static void countWordsFile(String path) {
        int counter = 0;
        StringBuilder text = new StringBuilder();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                text.append(br.readLine());
                text.append("\n");
            }
            String[] data = text.toString().split("[\\p{Space}|\\r\\n]");
            for (int i = 0; i < data.length; i++) {
                counter++;
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }

    private static String userInput(Scanner sc, String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }
}
