package lukas.week6.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

public class BufferedReaderExample {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(BufferedReaderExample.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        printData(reader);
    }

    private static void printData(Reader reader) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                String input = bufferedReader.readLine();
                System.out.println(input);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    //noop
                }
            }
        }
    }
}
