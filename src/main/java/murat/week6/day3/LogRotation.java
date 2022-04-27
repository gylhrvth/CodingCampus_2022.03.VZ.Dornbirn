package murat.week6.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LogRotation {
    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {
            log(1, "Good Morning");
        }
    }

    public static void log(int severity, String message) {

        String loggingAddress = "assets/tmp/logging.txt";
        String oldAddress = "assets/tmp/old.txt";

        try {
            File loggingFile = new File(loggingAddress);
            File oldFile = new File(oldAddress);

            loggingFile.getParentFile().mkdirs();

            if (loggingFile.isFile() && loggingFile.length() > 1000000) {
                if (oldFile.exists()) {
                    oldFile.delete();
                }
                boolean flag = loggingFile.renameTo(oldFile);

                if (flag) {
                    System.out.println("Renamed");
                }
            }

            FileOutputStream output = new FileOutputStream(loggingFile, true);
            PrintStream ps = new PrintStream(output);

            switch (severity) {
                case 1:
                    ps.print(calendar() + " ERROR: " + message + "\n");
                    break;
                case 2:
                    ps.print(calendar() + " WARNING: " + message + "\n");
                    break;
                case 3:
                    ps.print(calendar() + " INFO: " + message + "\n");
                    break;
                default:
                    System.out.println("Severity is false!");
            }
            ps.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public static String calendar() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

        return sdf.format(Calendar.getInstance().getTime());
    }
}
