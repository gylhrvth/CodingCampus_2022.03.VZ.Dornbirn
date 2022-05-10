package philipp.week07.zoo;

public class Animal {
    private String name;
    private String species;
    private int health;
    private int maxHealth;
    private int bite;
    private Feed neededFeed;
    private float requiredFoodDay;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String toString() {
        return name + ", " + species
                +
                " | Health: " + health +
                " maxHealth: " + maxHealth +
                " Bite: " + bite
                ;
    }

    public Feed getNeededFeed() {
        return neededFeed;
    }

    public float getRequiredFoodDay() {
        return requiredFoodDay;
    }

    public String getName() {
        return name;
    }

    public void addFeed(Feed feed, float qty) {
        this.neededFeed = feed;
        this.requiredFoodDay = qty;

    }

    public void addHealthMaxHealthBite(int h, int mh, int b) {
        this.health = h;
        this.maxHealth = mh;
        this.bite = b;
    }

    public int getBite() {
        return bite;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setBite(int bite) {
        this.bite = bite;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}
