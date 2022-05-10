package cemil.week08.zoo;


import java.util.HashMap;

public class Animal {
    private String name;
    private String art;
    private Feed feed;
    private Integer requirement;


    public Animal(String name, String art, Feed feed, Integer requirement) {
        this.name = name;
        this.art = art;
        this.feed = feed;
        this.requirement = requirement;

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
        return out;
    }

    @Override
    public String toString() {
        return toString("");
    }
}
