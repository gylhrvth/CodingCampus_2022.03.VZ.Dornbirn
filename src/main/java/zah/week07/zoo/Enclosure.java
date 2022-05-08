package zah.week07.zoo;

import java.util.Vector;

public class Enclosure {
    private String name;
    private Vector<Animal> animal;

    public Enclosure(String name) {
        this.name = name;
        animal = new Vector<>();
    }

    public String toString(String indention) {
        String out = indention + name;
        for (Animal an : animal) {
            out += "\n\t\t\t├──" + " " + an.toString(indention);
        }
        return out;
    }

    public Animal addAnimal(String name, String species) {
        Animal an = new Animal(name, species);
        animal.add(an);
        return an;
    }

    public String getName() {
        return name;
    }
}

