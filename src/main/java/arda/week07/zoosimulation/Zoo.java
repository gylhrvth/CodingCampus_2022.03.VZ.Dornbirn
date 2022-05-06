package arda.week07.zoosimulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Zoo {
    private String name;
    private int foundingYear;
    private List<Enclosure> enclosures = new ArrayList<>();

    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
    }

    public void addEnclosure(Enclosure enclosure) {
        if (!enclosures.contains(null)){
            enclosures.add(enclosure);
        }else {
            System.out.println("Enclosure could not be added");
        }
    }

    public void removeEnclosure(Enclosure enclosure) {
        if (enclosures.contains(null)){
            enclosures.remove(enclosure);
        }
    }

    @Override
    public String toString() {
        return "Zoo: " + name + ", founded " + foundingYear + "\n" +
                "Enclosures: \n" + enclosures + "\n";
    }
}

