package cemil.week08.zoo;


import java.util.List;
import java.util.Vector;

public class AnimalArea {
    private String name;
    private List<Animal> animals = new Vector<>();


    public AnimalArea(String name) {
        this.name = name;

    }
    public void addAnimal(Animal animal){
        if (!animals.contains(animal)){
            animals.add(animal);
        }
    }
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(String indention) {
        String out = indention + name;
        for (Animal a : animals) {
            out += "\n" + "│" + "        " + a.toString(indention);
        }
        return out;
    }
}
