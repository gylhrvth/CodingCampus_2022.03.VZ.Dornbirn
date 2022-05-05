package sergej.week07.zoo;

public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
