package zah.week07.zoo;

import java.util.Vector;

public class Zoo {

    private String name;
    private int foundation;
    private Vector<Enclosure> enclosures;

    public Zoo(String name, int foundation) {

        this.name = name;
        this.foundation = foundation;
        this.enclosures = new Vector<>();
    }


    public String toString(String id) {
        String out = id + "";
        out += name;
        out += " " + foundation + "\n";
        for (Enclosure enc : enclosures) {
            out += enc.toString(id+"  ") + "\n";
        }
        return out;
    }

    @Override
    public String toString() {
        return toString("");
    }


    public Enclosure addEnclosure(String name) {
        Enclosure e = new Enclosure(name);
        enclosures.add(e);
        return e;
    }
}

