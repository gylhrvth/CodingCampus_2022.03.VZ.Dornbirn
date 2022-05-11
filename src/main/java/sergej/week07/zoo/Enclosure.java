package sergej.week07.zoo;


import java.util.HashMap;
import java.util.Vector;

public class Enclosure {

    private String name;
    private Zoo zoo;
    private Vector<Animal> animals;
    private int lastDayOfCleaning = 0;

    public Enclosure(Zoo zoo, String name) {
        this.zoo = zoo;
        this.name = name;
        this.animals = new Vector<>();
        zoo.addEnclosure(this);
    }

    public void addAnimal(Animal a) {
        if (!animals.contains(a)) {
            animals.add(a);
        }
    }


    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.println("│   ├── Gehege: " + name);
        if (animals.size() > 0) {
            for (Animal animal : animals) {
                animal.printStructure();
            }
        } else {
            System.out.println("│       ├── (leer)");
        }
    }

    public int getLastDayOfCleaning() {
        return lastDayOfCleaning;
    }

    public void setLastDayOfCleaning(int lastDayOfCleaning) {
        this.lastDayOfCleaning = lastDayOfCleaning;
    }

    public void foodSimulator(HashMap<Food, Integer> food) {
        for (Animal an : animals) {
            an.foodSimulator(food);
        }
    }

}
