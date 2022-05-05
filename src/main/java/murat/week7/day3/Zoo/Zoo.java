package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Vector;

public class Zoo {
    private String name;

    private String city;

    private int establishedIn;

    private List<Enclosure> enclosures = new Vector<>();

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

    @Override
    public String toString() {

        String output = "";
        for (int i = 0; i < enclosures.size(); i++) {
            output += ANSI_GREEN + " \n|\t|---" + enclosures.get(i) + ANSI_RESET;
        }

        return ANSI_BLUE + "|---Zoo: " + name + ", " + city + ", " + "established in " + establishedIn + ANSI_RESET + output;
    }

    public void addEnclosure(Enclosure aHabitat) {

        enclosures.add(aHabitat);
    }

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_GREEN = "\u001B[32m";

}


