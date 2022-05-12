package cemil.week08.zoo;


import java.util.HashMap;
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

    public void setLastDayHasCleared(int lastDayHasCleared) {
        this.lastDayHasCleared = lastDayHasCleared;
    }

    public int getLastDayHasCleared() {
        return lastDayHasCleared;
    }

    public void clearArea(int currentDay) {
        if (currentDay == lastDayHasCleared) {
            System.out.println(MainZoo.ANSI_BLUE + "Nothing to do" + MainZoo.ANSI_RESET);
        } else {
            System.out.println(MainZoo.ANSI_YELLOW + "Do cleaning" + MainZoo.ANSI_RESET);
            lastDayHasCleared = currentDay;
        }
    }

    public void feedAnimals(HashMap<Feed, Integer> statistik) {
        for (Animal an : animals) {
            an.feedAnimal(statistik);
        }
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        }
    }



    public void removeAnimal(Animal animal) {
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

    @Override
    public String toString() {
        String outout = "";
        outout += MainZoo.ANSI_RED + name + MainZoo.ANSI_RESET + "\n";
        for (Animal an : animals) {
            outout += MainZoo.ANSI_GREEN + an.getName() + " " + MainZoo.ANSI_RESET;
        }

        return outout;
    }

    public String toString(String indention) {
        String out = indention + name;
        for (Animal a : animals) {
            out += "\n" + "│" + "        " + a.toString(indention);
        }
        return out;
    }

}
