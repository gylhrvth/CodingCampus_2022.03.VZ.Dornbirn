package aron.week07.zoosim;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private String year;
    private List<Enclosure> enclosures = new ArrayList<>();


    public Zoo(String name, String year) {

        this.name = name;
        this.year = year;

    }

    public void addEnclosure(Enclosure enclosure) {

        if (!enclosures.contains(enclosure)) {
            enclosures.add(enclosure);
        } else {
            System.out.println("Enclosure can't be not added");
        }
    }

    public void removeenclosure(Enclosure enclosure) {
        if (enclosures.contains(enclosure)) {
            enclosures.remove(enclosure);

        }
    }

    @Override
    public String toString() {
        String output =  "├──Zoo:" + name + " | Gegruendet:" + year +"\n";
        for (Enclosure enc : enclosures){
            output += enc + "\n";
        }
        return output;
    }
}

