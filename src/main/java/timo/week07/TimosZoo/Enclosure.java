package timo.week07.TimosZoo;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Enclosure {
    Random rand = new Random();

    private String name;
    private List<Animal> animals = new Vector<>();
    private int lastDayCleaned;

    public Enclosure(String name) {
        this.name = name;
        lastDayCleaned = 0;
    }


    public String printString(String indention) {
        String out = indention + name;
        for (Animal a : animals) {
            out += "\n" + "│" + "        " + a.printString(indention);
        }
        return out;
    }

    @Override
    public String toString() {
        return name + "\n" +
                "Animals: " + animals +
                ", cleaned: " + lastDayCleaned + " day/s ago";
    }

    public void setLastDayCleaned (int lastDayCleaned) {
        this.lastDayCleaned = lastDayCleaned;
    }


    public boolean cleanEnclosure(int currentDay) {
        if (currentDay == lastDayCleaned) {
            // Nothing to do
            System.out.println("\u001B[32m" + "This enclosure has already been cleaned and fed." + "\u001B[0m");
            return false;
        } else {
            // Do cleaning
            System.out.println("\u001B[31m" + "This enclosure needs to be cleaned and fed." + "\u001B[0m");
            lastDayCleaned = currentDay;
            return true;
        }
    }


    public Animal addAnimal(String name, String species, Food food, int dailyNeed, int health, int damage, int attackChance) {
        Animal a = new Animal(name, species, food, dailyNeed, health, damage, attackChance);
        animals.add(a);
        return a;
    }

    public void removeAnimal(Animal a) {
        animals.remove(a);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals(Enclosure en) {
        System.out.println(">> Proceeding to feed animals and clean enclosure <<");
        for (int i = 0; i < en.getAnimals().size(); i++) {
            System.out.println("Feeding: " + en.getAnimals().get(i));
        }
    }

    public void getRandomAnimalofEn(Enclosure en) {
        System.out.println("- Randomly watching: " + en.getAnimals().get(rand.nextInt(en.getAnimals().size())));
    }

    public void foodSimulator(HashMap<Food, Integer> food) {
        for (Animal an : animals) {
            an.foodSimulator(food);
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

    public void simulate() {
        Vector<Animal> deadAnimals = new Vector<>();
        for (Animal animal: animals){
            if ((animal.getHealth() > 0) && (rand.nextInt(100) < animal.getAttackChance())){
                if(animals.size() <= 1) {
                    break;
                }
                Animal victim = animal;
                while (victim.equals(animal)) {
                    victim = animals.get(rand.nextInt(animals.size()));
                }
                if (victim.getHealth() > 0) {
                    int newHealth = Math.max(0, victim.getHealth() - animal.getDamage());
                    victim.setHealth(newHealth);
                    System.out.println();
                    System.out.printf("%1$s bit %2$s! %2$s's remaining health is %3$d%n", animal.getName(), victim.getName(), newHealth);
                    if (newHealth <= 0) {
                        System.out.printf("\u001B[31m" + "%s died :(" + "\u001B[0m", victim.getName());
                        deadAnimals.add(victim);
                    }
                }
            }
        }
        for (Animal deadAnimal: deadAnimals){
            animals.remove(deadAnimal);
        }
    }
}


