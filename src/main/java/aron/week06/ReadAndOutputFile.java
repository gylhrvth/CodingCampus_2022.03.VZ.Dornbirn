package aron.week06;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAndOutputFile {

    public static void main(String[] args) {

        FileReader fr = new FileReader("assets/tmp/aron.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
