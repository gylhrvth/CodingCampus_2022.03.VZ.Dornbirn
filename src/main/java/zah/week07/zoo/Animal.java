package zah.week07.zoo;


import java.util.HashMap;

public class Animal {
    private String name;
    private String species;
    private Feed feed;
    private Integer requirement;
    private int health;
    private int maxHealth;
    private int damage;


    public Animal(String name, String speciment, Feed feed, Integer requirement, int health, int maxHealth, int damage) {
        this.name = name;
        this.species = speciment;
        this.feed = feed;
        this.requirement = requirement;
        this.health = health;
        this.maxHealth = maxHealth;
        this.damage = damage;


    }
    public void bites(Animal anotherAnimal){
        anotherAnimal.health -= this.damage;


    }

    public void feedAnimal(HashMap<Feed, Integer> statistik) {
        System.out.println(name + " has received " + requirement + " " + feed.getUnit() + " of " + feed.getName());
        if (statistik.containsKey(feed)) {
            statistik.put(feed, statistik.get(feed) + requirement);
        } else {
            statistik.put(feed, requirement);
        }
    }


    public String toString(String indention) {
        String out = indention + name;
        out += " " + species;
        out+= " "+ health+ " "+ damage;
        return out;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
