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
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 10; j++) {
                log(2, "Hello World! 123546788 sdfsfghjj fdfwer erwrwer egdgdfg>:(");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void log(int severity, String message) {
        String logPath = "C:/intellij/LogClass/log.txt";
        fileSizeLimit(logPath);
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(logPath, true));
            String[] levels = {"ERROR", "WARNING", "INFO"};
            if (severity < 1 || severity > levels.length) {
                severity = levels.length;
            }
            ps.printf("%s %s: %s %n", dateTime(), levels[severity - 1], message);
            ps.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    public static String dateTime() {
        Calendar gc = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss");
        return sdf.format(gc.getTime());
    }

    public static boolean fileSizeLimit(String logPath) {
        File file = new File(logPath);
        File rename = new File(logPath + ".old");
        boolean flag = false;
        if (file.isFile() && file.length() > 100000L) {
            if (rename.exists()){
                rename.delete();
            }
            flag = file.renameTo(rename);
            if (flag) {
                System.out.println("file renamed due its size being over the size limit");
            } else {
                System.out.println("file rename has failed");
            }
        }
        return flag;
    }
}
