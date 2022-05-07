package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Vector;

public class Enclosure {
    private String name;

    private List<Animal> animals = new Vector<>();

    private List<Carer> carers = new Vector<>();

    public boolean alreadyCared;

    public Enclosure(String name, boolean cared) {

        this.name = name;
        this.alreadyCared = cared;
    }

    public List<Carer> getCarers() {

        return carers;
    }

    public String getName() {

        return name;
    }

    public List<Animal> getAnimals() {

        return animals;
    }

    public boolean getCared() {

        return alreadyCared;
    }

    public boolean setCaredOrNot(boolean caredOrNot) {

        alreadyCared = caredOrNot;

        return alreadyCared;
    }

    public String toString(String indention) {

        String out = indention + name + (alreadyCared ? " (Cared)" : " (Not cared)");
        for (Animal animal : animals) {
            out += Zoo.ANSI_CYAN + "\n\t\t\t├──" + animal.toString(indention) + Zoo.ANSI_RESET;
        }
        return out;
    }

    @Override
    public String toString() {

        return name + " " + (alreadyCared ? " (Cared)" : " (Not cared)");
    }

    public Animal addAnimal(String name, String species) {

        Animal ani = new Animal(name, species);
        animals.add(ani);
        return ani;
    }

}
