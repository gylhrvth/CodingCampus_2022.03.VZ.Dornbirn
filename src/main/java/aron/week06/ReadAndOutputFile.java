package aron.week06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndOutputFile {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("assets/tmp/aron.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()){
                String line = br.readLine();
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            FileReader fr = new FileReader("assets/tmp/aron.txt");
//            BufferedReader br = new BufferedReader(fr);
//
//            int i = br.read();
//            while (i != -1) {
//                System.out.print((char) i);
//                i = br.read();
//            }
//            br.close();
//            fr.close();
//        } catch (IOException ioe){ }
    }
}
