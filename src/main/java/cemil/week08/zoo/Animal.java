package cemil.week08.zoo;


import java.util.HashMap;

public class Animal {
    private String name;
    private String art;
    private Feed feed;
    private Integer requirement;
    private Integer healthy;
    private Integer healthyMax;
    private Integer bite;


    public Animal(String name, String art, Feed feed, Integer requirement) {
        this.name = name;
        this.art = art;
        this.feed = feed;
        this.requirement = requirement;


    }

    public void addHealthAndBite(int h, int hM, int b) {
        healthy = h;
        healthyMax = hM;
        bite = b;
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
        out += ", Maximale Gesundheit " + healthyMax;
        out += ", beißt " + bite + " mal";
        return out;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public Integer getHealthy() {
        return healthy;
    }

    public void setHealthy(Integer healthy) {
        this.healthy = healthy;
    }

    public Integer getHealthyMax() {
        return healthyMax;
    }

    public void setHealthyMax(Integer healthyMax) {
        this.healthyMax = healthyMax;
    }

    public Integer getBite() {
        return bite;
    }

    public void setBite(Integer bite) {
        this.bite = bite;
    }
}
