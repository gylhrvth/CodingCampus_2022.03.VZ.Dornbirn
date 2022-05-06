package arda.week07.zoosimulation;

public class Enclosure {
    private String enclosure;
    private String enclosureType;
    private Animal animal;
    private Zoo cageOfZoo;

    public Enclosure(String enclosure, String enclosureType) {
        this.enclosure = enclosure;
        this.enclosureType = enclosureType;
        this.animal = null;
        this.cageOfZoo = null;
    }

    public String getEnclosureType() {
        return enclosureType;
    }

    public void setEnclosureType(String enclosureType) {
        this.enclosureType = enclosureType;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setCageOfZoo(Zoo cageOfZoo) {
        this.cageOfZoo = cageOfZoo;
    }

    public Zoo getCageOfZoo() {
        return cageOfZoo;
    }

    public void addAnimal(Animal animal) {
        if (this.animal == null) {
            if (animal.getCageOfAnimal() == null) {
                this.animal = animal;
                animal.setCageOfAnimal(this);
            } else {
                System.out.println("Animal is already in " + animal.getCageOfAnimal());
            }
        } else {
            System.out.println("Enclosure already has an Animal in it");
        }
    }

    public void removeAnimal() {
        if (animal != null) {
            animal.setCageOfAnimal(null);
            animal = null;
        } else {
            System.out.println("Cage is already empty");
        }
    }

    @Override
    public String toString() {
        return enclosure + ", Enclosuretype: " + enclosureType + ", " + animal + '}';
    }
}

