package zah.week06;

import java.io.*;
import java.util.Scanner;

public class FileWithScannerBufferRead {

    public static void main(String[] args) {
        readWithBuffer();
        readWithScanner();


    }

    public static void readWithBuffer() {
        try {
            FileReader fr = new FileReader("assets/tmp/output.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readWithScanner() {
        try {
            File f = new File("assets/tmp/output.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

