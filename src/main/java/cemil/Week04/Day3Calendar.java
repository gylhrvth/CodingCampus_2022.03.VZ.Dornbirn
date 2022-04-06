package cemil.Week04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Day3Calendar {
//    if (change == 1){
//    System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
//}else {
//
//}

    public static void changeCalendar(int year, int month) {
        Calendar gc = Calendar.getInstance();
        int toDay = gc.get(Calendar.DAY_OF_MONTH);
        gc.set(year, month - 1, 1);
        SimpleDateFormat format = new SimpleDateFormat("MMMM yyyy");
        System.out.println(format.format(gc.getTime()));
        System.out.println("| SO | MO | DI | MI | DO | FR | SA |");
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
            if (toDay == i) {
                star = "*";
            } else {
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
        cemil.Week04.Day2Calendar.calCalendar(2022, 04);
        System.out.println();
        changeCalendar(2022, 4);
    }
}
