package murat.week7.day3.Zoo;

import java.util.Random;

public class Animal {
    private String name;

    private String species;

    private float health;

    private int maxHealth;

    private float bite;

    private Food food;

    private float amountOfFood;

    public Animal(String name, String species, float health, int maxHealth, float bite, Food foodName, float amountOfFood) {

        this.name = name;
        this.species = species;
        this.health = health;
        this.maxHealth = maxHealth;
        this.bite = bite;
        this.food = foodName;
        this.amountOfFood = amountOfFood;

    }

    public String getName() {

        return name;
    }

    public String getSpecies() {

        return species;
    }

    public float getHealth() {

        return health;
    }

    public int getMaxHealth() {

        return maxHealth;
    }

    public float getBite() {

        return bite;
    }

    public Food getFood() {

        return food;
    }

    public float getAmountOfFood() {

        return amountOfFood;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSpecies(String species) {

        this.species = species;
    }

    public void setHealth(float health) {

        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {

        this.maxHealth = maxHealth;
    }

    public void setBite(float bite) {

        this.bite = bite;
    }

    public String toString(String indention) {

        String out = indention + name;
        out += ", " + species;
        return out;
    }

    @Override
    public String toString() {

        return toString("");
    }

    public void printAnimalCondition() {

        System.out.println("N: " + name + " S:" + species + " Health:" + health + " MaxHealth:" + maxHealth + " Bite:" + bite);

    }

    public void printStructure() {

        System.out.println(Zoo.ANSI_GREEN + "│       ├── " + name + ", " + species + ", " + (int) health + "-" + maxHealth + "-" + (int) bite + "-" + food + "-" + amountOfFood + " gr." + Zoo.ANSI_RESET);
    }

    public boolean possibilityOfAnAttack() {

        boolean attack = false;

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (randomNumber <= 40) {
            attack = true;
        }
        return attack;
    }

    public int calculateAnimalConditions() {

        int condition = 0;

        if (health <= maxHealth) {

            condition = (int) ((health / maxHealth) * 100.0);
        } else {
            System.out.println("Max Health can not be smaller than current health");
        }
        return condition;
    }

}

