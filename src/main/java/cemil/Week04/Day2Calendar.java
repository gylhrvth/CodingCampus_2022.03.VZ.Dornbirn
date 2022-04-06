package cemil.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day2Calendar {
    /**
     * @param year
     * @param month from 1 = January to 12 = December
     */

    public static void calCalendar(int year, int month) {
        Calendar gc = Calendar.getInstance();
        int toDay = gc.get(Calendar.DAY_OF_MONTH);
        gc.set(year, month - 1, 1);
        SimpleDateFormat format = new SimpleDateFormat("MMMM yyyy");
        System.out.println(format.format(gc.getTime()));
        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
        int lastDayMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int currentWeekDay = gc.get(Calendar.DAY_OF_WEEK);
        int blanks;
        if (currentWeekDay == Calendar.SUNDAY) {
            blanks = 6;
        } else {
            blanks = currentWeekDay - 2;
        }


        //wenn aktueller Tag ist Sonntag
        //blanks ist 6
        //ansonsten ist blanks aktueller Tag - 2
        for (int j = 1; j <= blanks; j++) {
            String output;
            if (j > 10) {
                output = "| ";
            } else {
                output = "|    ";
            }

            System.out.print(output);
        }
        for (int i = 1; i <= lastDayMonth; i++) {
            String output;
            String star = "";
            if (toDay == i){
                star = "*";
            }else {
                star = " ";
            }
            if (i >= 10) {
                output = "| " + i;
            } else {
                output = "|  " + i;
            }
            System.out.print(output + star);


            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println("|");
            }
            if (i == lastDayMonth) {
                System.out.println("|");
            }
            gc.add(Calendar.DAY_OF_MONTH, 1);
        }
    }


    public static void main(String[] args) {

        calCalendar(2022, 4);

    }
}
