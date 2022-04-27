package zah.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Logging {
    public static void main(String[] args) {
//        String text1 = "Error";
//        String text2 = "Warning";
//        String text3 = "Info";

//        int severity= Integer.parseInt("Error");
//        int severity1= Integer.parseInt("Warning");
//        int severity2= Integer.parseInt("Info");


        log(1, " Test");


    }

    public static void log(int severity, String message) {
        try {
            File f = new File("assets/tmp/output.txt");
            File old = new File("C:\\Users\\zah_r\\Desktop\\text\\Razvan.txt");

            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            Calendar gc = Calendar.getInstance();
            gc.setTime(new Date());
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd.MM.yyy HH:mm ");
            String[] mes = {"ERROR", "WARNING", "INFO"};

            if (severity < 1 || severity > mes.length) {
                severity = mes.length;
            }
            ps.println(sdf.format(gc.getTime()) + mes[severity - 1] + message);
            if (f.length() >= 10000) {
                if (old.exists()) {
                    old.delete();
                } else {
                    boolean b = f.renameTo(old);
                    System.out.println("Renamed files: " + b);

                    ps.close();
                }
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}


