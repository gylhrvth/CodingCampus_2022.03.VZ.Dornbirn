package zah.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
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

        for (int i = 0; i < 100; i++) {
            log(3, "Cemil");
        }

    }

    public static void log(int severity, String message) {
        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, false));
            Calendar gc = Calendar.getInstance();
            gc.setTime(new Date());
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd.MM.yyy HH:mm ");


            if (severity == 1) {
                ps.println(sdf.format(gc.getTime())+"Error: " + message);
            }
            if (severity == 2) {
                ps.println(sdf.format(gc.getTime())+"Warning: " + message);
            }
            if (severity == 3) {
                ps.println(sdf.format(gc.getTime())+"Info: " + message);
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

}
