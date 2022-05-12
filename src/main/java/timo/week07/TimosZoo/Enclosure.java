package timo.week07.TimosZoo;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Enclosure {
    Random rand = new Random();

    private String name;
    private List<Animal> animals = new Vector<>();
    private int lastDayCleaned;

    public Enclosure(String name) {
        this.name = name;
        lastDayCleaned = 0;
    }


    public String printString(String indention) {
        String out = indention + name;
        for (Animal a : animals) {
            out += "\n" + "│" + "        " + a.printString(indention);
        }
        return out;
    }

    @Override
    public String toString() {
        return name + "\n" +
                "Animals: " + animals +
                ", cleaned: " + lastDayCleaned + " day/s ago";
    }

    public void setLastDayCleaned (int lastDayCleaned) {
        this.lastDayCleaned = lastDayCleaned;
    }


    public boolean cleanEnclosure(int currentDay) {
        if (currentDay == lastDayCleaned) {
            // Nothing to do
            System.out.println("\u001B[32m" + "This enclosure has already been cleaned and fed." + "\u001B[0m");
            return false;
        } else {
            // Do cleaning
            System.out.println("\u001B[31m" + "This enclosure needs to be cleaned and fed." + "\u001B[0m");
            lastDayCleaned = currentDay;
            return true;
        }
    }


    public Animal addAnimal(String name, String species, Food food, int dailyNeed) {
        Animal a = new Animal(name, species, food, dailyNeed);
        animals.add(a);
        return a;
    }

    public void removeAnimal(Animal a) {
        animals.remove(a);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals(Enclosure en) {
        System.out.println(">> Proceeding to feed animals and clean enclosure <<");
        for (int i = 0; i < en.getAnimals().size(); i++) {
            System.out.print(" ".repeat(20));
            System.out.println("Feeding: " + en.getAnimals().get(i));
        }
    }

    public void getRandomAnimalofEn(Enclosure en) {
        System.out.println("- Randomly watching: " + en.getAnimals().get(rand.nextInt(en.getAnimals().size())));
    }
}


