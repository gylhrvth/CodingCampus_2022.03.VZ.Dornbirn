package zah.week04;

import java.util.Calendar;
import java.util.Date;

public class NeueKalender {
    public static void main(String[] args) {
        System.out.println(COLORS[1] +"| Mo | Di | MI | Do | Fr | Sa | So |" + RESET);
        Calendar gc = Calendar.getInstance();
        gc.setTime(new Date());
        dayInCalendar(2022, 4);





    }

    /**
     * @param year
     * @param month from 1 = January to 12 = December
     * @return
     */
    public static void dayInCalendar(int year, int month) {


        Calendar gc = Calendar.getInstance();
        int toDay = gc.get(Calendar.DAY_OF_MONTH);
        gc.set(year, month - 1, 1);

        int lastDayOfMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int currentWeekDay = gc.get(Calendar.DAY_OF_WEEK);

        int blanks;
        if (currentWeekDay == Calendar.SUNDAY) {
            blanks = 6;
        } else {
            blanks = currentWeekDay - 2;
        }

        for (int i = 1; i <= blanks; i++) {
            String line;
            if (i > 10) {
                line = "| ";
            } else {
                line = "|    ";
            }
            System.out.print(line);
        }

        for (int i = 1; i <= lastDayOfMonth; i++) {
            String line;
            String star ="";
            if (toDay == i) {
                star = COLORS[1]+"*"+RESET;
            }else {
                star=" ";
            }
            if (i >= 10) {
                if (toDay==i){
                    System.out.println(COLORS[1]+i+RESET);
                }
                line = "| " + i;
            } else {
                line = "|  " + i ;
            }
            System.out.print(line + star);

            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println("|");
            }
            if (i == lastDayOfMonth) {
                System.out.println("|");
            }
            gc.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
    public static final String RESET = "\u001B[0m";
    public static final String[] COLORS = new String[]{
            "\u001B[31m",
            "\u001B[32m",
            "\u001B[33m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[36m",
            "\u001B[37m"
    };
}
