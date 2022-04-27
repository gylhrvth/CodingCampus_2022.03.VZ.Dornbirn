package aron.week06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClassForLogging {

    public static void main(String[] args) {
log( 1,"test");

    }

    public static void log(int severity, String message) {

        try {
            File f = new File("assets/tmp/aron.txt");
            f.getParentFile().mkdirs();
            PrintStream ps = new PrintStream(f);
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd. (EEE) HH:mm:ss ");
            String[] mes = {"Error","Warning","Info"};
            if (severity < 1 || severity > mes.length) {
                severity = mes.length;
            }
                ps.println(sdf.format(gc.getTime()) + mes[severity - 1] + message);
                ps.close();

        }
            catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();

        }
    }
}

