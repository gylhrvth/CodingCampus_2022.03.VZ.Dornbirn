package cemil.week07;

import java.io.*;
import java.util.Scanner;

public class Day3FilesScannerAndBuffered {
    public static void main(String[] args) {

//       Einlesen mit Buffered!!!
        try {
            FileReader f = new FileReader("assets/tmp/output.txt");
            BufferedReader br = new BufferedReader(f);
            while (br.ready()){
                String text = br.readLine();
                System.out.println(text);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Einlesen mit Scanner!!!
        try {
            File f = new File("assets/tmp/output.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String text = sc.nextLine();
                System.out.println(text);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
