package aron.Week04;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

import java.text.DateFormatSymbols;
import java.util.GregorianCalendar;

public class Birthday {
    public static void main(String[] args) {

        GregorianCalendar birthdate = new GregorianCalendar(1997, 10, 9);
        GregorianCalendar today = new GregorianCalendar(); // Today's date
        GregorianCalendar birthday = new GregorianCalendar(today.get(YEAR), birthdate.get(MONTH),
                birthdate.get(DATE));
        int age = today.get(today.YEAR) - birthdate.get(YEAR);
        String[] weekdays = new DateFormatSymbols().getWeekdays(); // Get day names
        System.out.println("Du hast an einem  " + weekdays[birthdate.get(DAY_OF_WEEK)]+ " Geburtstag") ;
        System.out.println("Dieses Jahr wirst du " + (birthday.after(today) ) + age
                + " Jahre Alt.");
        System.out.println("In " + today.get(YEAR) + " ist dein  Geburtstag "
                + (today.before(birthday) ? " an einem" : "warst") + " an einem "
                + weekdays[birthday.get(DAY_OF_WEEK)] + ".");
    }
}