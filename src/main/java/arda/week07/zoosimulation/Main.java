package arda.week07.zoosimulation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Epic Zoo", 1980);
        Enclosure[] enclosures = {new Enclosure("DuckKingdom", "Wet"),
                new Enclosure("LionKingdom", "Dry"),
                new Enclosure("SneakySnakes", "Dry"),
                new Enclosure("LizardLane", "Humid")};
        Animal[] animal = {new Animal("Jonathan", "Duck"),
                new Animal("James", "Lion"),
                new Animal("George", "Snake"),
                new Animal("Jeff", "Lizard")};
        CareTaker[] careTaker = {new CareTaker("Jameson"), new CareTaker("Peter")};

        zoo.addEnclosure(enclosures[0]);
        zoo.addEnclosure(enclosures[1]);
        zoo.addEnclosure(enclosures[2]);
        zoo.addEnclosure(enclosures[3]);
        enclosures[0].addAnimal(animal[0]);
        enclosures[1].addAnimal(animal[1]);
        enclosures[2].addAnimal(animal[2]);
        enclosures[3].addAnimal(animal[3]);
        enclosures[0].taskCareTaker(careTaker[1]);
        enclosures[1].taskCareTaker(careTaker[1]);
        enclosures[2].taskCareTaker(careTaker[0]);
        enclosures[3].taskCareTaker(careTaker[0]);


        System.out.println(zoo);
    }
}
