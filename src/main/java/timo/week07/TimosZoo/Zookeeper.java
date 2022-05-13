package timo.week07.TimosZoo;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Zookeeper {
    Random rand = new Random();

    private String name;
    private List<Enclosure> enclosuresToClean;
    private Animal fav;


    public Zookeeper(String name, Animal fav) {
        this.name = name;
        this.enclosuresToClean = new Vector<>();
        this.fav = fav;
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

    public void simulate() {
        int currentday = 0;
        for (Enclosure enclosure : enclosuresToClean) {
            System.out.println("Assigned to: " + enclosure);
            if (enclosure.cleanEnclosure(currentday)) {
                printTask(enclosure);
                admireFavAnimal(enclosure);
            }
        }
    }


    public void printTask(Enclosure en) {
        en.feedAnimals(en);
        en.getRandomAnimalofEn(en);
    }

    public void admireFavAnimal(Enclosure en) {
        if (en.getAnimals().contains(fav)) {
            System.out.println("- Admiring my favorite animal: " + fav);
        } else {
            System.out.println("- My favorite animal (" + fav + ") is not in this enclosure :´(");
        }
        System.out.println();
    }
}


