package timo.week07.TimosZoo;

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


    @Override
    public String toString() {
        return "├── Zoo: " + name + ", gegründet: " + foundation + "\n    ├── " + enclosures;

    }

    public void addEnclosure (Enclosure e) {
        enclosures.add(e);
    }
}
