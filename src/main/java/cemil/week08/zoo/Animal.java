package cemil.week08.zoo;


import java.util.HashMap;

public class Animal {
    private String name;
    private String art;
    private Feed feed;
    private int requirement;
    private int healthy;
    private int healthyMax;
    private int damage;



    public Animal(String name, String art, Feed feed, int requirement) {
        this.name = name;
        this.art = art;
        this.feed = feed;
        this.requirement = requirement;



    }

    public void addHealthAndBite(int h, int damage) {
        healthy = h;
        healthyMax = h;
        this.damage = damage;
    }


    public String getName() {
        return name;
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
        out += ", " + art;
        out += ", Gesundheit " + healthy;
        out += ", fügt " + damage + " schaden zu";

        return out;
    }

    public String toString() {
        return toString("");
    }

    public Integer getHealthy() {
        return healthy;
    }

    public void setHealth(Integer healthy) {
        this.healthy = healthy;
    }

    public Integer getHealthyMax() {
        return healthyMax;
    }

    public void setHealthyMax(Integer healthyMax) {
        this.healthyMax = healthyMax;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }


}
