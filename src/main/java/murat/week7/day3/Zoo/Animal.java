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

    @Override
    public String toString() {

        return name + ", " + species;
    }
}

