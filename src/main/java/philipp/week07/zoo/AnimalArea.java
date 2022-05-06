package philipp.week07.zoo;

import java.util.List;
import java.util.Vector;

public class AnimalArea {
    private String name;
    int size;
    private List<Animal> animals = new Vector<>();
    private int lastDayHasBeenCleard;


    public AnimalArea(String name, int size) {
        this.name = name;
        this.size = size;
        lastDayHasBeenCleard = 0;
    }

    public void setLastDayHasBeenCleared(int lastDayHasBeenCleared) {
        this.lastDayHasBeenCleard = lastDayHasBeenCleared;
    }

    public void clearArea(int currentDay){
        if (currentDay == lastDayHasBeenCleard){
            // Nothing to do
            System.out.println("Nothing to do");
        } else {
            // Do cleaning
            System.out.println("Do cleaning");
            lastDayHasBeenCleard = currentDay;
        }
    }

    @Override
    public String toString() {
        return name + " " + "(Size: " + size + " m2)";
    }

    public void printAnimalArea() {
        if (animals.size() != 0) {
            for (Animal ani : animals) {
                System.out.print("│ " + " ".repeat(8));
                System.out.print("├── ");
                System.out.println(ani);
            }
        } else {
            System.out.print("│ " + " ".repeat(8));
            System.out.print("├── ");
            System.out.println("(leer)");
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Animal addAnimal(Animal an) {
        animals.add(an);
        return an;
    }

    //    public AnimalKeeper addKeeper(AnimalKeeper ak) {
//        animalKeepers.add(ak);
//        return ak;
//    }
//    public void removeKeeper(AnimalKeeper ak){
//        animalKeepers.remove(ak);
//
//    }
    public void changeSizeArea(int size) {
        this.size = size;
    }

}

