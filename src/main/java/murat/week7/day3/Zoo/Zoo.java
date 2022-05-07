package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Vector;

public class Zoo {
    private String name;

    private String city;

    private int establishedIn;

    private List<Enclosure> enclosures = new Vector<>();

    private List<Carer> carers = new Vector<>();

    public Zoo(String name, String city, int establishedIn) {

        this.name = name;
        this.establishedIn = establishedIn;
        this.city = city;
    }

    public String getName() {

        return name;
    }

    public int getEstablishedIn() {

        return establishedIn;
    }

    public String toString(String index) {

        String out = index + "├──";
        out += name;
        out += " " + establishedIn + "\n";

        out += "\n-------------------CARERS-----------------------";
        for (Carer c : carers) {
            out += Zoo.ANSI_GREEN + "\n\t├──" + c.toString(index) + Zoo.ANSI_RESET + "\n";
        }

        out += "\n------------------ENCLOSURES---------------------";
        for (Enclosure enc : enclosures) {
            out += Zoo.ANSI_RED + "\n\t├──" + enc.toString(index) + Zoo.ANSI_RESET + "\n";
        }
        return out;
    }

    @Override
    public String toString() {

        return toString("");
    }

    public Enclosure addEnclosure(String name, boolean cared) {

        Enclosure enc = new Enclosure(name, cared);
        enclosures.add(enc);
        return enc;
    }

    public Carer addCarer(String name, Animal bestBuddy) {

        Carer c = new Carer(this, name, bestBuddy);
        carers.add(c);
        return c;
    }

    public Enclosure searchEnclosureByName(String name) {

        for (Enclosure enc : enclosures) {
            if (enc.getName().equals(name)) {
                return enc;
            }
        }
        return addEnclosure(name, false);
    }

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_GREEN = "\u001B[32m";

}


