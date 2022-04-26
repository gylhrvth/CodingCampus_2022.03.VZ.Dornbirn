package timo.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Logging {
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
             for (int j = 0; j < 1000; j++) {
                log(2, "STRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTEST");
            }
         }

       // log(3, "Arda steht neben mir!!!!!!!!!");
    }


    public static void log(int severity, String message) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        // Strting[]

        try {
            File f = new File("assets/tmp/timoslog.txt");
            File old = new File("assets/tmp/timoslog.txt.old");
            File dir = new File(f.getParent());
            dir.mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));

            if (severity < 1 || severity > 3) {
                System.out.println("Please enter severity \"1\", \"2\" or \"3\".");
            } else {
                    if (severity == 1) {
                        ps.println(dtf.format(now) + " ERROR: " + message);
                        ps.close();
                    } else if (severity == 2) {
                        ps.println(dtf.format(now) + " WARNING: " + message);
                        ps.close();
                    } else if (severity == 3) {
                        ps.println(dtf.format(now) + " INFO: " + message);
                        ps.close();
                    }
                if (f.length() >= 10000) {
                    if (old.exists()) {
                        old.delete();
                    } else {
                        boolean b = f.renameTo(old);
                        System.out.println("Renamed files: " + b);
                    }
                }
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}


