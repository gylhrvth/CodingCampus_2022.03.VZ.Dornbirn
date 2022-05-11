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
    private Stats stats;
    private Random rand = new Random();

    static final String GREEN = "\033[0;92m";
    static final String RESET = "\033[0m";
    static final String YELLOW = "\033[0;93m";

    public Animal(String name, String genus, AnimalFood foodType, int foodIntake,Stats stats) {
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

    public CareTaker getCareTaker() {
        return careTaker;
    }

    public Enclosure getCageOfAnimal() {
        return cageOfAnimal;
    }

    public Stats getStats() {
        return stats;
    }

    public void feedAnimal(HashMap<AnimalFood, Integer> statistic) {
        System.out.println(name + " gets fed " + foodIntake + " " + foodType.getFoodType());
        foodType.reduceFoodAmount(foodIntake);
        if (statistic.containsKey(foodType)) {
            statistic.put(foodType, statistic.get(foodType) + foodIntake);
        } else {
            statistic.put(foodType, foodIntake);
        }
    }
    /*
        public void getStatistic(List<Animal> animals){
            HashMap<AnimalFood, Integer> statistic = new HashMap<>();
            for (int i = 0; i < animals.size(); i++) {
                AnimalFood foodType = animals.get(i).getFoodType();
                foodType.redurceFoodAmount(animals.get(i).getFoodIntake());
                if (statistic.containsKey(foodType)){
                    statistic.put(foodType, statistic.get(foodType) + animals.get(i).getFoodIntake());
                } else {
                    statistic.put(foodType, animals.get(i).getFoodIntake());
                }
            }
        }
    */
    @Override
    public String toString() {
        return name + " (" + genus + ")";
    }
}
