package arda.week07.zoosimulation;

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
    static final String GREEN = "\033[0;92m";
    static final String RESET = "\033[0m";
    static final String YELLOW = "\033[0;93m";
    static final String BLUE = "\033[0;94m";

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
            System.out.println(BLUE + enclosureType + RESET + " is cleaned");
            lastDayOfCleaning = workDay;

            for (Animal animal : animals) {
                animal.feedAnimal(statistic);
            }
        } else {
            System.out.println(enclosureType + " has been cleared before");
        }
    }

    public Animal admireAnimal() {
        if (animals.size() > 0) {
            return animals.get(rand.nextInt(animals.size()));
        }
        return null;
    }
}

