package arda.week07.zoosimulation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Epic Zoo", 1980);
        Enclosure[] enclosure = {new Enclosure("DuckKingdom", "Wet"),
                new Enclosure("LionKingdom", "Dry")};
        Animal[] animal = {new Animal("Jonathan", "Duck"),
                new Animal("James", "Lion")};

        zoo.addEnclosure(enclosure[0]);
        zoo.addEnclosure(enclosure[1]);
        enclosure[0].addAnimal(animal[0]);
        enclosure[1].addAnimal(animal[1]);
        System.out.println(zoo);
    }
}
