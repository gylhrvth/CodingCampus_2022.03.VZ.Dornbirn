package lukas.week6.day4;

import java.io.*;
import java.net.URL;
import java.util.Objects;

public class BufferedReaderExample {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(BufferedReaderExample.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")));
        printData(reader);

        InputStream inputStream = null;
        try {
            inputStream = new URL("https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html").openStream();
            printData(new InputStreamReader(inputStream));
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            if(inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
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
