package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Vector;

public class Enclosure {
    private String name;

    private List<Animal> animals = new Vector<>();

    ;

    public Enclosure(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public List<Animal> getAnimals() {

        return animals;
    }

    @Override
    public String toString() {

        String output = "";
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getName().equals(" ")) {
                output += " \n|\t\t|---" + "Empty";
            } else {
                output += " \n|\t\t|---" + animals.get(i);
            }
        }
        return Zoo.ANSI_GREEN + name + Zoo.ANSI_RESET + Zoo.ANSI_CYAN + output + Zoo.ANSI_RESET;
    }

    public Animal addAnimal(String name, String species) {

        Animal ani = new Animal(name, species);
        animals.add(ani);
        return ani;
    }
}
