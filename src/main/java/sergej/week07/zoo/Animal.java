package sergej.week07.zoo;


import java.util.HashMap;

public class Animal {
    private String name;
    private String species;
    private Food food;
    private String foodName;
    private String unit;
    int amount;


    public Animal(Zoo zoo ,Food food, String enclosureName, String name, String species, String foodName, String unit, int amount) {
        this.name = name;
        this.species = species;
        Enclosure enc = zoo.searchEnclosureByName(enclosureName);
        enc.addAnimal(this);
        this.foodName = foodName;
        this.unit = unit;
        this.amount = amount;
        this.food = food;

    }

    public Animal(Enclosure enc, String name, String species) {
        this.name = name;
        this.species = species;
        enc.addAnimal(this);
    }

    public void printStructure() {
        System.out.println("│       ├── " + name + ", " + species);
    }

    public void eatFood() {
        System.out.println(name + " has eaten " + amount + " " + unit + " of " + foodName);

    }

    public String getFoodName() {
        return foodName;
    }

    public int getAmount() {
        return amount;
    }

    public Food getFood() {
        return food;
    }

    public void foodSimulator(HashMap<Food, Integer> dailyFood) {
        if (!dailyFood.containsKey(food)) {
            dailyFood.put(food, amount);
        } else {
            dailyFood.put(food, dailyFood.get(food) + amount);
        }
    }
}
