package sergej.week07.zoo;

import java.util.Vector;

public class Enclosure {

    private String name;
    private Vector<Animal> animals;

    public Enclosure(String name){
        this.name = name;
        animals = new Vector<>();
    }

    @Override
    public String toString() {
        return "\n " + name+"\n"+animals;
    }

    public Animal addAnimals(String name, String species){
        Animal a = new Animal(name,species);
        animals.add(a);
        return a;
    }


}
