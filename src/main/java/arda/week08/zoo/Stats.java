package arda.week08.zoo;

public class Stats {
    private int health;
    private int maxHealth;
    private int biteDMG;

    public Stats(int health, int maxHealth, int biteDMG){
        this.health = health;
        this.maxHealth = maxHealth;
        this.biteDMG = biteDMG;
    }

    public int getHealth() {
        return health;
    }

    public int getBiteDMG() {
        return biteDMG;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
