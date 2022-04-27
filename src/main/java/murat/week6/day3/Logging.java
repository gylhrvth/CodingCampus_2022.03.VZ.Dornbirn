package murat.week6.day3;

import aron.Week04.Calender;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logging {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            log(1, "Good Morning");
        }

    }

    public static void log(int severity, String message) {

        Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        try {
            File f = new File("assets/tmp/logging.txt");
            f.getParentFile().mkdirs();
            FileOutputStream output = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(output);

            switch (severity) {
                case 1:
                    ps.print(sdf.format(Calendar.getInstance().getTime()) + " ERROR: " + message + "\n");
                    break;
                case 2:
                    ps.print(sdf.format(Calendar.getInstance().getTime()) + " WARNING: " + message + "\n");
                    break;
                case 3:
                    ps.print(sdf.format(Calendar.getInstance().getTime()) + " INFO: " + message + "\n");
                    break;
                default:
                    System.out.println("Severity is false!");
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {

            fnfe.printStackTrace();
        }
    }
}
