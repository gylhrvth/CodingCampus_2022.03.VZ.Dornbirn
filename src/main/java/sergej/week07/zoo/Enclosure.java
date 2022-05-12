package sergej.week07.zoo;


import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

public class Enclosure {

    private String name;
    private Zoo zoo;
    private Vector<Animal> animals;
    private int lastDayOfCleaning = 0;
    private static Random rand = new Random();

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

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

    public void simulate() {
        Vector<Animal> deadAnimals = new Vector<>();
        for (Animal animal : animals) {
            if ((animal.getHealth() > 0) && (rand.nextInt(100) < animal.getAttackChance())) {
                if(animals.size() <= 1){
                    break;
                }
                Animal victim = animal;
                while (victim.equals(animal)) {
                    victim = animals.get(rand.nextInt(animals.size()));

                }
                if (victim.getHealth() > 0) {
                    int newHealth = Math.max(0, victim.getHealth() - animal.getDamage());
                    victim.setHealth(newHealth);
                    System.out.printf(ANSI_RED + "%1$s" + ANSI_RESET + " hat " + "%2$s" + ANSI_RED + " gebissen" + ANSI_RESET + ", %2$s's Restgesundheit ist %3$d%n", animal.getName(), victim.getName(), newHealth);
                    if (newHealth <= 0) {
                        System.out.printf(ANSI_PURPLE + "%s" + ANSI_RESET + " hat den Angriff nicht überlebt. Wird von dem Gehege entfernt.%n", victim.getName());
                        deadAnimals.add(victim);
                    }
                }
            }
        }
        for (Animal deadAnimal : deadAnimals) {
            animals.remove(deadAnimal);
        }
    }

    public Animal getAnimalWithMinHealth() {
        Animal result = null;
        for (Animal animalInNeed : animals) {
            if (result == null) {
                result = animalInNeed;
            } else if (animalInNeed != null) {
                double relHealthOfResult = result.getHealth() / (double) result.getMaxHealth();
                double relHealthOfAnimalInNeed = animalInNeed.getHealth() / (double) animalInNeed.getMaxHealth();
                if (relHealthOfAnimalInNeed < relHealthOfResult) {
                    result = animalInNeed;
                }
            }
        }
        return result;
    }

}
