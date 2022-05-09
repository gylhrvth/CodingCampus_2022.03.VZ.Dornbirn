package sergej.week07.zoo;

import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector<Animal> animals;

    public Enclosure(String name) {
        this.name = name;
        animals = new Vector<>();
    }



    public String toString(String indention) {
        String out = indention + name;
        for (Animal an : animals) {
            out +=  "\n\t\t├──"+" " + an.toString(indention);
        }
        return out;
    }

    public Animal addAnimals(String name, String species) {
        Animal a = new Animal(name, species);
        animals.add(a);
        return a;
    }

    public void removeAnimals(Animal ani) {
        animals.remove(ani);
    }

    public String getName() {
        return name;
    }
}
