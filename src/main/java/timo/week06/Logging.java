package timo.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logging {
    public static void main(String[] args) {

        //  for (int i = 0; i < 10000; i++) {
        //      for (int j = 0; j < 1000; j++) {
        //         log(3, "STRESSTESTSTRESSTESESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTESTSTRESSTEST");
        //     }
        //   }

        log(2, "Supercalifragilistic");
    }


    public static void log(int severity, String message) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        try {
            File f = new File("assets/tmp/timoslog.txt");
            File old = new File("assets/tmp/timoslog.txt.old");
            String[] severityArr = {" ERROR: ", " WARNING: ", " INFO: "};
            File dir = new File(f.getParent());
            dir.mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));

            if (f.length() >= 10000) {
                if (old.exists()) {
                    old.delete();
                }
                boolean b = f.renameTo(old);
                System.out.println("Renamed files: " + b);
            }

            if (severity < 1 || severity > 3) {
                System.out.println("Please enter severity \"1\", \"2\" or \"3\".");
            } else {
                ps.println(dtf.format(now) + severityArr[severity - 1] + message);
                ps.close();
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}


