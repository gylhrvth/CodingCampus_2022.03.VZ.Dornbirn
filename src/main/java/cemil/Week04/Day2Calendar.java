package cemil.Week04;

import java.util.Calendar;

public class Day2Calendar {
    public static void calCalendar() {
        System.out.println("|MO|DI|MI|DO|FR|SA|SO|");
        Calendar gc = Calendar.getInstance();
        gc.set(Calendar.DAY_OF_MONTH, 1);
        int lastDayMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);


            for (int i = 1; i <= lastDayMonth; i++) {
                String output = "|" + i + " ";
                if (i >= 10) {
                    output = "|" + i;
                }
                System.out.print(output);

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

        calCalendar();
    }
}
