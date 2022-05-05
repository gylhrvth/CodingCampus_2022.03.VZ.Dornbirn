package zah.week07.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int foundation;
    private Vector<Enclosure> enclosures;

    public Zoo(String name, int founadtion) {
        this.name = name;
        this.foundation = founadtion;
        this.enclosures = new Vector<>();
    }

    @Override
    public String toString() {
        return "├──Zoo:" + name + " gegründet " + foundation + "\n" +
                    "├──" + enclosures +"\n"+


                '}';
    }

    public void addEnclosure(Enclosure e) {
        enclosures.add(e);
    }
}

