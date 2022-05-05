package lukas.week7.day4.animals;

public abstract class Animal {
    private String habitat;

    public Animal(String habitat) {
        this.habitat = habitat;
    }

    public abstract void move();

    public String getHabitat() {
        return habitat;
    }
}