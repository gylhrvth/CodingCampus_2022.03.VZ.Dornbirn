package cemil.week09;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Bank {

    private String name;
    private List<Schalter> schalters = new Vector<>();

    public Bank(String name) {
        this.name = name;
    }


    public List<Schalter> getSchalters() {
        return schalters;
    }

    public void makeBusiness(Kunde kunde, int amount) {
        for (Schalter s : schalters) {
            //if (s.open) {
            s.makeBusiness(kunde, amount);
            break;
            //}
        }
    }


    public void addSchalter(Schalter schalter) {
        if (!schalters.contains(schalter)) {
            schalters.add(schalter);
        }
    }


    public String toString() {
        StringBuilder builder = new StringBuilder("  " + Schalter.ANSI_BLUE + name + Schalter.ANSI_RESET);
        builder.append(System.lineSeparator());

        for (Schalter s : schalters) {
            builder.append("Schalter: ");
            builder.append(s);
            builder.append(System.lineSeparator());
        }
        return builder.toString();

    }

}
