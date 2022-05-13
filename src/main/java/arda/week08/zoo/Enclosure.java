package arda.week08.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Enclosure {
    private String enclosureType;
    private List<Animal> animals = new ArrayList<>();
    private Zoo cageOfZoo;
    private final List<CareTaker> careTakers = new ArrayList<>();
    private int lastDayOfCleaning = 0;
    private static final Random rand = new Random();
    private final List<Vet> vets = new ArrayList<>();
    static final String GREEN = "\033[0;92m";
    static final String RESET = "\033[0m";
    static final String YELLOW = "\033[0;93m";
    static final String BLUE = "\033[0;94m";
    static final String RED = "\033[1;91m";

    public Enclosure(String enclosureType) {
        this.enclosureType = enclosureType;
        this.cageOfZoo = null;
    }

    public String getEnclosureType() {
        return enclosureType;
    }

    public void setEnclosureType(String enclosureType) {
        this.enclosureType = enclosureType;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void setCageOfZoo(Zoo cageOfZoo) {
        this.cageOfZoo = cageOfZoo;
    }

    public Zoo getCageOfZoo() {
        return cageOfZoo;
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        } else {
            System.out.println("Animal could not be added");
        }
    }

    public void removeAnimal(Animal animal) {
        if (animals.contains(animal)) {
            animals.remove(animal);
        }
    }

    public void addCareTaker(CareTaker ct) {
        careTakers.add(ct);
    }

    public void addVeterinarian(Vet vet) {
        vets.add(vet);
    }

    @Override
    public String toString() {
        String output = enclosureType + "\n" + "         " + animals +
                "\n";
        for (CareTaker ct : careTakers) {
            output += "         CareTaker: " + ct.getName();
        }
        return output;
    }

    public void takeCareOfAnimal(int workDay, HashMap<AnimalFood, Integer> statistic) {
        if (lastDayOfCleaning != workDay) {
            removeDead();
            System.out.println(BLUE + enclosureType + RESET + " is cleaned");
            lastDayOfCleaning = workDay;
            for (Animal animal : animals) {
                animal.feedAnimal(statistic);
            }
            healAnimal();
        } else {
            System.out.println(enclosureType + " has been cleared before");
        }
    }

    public boolean healAnimal() {
        for (Vet vet : vets) {
            vet.healAnimal(this);
        }
        return true;
    }

    public void bite() {
        System.out.println();
        int random = rand.nextInt(4) + 1;
        int random2 = rand.nextInt(254) + 1;
        Animal randomAnimal = animals.get(rand.nextInt(animals.size()));
        Animal randomAnimal2 = animals.get(rand.nextInt(animals.size()));
        if (!(randomAnimal.getStats().getHealth() <= 0)) {
            if (randomAnimal != randomAnimal2) {
                if (random == 4 && animals.size() > 0) {
                    System.out.println(randomAnimal + RED + " bites " + RESET + randomAnimal2 + " for " + RED + (randomAnimal.getStats().getBiteDMG()) + " dmg" + RESET);
                    randomAnimal2.getStats().setHealth(randomAnimal2.getStats().getHealth() - randomAnimal.getStats().getBiteDMG());
                    if (randomAnimal2.getStats().getHealth() > 0) {
                        System.out.println(randomAnimal2 + " is now at " + RED + randomAnimal2.getStats().getHealth() + RESET + " health.");
                    } else {
                        System.out.println(randomAnimal2 + " is " + RED + "dead." + RESET);
                    }
                } else if (random2 == 254) {
                    for (int i = 0; i < careTakers.size(); i++) {
                        System.out.println(RED + randomAnimal + " bites " + careTakers.get(i).getName() + RESET);
                    }
                }
            }
        }
    }

    public void removeDead() {
        for (int i = 0; i < getAnimals().size(); i++) {
            Animal animal = getAnimals().get(i);
            if (animal.isDead()) {
                for (int j = 0; j < careTakers.size(); j++) {
                    System.out.println(RED + careTakers.get(i).getName() + " removes the carcass of " + animal + RESET + " from " + BLUE + getEnclosureType() + RESET + ".");
                    removeAnimal(animal);
                }
            }
        }
    }

    public Animal admireAnimal() {
        if (animals.size() > 0) {
            return animals.get(rand.nextInt(animals.size()));
        }
        return null;
    }
}

