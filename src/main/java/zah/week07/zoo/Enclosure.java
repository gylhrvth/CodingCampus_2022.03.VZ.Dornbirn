package zah.week07.zoo;

import zah.week07.Feed;

import java.util.HashMap;
import java.util.Vector;

public class Enclosure {
    private String name;
    private Vector<Animal> animals;
    private int lastDayOfCleaning= 0;

    public Enclosure(String name) {
        this.name = name;
        animals = new Vector<>();
    }

    public String toString(String indention) {
        String out = indention + name;
        for (Animal an : animals) {
            out += "\n\t\t\t├──" + " " + an.toString(indention);
        }
        return out;
    }

    public Animal addAnimal(String name, String species, Feed feed, Integer requirement) {
        Animal an = new Animal(name, species,feed,requirement);
        animals.add(an);
        return an;
    }

    public String getName() {
        return name;
    }
// Is not more use
//    public void simulateNurse() {
//        System.out.println(name + " Has been cleared");
//    }

    public int getLastDayOfCleaning() {
        return lastDayOfCleaning;
    }

    public void setLastDayOfCleaning(int lastDayOfCleaning) {
        this.lastDayOfCleaning = lastDayOfCleaning;
    }

    public void feedAnimals(HashMap<Feed, Integer> statistik) {
        for (Animal an: animals) {
            an.feedAnimal(statistik);
        }
    }
}

