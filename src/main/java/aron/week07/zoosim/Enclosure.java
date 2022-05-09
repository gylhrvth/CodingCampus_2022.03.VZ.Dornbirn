package aron.week07.zoosim;


import arda.week07.zoosimulation.Zoo;

public class Enclosure {

    private String name;
    private ClimateZone clima;
    private Areasize size;
    private Animal animal;
    private Zoo cageOfZoo;



    public Enclosure(String name, ClimateZone clima, Areasize size, Animal animal){

        this.name = name;
        this.clima = clima;
        this.size = size;
        this.animal = null;
        this.cageOfZoo = null;

    }

    public ClimateZone getClima() {return clima;
    }

    public void setClima(ClimateZone clima) {
        this.clima = clima;
    }

    public Animal getAnimal() {
        return animal;
    }
    public void setCageOfZoo() {
        this.cageOfZoo = cageOfZoo;
    }

    public Zoo getCageOfZoo() {
        return cageOfZoo;
    }

    public void addAnimal(Animal animal) {
        if (this.animal == null) {
            if (animal.getCageOfAnimal() == null) {
                this.animal = animal;
                animal.getCageOfAnimal();
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
        return "\n"+
               " {"+"name='" + name + '\'' +
                ", clima=" + clima +
                ", size=" + size +
                ", animal=" + animal +
                ", cageOfZoo=" + cageOfZoo + '}';
    }
}

