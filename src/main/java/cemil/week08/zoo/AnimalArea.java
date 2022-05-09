package cemil.week08.zoo;


import java.util.List;
import java.util.Vector;

public class AnimalArea {
    private String name;
    private List<Animal> animals = new Vector<>();
    private int lastDayHasCleared;


    public AnimalArea(String name) {
        this.name = name;
        lastDayHasCleared = 0;
    }
    public void setLastDayHasCleared(int lastDayHasCleared){
        this.lastDayHasCleared = lastDayHasCleared;
    }

    public void clearArea (int currentDay){
        if (currentDay == lastDayHasCleared){
            System.out.println("Nothing to do");
        }else {
            System.out.println("Do cleaning");
            lastDayHasCleared = currentDay;
        }
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

    public List<Animal> getAnimals() {
        return animals;
    }

    public String toString(String indention) {
        String out = indention + name;
        for (Animal a : animals) {
            out += "\n" + "│" + "        " + a.toString(indention);
        }
        return out;
    }

}
