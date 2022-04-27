package philipp.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logging {
    public static void main(String[] args) {
        log(1, "File not found");
        sleep(5000);
        log(3, "Hello!");
        sleep(3000);
        log(2, "Almost out of coffee");
        sleep(2000);
        log(1, "No more coffee!");
    }

    /*
   severity=1  --> ERROR
   severity=2  --> WARNING
   severity=3  --> INFO

   Ergebnis:
   2022.04.26. 09:30:34 INFO: Guten Morgen!
   2022.04.26. 09:31:01 WARNING: Kein passende Aufgabe gefunden
   ...
*/
    public static void log(int severity, String message) {
        Calendar timeStamp = Calendar.getInstance();
        timeStamp.set(timeStamp.get(Calendar.YEAR), timeStamp.get(Calendar.MONTH),
                timeStamp.get(Calendar.DAY_OF_MONTH), timeStamp.get(Calendar.HOUR_OF_DAY),
                timeStamp.get(Calendar.MINUTE), timeStamp.get(Calendar.SECOND));
        SimpleDateFormat sdf = new SimpleDateFormat(("yyyy.MM.dd kk:mm:ss "));
        String[] sev = {"ERROR", "WARNING", "INFO"};
        if (severity > 3 | severity < 1) {
            severity = 3;
        }
//        String sev = "";
//        if (severity == 1) {
//            sev = "ERROR: ";
//        } else if (severity == 2) {
//            sev = "WARNING: ";
//        } else {
//            sev = "INFO: ";
//        }
        try {
            File f = new File("assets/tmp/output.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            ps.println(sdf.format(timeStamp.getTime()) + sev[severity - 1] + message);
            ps.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exc) {
            //noop
        }
    }
}
