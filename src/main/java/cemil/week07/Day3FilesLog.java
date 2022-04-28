package cemil.week07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Day3FilesLog {
    public static void main(String[] args) {

        log(3, "Hallo");

    }


    public static void log(int severity, String message) {
        try {
            File f = new File("assets/tmp/output.txt");
            File old = new File("C:\\Users\\DCV\\Desktop\\cemil.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(new FileOutputStream(f, true));
            Calendar gc = Calendar.getInstance();
            gc.setTime(new Date());
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd.MM.yyy HH:mm ");
            String[] mes = {"Error ", "Warning ", "Info "};
            for (int i = 0; i < 10; i++) {
                if (severity < 1 || severity > mes.length) {
                    severity = mes.length;
                }
                ps.println(sdf.format(gc.getTime()) + mes[severity - 1] + message);
            }
            ps.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}

