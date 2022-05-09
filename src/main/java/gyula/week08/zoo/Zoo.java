package gyula.week08.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int established;
    private Vector<Enclosure> enclosures;
    private Vector<AnimalCarer> animalCarers;

    public Zoo(String name, int established){
        this.name = name;
        this.established = established;
        this.enclosures = new Vector<>();
        this.animalCarers = new Vector<>();
    }

    public void addEnclosure(Enclosure enc){
        if (!enclosures.contains(enc)) {
            enclosures.add(enc);
        }
    }

    public Enclosure searchEnclosureByName(String name){
        for (Enclosure enc: enclosures){
            if (enc.getName().equals(name)){
                return enc;
            }
        }
        return new Enclosure(this, name);
    }

    public void printStructure() {
        System.out.println("├── Zoo: " + name + ", gegründet " + established);
        for (Enclosure enc: enclosures){
            enc.printStucture();
        }
        System.out.println();
        System.out.println("Mitarbeiter:");
        for (AnimalCarer ac : animalCarers){
            ac.printStructure();
        }
    }

    public void addAnimalCarer(AnimalCarer animalCarer) {
        if (!animalCarers.contains(animalCarer)){
            animalCarers.add(animalCarer);
        }
    }

    public void simulate(int tag) {
        for (AnimalCarer ac: animalCarers){
            ac.simulate(tag);
        }
    }

}
