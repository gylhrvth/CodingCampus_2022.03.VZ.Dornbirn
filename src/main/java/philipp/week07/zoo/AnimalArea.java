package philipp.week07.zoo;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class AnimalArea {
    Random rn = new Random();

    private String name;
    int size;
    private List<Animal> animals = new Vector<>();
    private int lastDayHasBeenCleared;

    public AnimalArea(String name, int size) {
        this.name = name;
        this.size = size;
        lastDayHasBeenCleared = 0;
    }

    public void feedAnimals(AnimalArea aa) {
        System.out.println("Feeding the animals of this area:");
        for (int i = 0; i < aa.getAnimals().size(); i++) {
            System.out.print(" ".repeat(20));
            System.out.println("Feeding: " + aa.getAnimals().get(i));
        }
    }

    public void randomAnimalOfArea(AnimalArea aa) {
        System.out.print("Watching the random animal: ");
        System.out.println(aa.getAnimals().get(rn.nextInt(aa.getAnimals().size())));
    }

    public void setLastDayHasBeenCleared(int lastDayHasBeenCleared) {
        this.lastDayHasBeenCleared = lastDayHasBeenCleared;
    }

    public boolean clearArea(int currentDay) {
        if (currentDay == lastDayHasBeenCleared) {
            // Nothing to do
            System.out.println("\u001B[32m" + "This area already has been done." + "\u001B[0m");
            return false;
        } else {
            // Do cleaning
            System.out.println("\u001B[31m" + "This area needs to be taken care off." + "\u001B[0m");
            lastDayHasBeenCleared = currentDay;
            return true;
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

    public void changeSizeArea(int size) {
        this.size = size;
    }

}

