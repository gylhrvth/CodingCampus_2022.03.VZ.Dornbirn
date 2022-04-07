package lukas.week4.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

@SuppressWarnings("unused")
public class Text {
    @SuppressWarnings("unused")
    public static String getSimpleText() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(Text.class.getClassLoader().getResourceAsStream("txt/simpleText.txt"))));
            StringBuilder builder = new StringBuilder();
            String input;
            while ((input = reader.readLine()) != null) {
                builder.append(input);
                builder.append(System.lineSeparator());
            }
            return builder.toString();
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
