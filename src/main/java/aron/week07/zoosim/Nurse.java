package aron.week07.zoosim;

import java.util.ArrayList;
import java.util.List;

public class Nurse {

    private String name;
    private List<Enclosure> enclosures = new ArrayList<>();

    public Nurse(String name) {

        this.name = name;

    }

    public void addEnclosure(Enclosure enclosure) {

        if (!enclosures.contains(enclosure)) {
            enclosures.add(enclosure);
        } else {
            System.out.println("The task is not possible");
        }
    }


    @Override
    public String toString() {
        String output = "Nurse: " +MainZoo.ANSI_RED + name + MainZoo.ANSI_RESET + "\n";
        for (Enclosure enc: enclosures) {
            output += enc + "\n";

        }
        return output;
    }

    public void removeenclosure(Enclosure enclosure) {
        if (enclosures.contains(enclosure)) {
            enclosures.add(enclosure);
        }
    }
}
