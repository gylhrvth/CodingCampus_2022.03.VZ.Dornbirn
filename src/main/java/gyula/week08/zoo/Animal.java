package gyula.week08.zoo;

public class Animal {
    private String name;
    private String species;

    public Animal(Zoo zoo, String enclosureName, String name, String species){
        this.name = name;
        this.species = species;
        Enclosure enc = zoo.searchEnclosureByName(enclosureName);
        enc.addAnimal(this);
    }

    public Animal(Enclosure enc, String name, String species){
        this.name = name;
        this.species = species;
        enc.addAnimal(this);
    }

    public void printStucture() {
        System.out.println("│       ├── " + name + ", " + species);
    }
}
