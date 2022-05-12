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
        for (Animal animal: animals){
            if ((animal.getHealth() > 0) && (rand.nextInt(100) < animal.getAttackChance())){
                Animal victim = animal;
                while (victim.equals(animal)) {
                    victim = animals.get(rand.nextInt(animals.size()));
                }
                if (victim.getHealth() > 0) {
                    int newHealth = Math.max(0, victim.getHealth() - animal.getDamage());
                    victim.setHealth(newHealth);
                    System.out.printf("%1$s hat %2$s gebissen, %2$s's Restgesundheit ist %3$d%n", animal.getName(), victim.getName(), newHealth);
                    if (newHealth <= 0) {
                        System.out.printf("%s hat den Angriff nicht überlebt. Wird von dem Gehege entfernt.%n", victim.getName());
                        deadAnimals.add(victim);
                    }
                }
            }
        }
        for (Animal deadAnimal: deadAnimals){
            animals.remove(deadAnimal);
        }
    }

    public Animal getAnimalWithMinHealth() {
        Animal result = null;
        for (Animal animalInNeed: animals){
            if (result == null) {
                result = animalInNeed;
            } else if (animalInNeed != null){
                double relHealthOfResult = result.getHealth() / (double)result.getMaxHealth();
                double relHealthOfAnimalInNeed = animalInNeed.getHealth() / (double)animalInNeed.getMaxHealth();
                if (relHealthOfAnimalInNeed < relHealthOfResult){
                    result = animalInNeed;
                }
            }
        }
        return result;
    }

}
