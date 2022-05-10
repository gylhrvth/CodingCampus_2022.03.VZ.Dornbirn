package arda.week07.zoosimulation;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Epic Zoo", 1980);
        Random rand = new Random();
        int intake1 = rand.nextInt(25) + 10;
        int intake2 = rand.nextInt(15) + 5;
        int intake3 = rand.nextInt(17) + 5;
        AnimalFood fishFood = new AnimalFood("FishFood", 150);
        AnimalFood meat = new AnimalFood("Meat", 150);
        AnimalFood hay = new AnimalFood("Hay", 150);

        Enclosure[] enclosure = {new Enclosure("Dry enclosure"),
                new Enclosure("Humid enclosure"), new Enclosure("Wet enclosure")};

        Animal[] animals = {new Animal("James", "Snake", meat, intake2),
                new Animal("Geoff", "Goat", hay, intake1),
                new Animal("Jeremiah", "Fish", fishFood, intake3)};

        CareTaker[] careTakers = {new CareTaker("Jeff"),
                new CareTaker("Jefferson")};


        zoo.hireCareTaker(careTakers[1]);
        zoo.hireCareTaker(careTakers[0]);
        zoo.addEnclosure(enclosure[0]);
        zoo.addEnclosure(enclosure[2]);
        zoo.buyAnimal(animals[0]);
        zoo.buyAnimal(animals[1]);
        zoo.buyAnimal(animals[2]);
        enclosure[0].addAnimal(animals[1]);
        enclosure[0].addAnimal(animals[0]);
        enclosure[2].addAnimal(animals[2]);
        careTakers[1].taskToCage(enclosure[0]);
        careTakers[0].taskToCage(enclosure[2]);
        for (int i = 1; i <= 3; i++) {
            zoo.zooDaySim(i);
        }
    }
}
