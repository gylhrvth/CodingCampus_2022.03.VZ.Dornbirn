package arda.test;

import java.util.Calendar;

public class test {
    public static void main(String[] args) {
        int year = 2022;
        int month = 4;
        theSundays(year,month);
    }
    public static int theSundays(int year, int month) {
        Calendar gc = Calendar.getInstance();
        int daysInMonth = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
        int counter = 0;
        for (int i = 0; i < daysInMonth; i++) {
            gc.set(year, month, 1 + i);
            if (gc.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY &&
                    (gc.get(Calendar.DAY_OF_WEEK) !=   Calendar.SATURDAY)) {
                counter++;
            }
        }
        return counter;
    }
}
