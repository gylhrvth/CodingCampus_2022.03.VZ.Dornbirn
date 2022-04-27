package gyula.week06;

import java.io.*;

public class ReadFileWithBufferedReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("assets/tmp/gyula.txt");
            BufferedReader br = new BufferedReader(fr);
            String content = "";
            while (br.ready()){
                String line = br.readLine();
                content += line;
                content += "\n";
                //System.out.println(line);
            }
            System.out.println(content);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
