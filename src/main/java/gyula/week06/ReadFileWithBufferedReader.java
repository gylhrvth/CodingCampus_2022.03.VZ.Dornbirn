package gyula.week06;

import java.io.*;

public class ReadFileWithBufferedReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("assets/tmp/gyula.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()){
                String line = br.readLine();
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
