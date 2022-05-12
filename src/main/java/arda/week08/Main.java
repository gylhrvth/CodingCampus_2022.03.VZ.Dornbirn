package arda.week08;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Epic Zoo", 1980);
        Random rand = new Random();
        int intake1 = rand.nextInt(25) + 10;
        int intake2 = rand.nextInt(15) + 5;
        int intake3 = rand.nextInt(17) + 5;

        Stats stats1 = new Stats(50, 50, 9);
        Stats stats2 = new Stats(100, 100, 5);
        Stats stats3 = new Stats(5, 5, 3);
        Stats stats4 = new Stats(125, 125, 26);
        Stats statsOp = new Stats(356,356,46);

        AnimalFood fishFood = new AnimalFood("FishFood", 150);
        AnimalFood meat = new AnimalFood("Meat", 150);
        AnimalFood hay = new AnimalFood("Hay", 150);

        Enclosure[] enclosure = {new Enclosure("Dry enclosure"),
                new Enclosure("Humid enclosure"), new Enclosure("Wet enclosure")};

        Animal[] animals = {new Animal("James May", "Snake", meat, intake2, stats1),
                new Animal("Geoff", "Goat", hay, intake1, stats2),
                new Animal("Richard Hammond", "Goldfish", fishFood, intake3, stats3),
                new Animal("Jeremy Clarkson", "Shark", meat, intake2, stats4),
                new Animal("Killer fish from California", "Killer Fish", meat, intake2, statsOp)};

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
        enclosure[2].addAnimal(animals[3]);
        enclosure[2].addAnimal(animals[4]);
        careTakers[1].taskToCage(enclosure[0]);
        careTakers[0].taskToCage(enclosure[2]);

        for (int i = 1; i <= 9; i++) {
            zoo.zooDaySim(i);
        }
    }
}
