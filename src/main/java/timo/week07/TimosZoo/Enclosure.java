package timo.week07.TimosZoo;

import java.util.List;
import java.util.Vector;

public class Enclosure {
    private String name;
    private List<Animal> animals = new Vector<>();
    private int lastDayCleaned;

    public Enclosure(String name) {
        this.name = name;
        lastDayCleaned = 0;
    }


    public String toString(String indention) {
        String out = indention + name + " (Last day cleaned: " + lastDayCleaned + ")";
        for (Animal a : animals) {
            out += "\n" + "│" + "        " + a.toString(indention);
        }
        return out;
    }

    public void setLastDayCleaned (int lastDayCleaned) {
        this.lastDayCleaned = lastDayCleaned;
    }


    public void cleanEnclosure(int currentDay) {
        if (currentDay == lastDayCleaned) {
            // Nothing to do
            System.out.println("Nothing to do");
        } else {
            // Do cleaning
            System.out.println("Do cleaning");
            lastDayCleaned = currentDay;
        }
    }


    public Animal addAnimal(String name, String species) {
        Animal a = new Animal(name, species);
        animals.add(a);
        return a;
    }

    public void removeAnimal(Animal a) {
        animals.remove(a);
    }


}


