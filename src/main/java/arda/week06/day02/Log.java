package arda.week06.day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Log {
    public static void main(String[] args) {
        String date = dateTime();
        log(date, 2, ">:(");
    }

    public static void log(String date, int severity, String message) {
        boolean flag = false;
        while (!flag) {
            try {
                PrintStream ps = new PrintStream(new FileOutputStream("C:/intellij/LogClass/log.txt", true));
                String[] levels = {"ERROR", "WARNING", "INFO"};
                if (severity < 1 || severity > levels.length) {
                    severity = levels.length;
                }
                ps.printf("%s %s: %s %n", date, levels[severity - 1], message);
                flag = fileSizeLimit();


            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
            }
        }
    }

    public static String dateTime() {
        Calendar gc = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss");
        return sdf.format(gc.getTime());
    }

    public static boolean fileSizeLimit() {
        File file = new File("C:/intellij/LogClass/log.txt");
        File rename = new File("C:/intellij/LogClass/log.old.txt");
        byte size = 111;
        boolean flag = false;
        if (file.length() > size) {
            flag = file.renameTo(rename);
        }
        if (flag) {
            System.out.println("file renamed due its size being over the size limit");
        }
        return flag;
    }
}
