package zah.week07.zoo;

public class Animal {
    private String name;
    private String species;


    public Animal(String name, String speciment) {
        this.name = name;
        this.species = speciment;

    }

    public String toString(String indention) {
        String out = indention + name;
        out += species;
        return out;
    }

}
