package zah.week07.zoo;


import zah.week07.Feed;

import java.util.HashMap;

public class Animal {
    private String name;
    private String species;
    private Feed feed;
    private Integer requirement;



    public Animal(String name, String speciment, Feed feed, Integer requirement) {
        this.name = name;
        this.species = speciment;
        this.feed = feed;
        this.requirement = requirement;
    }

    public void feedAnimal(HashMap<Feed, Integer> statistik) {
        System.out.println(name + " has received " + requirement + " " + feed.getUnit() + " of " + feed.getName());
        if (statistik.containsKey(feed)){
            statistik.put(feed, statistik.get(feed) + requirement);
        } else {
            statistik.put(feed, requirement);
        }
    }

    public String toString(String indention) {
        String out = indention + name;
        out += " " + species;
        return out;
    }

}
