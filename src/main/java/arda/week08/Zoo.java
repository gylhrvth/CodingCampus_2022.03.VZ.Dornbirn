package arda.week08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zoo {
    private final String name;
    private final int foundingYear;
    private final List<Enclosure> enclosures = new ArrayList<>();
    private final List<CareTaker> workers = new ArrayList<>();
    static final String GREEN = "\033[0;92m";
    static final String RESET = "\033[0m";
    static final String YELLOW = "\033[0;93m";
    private final List<Animal> animals = new ArrayList<>();

    public Zoo(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
    }

    public List<CareTaker> getWorkers() {
        return workers;
    }


    public void addEnclosure(Enclosure enclosure) {
        if (!enclosures.contains(null)) {
            enclosures.add(enclosure);
        } else {
            System.out.println("Enclosure could not be added");
        }
    }

    public void removeEnclosure(Enclosure enclosure) {
        if (enclosures.contains(null)) {
            enclosures.remove(enclosure);
        }
    }

    public void hireCareTaker(CareTaker careTaker) {
        if (!workers.contains(null)) {
            workers.add(careTaker);
        } else {
            System.out.println("CareTaker could not be hired");
        }
    }

    public void buyAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        } else {
            System.out.println("Animal could not be added");
        }
    }

    public void sellAnimal(Animal animal) {
        if (animals.contains(animal)) {
            animals.remove(animal);
        }
    }

    public void zooDaySim(int workDay) {
        System.out.println();
        System.out.printf(GREEN + "Day %d is starting...." + RESET + "%n", workDay);
        HashMap<AnimalFood, Integer> statistic = new HashMap<>();
        for (CareTaker careTaker : workers) {
            careTaker.simulateDay(workDay, statistic);
        }
        foodLeft(statistic.keySet().stream().toList());
        dailySpending(statistic.keySet().stream().toList());
        //System.out.println(statistic);
    }

    public void dailySpending(List<AnimalFood> animalFoods) {
        System.out.println(GREEN + "==== Today's Spending ====" + RESET);
        for (AnimalFood foodType : animalFoods) {
            if (foodType.getFoodAmount() > 0) {
                System.out.println(foodType.getFoodType() + " " + YELLOW + (foodType.getFoodAmount() + foodType.getPrice()) + "€" + RESET);
            } else {
                System.out.println(foodType.getFoodType() + " " + YELLOW + 0 + "€" + RESET);
            }
        }
    }

    public void foodLeft(List<AnimalFood> animalFoods) {
        System.out.println();
        System.out.println(GREEN + "==== Food Count ====" + RESET);
        for (AnimalFood foodType : animalFoods) {
            if (foodType.getFoodAmount() > 0) {
                System.out.println(foodType.getFoodType() + ": " + YELLOW + foodType.getFoodAmount() + RESET + " units of food.");
            } else {
                System.out.println("there is no more " + YELLOW + foodType.getFoodType() + RESET + " left!");
            }
        }
    }

    public void listAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }

    @Override
    public String toString() {
        String output = "";
        output += "Zoo: " + name + ", founded " + foundingYear + "\n" +
                "  Enclosures: \n";
        for (Enclosure enc : enclosures) {
            output += enc + "\n";
        }
        return output;
    }
}

