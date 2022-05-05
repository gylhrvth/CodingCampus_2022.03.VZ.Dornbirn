package lukas.week7.day4.animals;

public class Fuchs extends Animal {

    public Fuchs() {
        this("Woods/Forest");
    }

    public Fuchs(String habitat) {
        super(habitat);
    }

    @Override
    public void move() {
        System.out.println("Running round his " + getHabitat());
    }
}