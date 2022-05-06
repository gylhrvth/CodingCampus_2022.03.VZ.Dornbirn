package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Vector;

public class Enclosure {
    private String name;

    private List<Animal> animals = new Vector<>();

    private List<Carer> carers = new Vector<>();

    public Enclosure(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public List<Animal> getAnimals() {

        return animals;
    }

    public String toString(String indention) {

        String out = indention + name;
        for (Animal animal : animals) {
            out += Zoo.ANSI_CYAN + "\n\t\t\t├──" + animal.toString(indention )+ Zoo.ANSI_RESET ;
        }
        return out;
    }

    public Animal addAnimal(String name, String species) {

        Animal ani = new Animal(name, species);
        animals.add(ani);
        return ani;
    }
}
