package arda.week07.zoosimulation;

import murat.week7.day3.Car.Car;

public class Enclosure {
    private String enclosure;
    private String enclosureType;
    private Animal animal;
    private Zoo cageOfZoo;
    private CareTaker careTaker;

    public Enclosure(String enclosure, String enclosureType) {
        this.enclosure = enclosure;
        this.enclosureType = enclosureType;
        this.animal = null;
        this.cageOfZoo = null;
        this.careTaker = null;
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

    public void taskCareTaker(CareTaker careTaker) {
        if (this.careTaker == null) {
            this.careTaker = careTaker;
            careTaker.setTaskedToCage(this);
        } else {
            System.out.println("Enclosure has already been tasked with an CareTaker");
        }
    }

    public void deTaskCareTaker() {
        if (careTaker != null) {
            careTaker.setTaskedToCage(null);
            careTaker = null;
        } else {
            System.out.println("Enclosure does not have an CareTaker to remove.");
        }
    }

    @Override
    public String toString() {
        return "    " + enclosure + ", Enclosuretype: " + enclosureType + "\n         " + animal +
                "\n              " + careTaker;
    }
}

