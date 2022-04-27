package philipp.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LogRotation {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            logRotation(1, "File not found");
            logRotation(3, "Hello!");
            logRotation(2, "Almost out of coffee");
            logRotation(5, "No more coffee!");

            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }

    public static void logRotation(int severity, String message) {
        Calendar timeStamp = Calendar.getInstance();
        timeStamp.set(timeStamp.get(Calendar.YEAR), timeStamp.get(Calendar.MONTH),
                timeStamp.get(Calendar.DAY_OF_MONTH), timeStamp.get(Calendar.HOUR_OF_DAY),
                timeStamp.get(Calendar.MINUTE), timeStamp.get(Calendar.SECOND));
        SimpleDateFormat sdf = new SimpleDateFormat(("yyyy.MM.dd kk:mm:ss "));
        String[] sev = {"ERROR: ", "WARNING: ", "INFO: "};
        if (severity > 3 | severity < 1) {
            severity = 3;
        }
        try {
            String fileName = "assets/tmp/output.txt";
            File log = new File(fileName);
            log.getParentFile().mkdirs();
            if (log.length() > 5000) {
                File logOld = new File(fileName + ".old");
                if (logOld.exists()) {
                    logOld.delete();
                }
                boolean b=log.renameTo(logOld);
                System.out.println("Renamed file: "+b);
            }

            PrintStream ps = new PrintStream(new FileOutputStream(log, true));
            ps.println(sdf.format(timeStamp.getTime()) + sev[severity - 1] + message);
            ps.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }


}
