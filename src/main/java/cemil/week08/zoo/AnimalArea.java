package cemil.week08.zoo;


import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class AnimalArea {
    private String name;
    private Zoo zoo;
    private List<Animal> animals = new Vector<>();
    private int lastDayHasCleared;
    private static Random rand = new Random();


    public AnimalArea(String name) {
        this.zoo = zoo;
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

    public void simulateAttack() {
        Vector<Animal> deadAnimals = new Vector<>();
        for (Animal animal : animals) {
            if ((animal.getHealthy() > 0)) {
                Animal victom = animal;
                while (victom.equals(animal)) {
                    victom = animals.get(rand.nextInt(animals.size()));
                }
                if (victom.getHealthy() > 0) {
                    int newHealth = Math.max(0, victom.getHealthy() - animal.getDamage());
                    victom.setHealth(newHealth);
                    System.out.println(animal.getName() + victom.getName() + newHealth);
                    if (newHealth <= 0) {
                        System.out.println(victom.getName());
                        deadAnimals.add(victom);
                    }
                }
            }

        }
        for (Animal deadAnimal : deadAnimals) {
            animals.remove(deadAnimal);
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

    public Animal getAnimalWithMinHealth() {
        Animal result = null;
        for (Animal animalNeed : animals) {
            if (result == null) {
                result = animalNeed;
            } else if (animalNeed != null) {
                double relHealthOfResult = result.getHealthy() / (double) result.getHealthyMax();
                double relHealthOfResultNeed = animalNeed.getHealthy() / (double) animalNeed.getHealthyMax();
                if (relHealthOfResultNeed < relHealthOfResult) {
                    result = animalNeed;
                }
            }

        }
        return result;
    }
}

