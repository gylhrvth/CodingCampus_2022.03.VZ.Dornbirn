package timo.week07.TimosZoo;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }


    public String toString(String indention) {
        String out = indention + name;
        out += ", " + species;
        return out;
    }
}
