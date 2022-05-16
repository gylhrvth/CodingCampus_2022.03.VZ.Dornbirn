package cemil.week09;

import java.util.ArrayList;
import java.util.List;

public class Schalter {

    private String name;
    private List<Kunde> kundes = new ArrayList<>();

    public Schalter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ANSI_RED + name + ANSI_RESET;
    }


    public void makeBusiness(Kunde kunde, int amount) {

        for (Kunde k : kundes) {
            System.out.println(k);
        }
    }


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
}



