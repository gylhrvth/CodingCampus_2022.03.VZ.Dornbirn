package timo.week07.TimosZoo;


import java.util.HashMap;

public class Animal {
    private String name;
    private String species;
    private Food food;
    int dailyNeed;
    private int maxHealth;
    private int health;
    private int damage;
    private int attackChance;

    public Animal(String name, String species, Food food, int dailyNeed, int health, int damage, int attackChance) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.dailyNeed = dailyNeed;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
        this.attackChance = attackChance;

    }


    public String printString(String indention) {
        String out = indention + name;
        out += ", " + species;
        return out;
    }

    @Override
    public String toString() {
        return name + " the " + species;
    }


    public void foodSimulator(HashMap<Food, Integer> dailyFood) {
        if (!dailyFood.containsKey(food)) {
            dailyFood.put(food, dailyNeed);
        } else {
            dailyFood.put(food, dailyFood.get(food) + dailyNeed);
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttackChance() {
        return attackChance;
    }
}
