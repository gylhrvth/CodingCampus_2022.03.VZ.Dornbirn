package murat.week7.day3.Zoo;

public class Animal {
    private String name;

    private String species;

    public Animal(String name, String species) {

        this.name = name;
        this.species = species;
    }

    public String getName() {

        return name;
    }

    public String getSpecies() {

        return species;
    }

    public String toString(String indention) {

        String out = indention + name;
        out += ", " + species;
        return out;
    }
}

