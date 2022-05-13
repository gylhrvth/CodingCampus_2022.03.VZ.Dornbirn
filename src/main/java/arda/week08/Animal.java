package arda.week08;

import java.util.HashMap;
import java.util.Random;

public class Animal {
    private final String name;
    private final String genus;
    private Enclosure cageOfAnimal;
    private AnimalFood foodType;
    private final int foodIntake;
    private CareTaker careTaker;
    private final Stats stats;
    private Random rand = new Random();

    static final String GREEN = "\033[0;92m";
    static final String RESET = "\033[0m";
    static final String YELLOW = "\033[0;93m";
    static final String RED = "\033[1;91m";

    public Animal(String name, String genus, AnimalFood foodType, int foodIntake, Stats stats) {
        this.name = name;
        this.genus = genus;
        this.foodType = foodType;
        this.foodIntake = foodIntake;
        this.stats = stats;
        this.cageOfAnimal = null;
    }

    public String getName() {
        return name;
    }

    public AnimalFood getFoodType() {
        return foodType;
    }

    public void setFoodType(AnimalFood foodType) {
        this.foodType = foodType;
    }

    public int getFoodIntake() {
        return foodIntake;
    }

    public void setCageOfAnimal(Enclosure cageOfAnimal) {
        this.cageOfAnimal = cageOfAnimal;
    }

    public Enclosure getCageOfAnimal() {
        return cageOfAnimal;
    }

    public Stats getStats() {
        return stats;
    }

    public void feedAnimal(HashMap<AnimalFood, Integer> statistic) {
        if (!isDead()) {
            if (foodType.getFoodAmount() > 0) {
                System.out.println(name + " gets fed " + foodIntake + " " + foodType.getFoodType());
                foodType.reduceFoodAmount(foodIntake);
            } else {
                System.out.println(name + " could not be fed." + " There is no food left!");
                //the starve function works but messes up the heal function.
                //getStats().setHealth(getStats().getHealth() - 5);
                //if (getStats().getHealth() <= 0) {
                //    System.out.println(name + " has" + RED + " Starved to death." + RESET);
                //}

            }
            if (statistic.containsKey(foodType)) {
                statistic.put(foodType, statistic.get(foodType) + foodIntake);
            } else {
                statistic.put(foodType, foodIntake);
            }
        }
    }

    public boolean isDead() {
        if (getStats().getHealth() <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " (" + genus + ")";
    }
}
