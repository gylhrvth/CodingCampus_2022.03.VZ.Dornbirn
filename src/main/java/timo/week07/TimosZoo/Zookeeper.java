package timo.week07.TimosZoo;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Zookeeper {
    Random rand = new Random();

    private String name;
    private List<Enclosure> enclosuresToClean;


    public Zookeeper(String name) {
        this.name = name;
        this.enclosuresToClean = new Vector<>();
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Zookeeper{" +
                "name='" + name + '\'' +
                ", enclosuresToClean=" + enclosuresToClean +
                '}';
    }


    public Enclosure addEnclosure2Clean(Enclosure en) {
        enclosuresToClean.add(en);
        return en;
    }


    public List<Enclosure> getEnclosuresToClean() {
        return enclosuresToClean;
    }

    public void printCleaningTasks() {
        int currentday = 0;
        for (Enclosure enclosure : enclosuresToClean) {
            System.out.println(enclosure + "-");
            enclosure.cleanEnclosure(currentday);
        }
    }

    public Animal viewAnimal(Enclosure en) {

        return null;
    }
}
