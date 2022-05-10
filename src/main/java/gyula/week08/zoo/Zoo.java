package gyula.week08.zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private int established;
    private Vector<Enclosure> enclosures;
    private Vector<AnimalCarer> animalCarers;
    private Vector<Veterinarian> veterinarians;

    public Zoo(String name, int established){
        this.name = name;
        this.established = established;
        this.enclosures = new Vector<>();
        this.animalCarers = new Vector<>();
        this.veterinarians = new Vector<>();
    }

    public void addVeterinarian(Veterinarian vet){
        if (!veterinarians.contains(vet)) {
            veterinarians.add(vet);
        }
    }

    public Veterinarian searchVeterinarianByName(String name){
        for (Veterinarian vet: veterinarians){
            if (vet.getName().equals(name)){
                return vet;
            }
        }
        return new Veterinarian(this, name);
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
        System.out.println("Tierärzte:");
        for (Veterinarian vet: veterinarians){
            vet.printStructure();
        }
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
        for (Enclosure enclosure: enclosures){
            enclosure.simulate();
        }
        for (Veterinarian vet : veterinarians){
            vet.simulate();
        }
    }

    public Animal getAnimalWithMinHealth() {
        Animal result = null;
        for (Enclosure enc: enclosures){
            Animal animalInNeed = enc.getAnimalWithMinHealth();
            if (result == null) {
                result = animalInNeed;
            } else if (animalInNeed != null){
                double relHealthOfResult = result.getHealth() / (double)result.getMaxHealth();
                double relHealthOfAnimalInNeed = animalInNeed.getHealth() / (double)animalInNeed.getMaxHealth();
                if (relHealthOfAnimalInNeed < relHealthOfResult){
                    result = animalInNeed;
                }
            }
        }
        return result;
    }
}
