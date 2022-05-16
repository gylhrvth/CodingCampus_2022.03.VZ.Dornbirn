package zah.week07.zoo;

import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

public class Enclosure {
    private String name;
    private Zoo zoo;
    private Vector<Animal> animals;
    private int lastDayOfCleaning = 0;
    public static Random RANDOM = new Random();

    public Enclosure(Zoo zoo, String name) {
        this.zoo = zoo;
        this.name = name;
        animals = new Vector<>();
        zoo.addEnclosure(this);
    }

    public String toString(String indention) {
        String out = indention + name;
        for (Animal an : animals) {
            out += "\n\t\t\t├──" + " " + an.toString(indention);

        }
        return out;
    }

    public Animal addAnimal(String name, String species, Feed feed, Integer requirement, int health, int maxHealth, int damage) {
        Animal an = new Animal(name, species, feed, requirement, health, maxHealth, damage);
        animals.add(an);
        return an;
    }

    public void simulateBites(int day) {
        Random random = new Random();
        Vector<Animal> deadAnimal = new Vector<>();

        if (animals.size() > 1) {
            for (int i = 0; i < 5; i++) {
                Animal attacker = animals.get(random.nextInt(animals.size()));
                Animal victim = getAnotherRandomAnimal(attacker);
                if (victim == null) {
                    break;
                }
                if (attacker.getHealth() <= 0 || victim.getHealth() <= 0) {
                    continue;
                }
                if (Math.random() >= 0.6) {
                    attacker.bites(victim);
                }
                if (victim.getHealth() <= 0) {
                    System.out.println(victim.getName() + " Is not more alive and will be remove from Enclosure");
                    deadAnimal.add(victim);
                }
            }
            for (Animal deadAnimals : deadAnimal) {
                animals.remove(deadAnimals);
            }
        }
    }

    private Animal getAnotherRandomAnimal(Animal animal) {
        if (animals.size() <= 1) {
            return null;
        }
        Animal otherAnimal = animals.get(RANDOM.nextInt(animals.size()));
        if (otherAnimal != animal) {
            return otherAnimal;
        } else {
            return getAnotherRandomAnimal(animal);
        }
    }

    public String getName() {
        return name;
    }
// Is not more use
//    public void simulateNurse() {
//        System.out.println(name + " Has been cleared");
//    }

    public int getLastDayOfCleaning() {
        return lastDayOfCleaning;
    }

    public void setLastDayOfCleaning(int lastDayOfCleaning) {
        this.lastDayOfCleaning = lastDayOfCleaning;
    }

    public void feedAnimals(HashMap<Feed, Integer> statistik) {
        for (Animal an : animals) {
            an.feedAnimal(statistik);
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

