package aron.week07.zoosim;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Enclosure {

    private String enclosureName;
    private ClimateZone clima;
    private Areasize size;
    private List<Animal> animals = new ArrayList<>();
    private Zoo cageOfZoo;
    private int lastDayOfCleaning = 0;


    public Enclosure(String enclosureName, ClimateZone clima, Areasize size) {

        this.enclosureName = enclosureName;
        this.clima = clima;
        this.size = size;

        this.cageOfZoo = null;

    }

    public ClimateZone getClima() {
        return clima;
    }

    public void setClima(ClimateZone clima) {
        this.clima = clima;
    }

    public Animal getAnimal() {
        return getAnimal();
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        } else {
            System.out.println("Enclosure already has an Animal in it");
        }
    }

    public void removeAnimal(Animal animal) {
        if (animals.contains(animal)) {
            animals.remove(animal);
        } else {
            System.out.println(animal.getName() + " is not in the cage " + enclosureName);
        }
    }

    public String getName() {
        return enclosureName;
    }

    @Override
    public String toString() {
        String output = "│   ├── " + enclosureName + "|" + clima +
                size + "\n";

        for (int i = 0; i < animals.size(); i++) {
            output += "│         ├── " + animals.get(i) + "\n";
        }
        return output;
    }

    public int getLastDayOfCleaning() {
        return lastDayOfCleaning;
    }

    public void setLastDayOfCleaning(int lastDayOfCleaning) {
        this.lastDayOfCleaning = lastDayOfCleaning;
    }

    public void feedAnimals(HashMap<Food, Integer> feedStatistik) {
        return ;
    }
}

