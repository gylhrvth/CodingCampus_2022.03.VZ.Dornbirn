package aron.week07.zoosim;



import java.util.ArrayList;
import java.util.List;

public class Enclosure {

    private String name;
    private ClimateZone clima;
    private Areasize size;
    private List<Animal> animal = new ArrayList<>();
    private Zoo cageOfZoo;



    public Enclosure(String name, ClimateZone clima, Areasize size){

        this.name = name;
        this.clima = clima;
        this.size = size;

        this.cageOfZoo = null;

    }

    public ClimateZone getClima() {return clima;
    }

    public void setClima(ClimateZone clima) {
        this.clima = clima;
    }

    public Animal getAnimal() {
        return getAnimal();
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
                animal = animal;
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
            animal.remove(animal);
            animal = null;
        } else {
            System.out.println("Cage is already empty");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String output = "│   ├── "+ name +"|" + clima +
                size +"\n";
        output += "│         ├──" + animal;
        output += " CageOfZoo= " + cageOfZoo;
        return output;
    }
}

