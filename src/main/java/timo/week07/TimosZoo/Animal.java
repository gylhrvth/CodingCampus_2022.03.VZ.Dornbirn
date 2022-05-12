package timo.week07.TimosZoo;


public class Animal {
    private String name;
    private String species;
    private Food food;
    private int dailyNeed;

    public Animal(String name, String species, Food food, int dailyNeed) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.dailyNeed = dailyNeed;

    }


    public String printString(String indention) {
        String out = indention + name;
        out += ", " + species;
        return out;
    }

    @Override
    public String toString() {
        return name + " the " + species;
    }


}
