package murat.week8.Zoo;

public class ZooCreator {

    public static Zoo createAZoo() {

        Zoo zooDarica = new Zoo("Darica HB", "Istanbul", 1993);

        Enclosure reed = zooDarica.addEnclosure("Reed", false);
        Enclosure terr = zooDarica.addEnclosure("Terrarium", false);
        Enclosure grass = zooDarica.addEnclosure("Grassland", false);
        Enclosure des = zooDarica.addEnclosure("Desert", false);
        Enclosure alpine = zooDarica.addEnclosure("Alpine Meadow", false);

        Enclosure[] encList = {reed, terr, grass, des, alpine};

        Food foodHay = zooDarica.addFood("Hay", "Gram", 15);
        Food foodGrass = zooDarica.addFood("Grass", "Gram", 5);
        Food foodWorm = zooDarica.addFood("Worm", "Piece", 25);
        Food foodInsect = zooDarica.addFood("Insect", "Piece", 20);
        Food foodMeat = zooDarica.addFood("Meat", "Gram", 50);

        Food[] foods = {foodHay, foodGrass, foodWorm, foodInsect, foodMeat};

        reed.addAnimal("Ricco", "Cow", 80.0f, 110, 50.0f, foodHay, 4000);
        reed.addAnimal("Oscar", "Ostrich", 60.0f, 70, 70.0f, foodGrass, 300);
        reed.addAnimal("Earl", "Eagle", 70.0f, 80, 80.0f, foodWorm, 100);
        reed.addAnimal("Chika", "Chicken", 20.0f, 30, 70.0f, foodWorm, 300);
        reed.addAnimal("Donald", "Duck", 40, 90, 50, foodInsect, 400);
        terr.addAnimal("Ronald", "Rooster", 30.0f, 40, 60.0f, foodInsect, 200);
        terr.addAnimal("Lionel", "Lion", 50.0f, 60, 90.0f, foodMeat, 3000);
        terr.addAnimal("Tom", "Tortoise", 30.0f, 90, 80.0f, foodGrass, 300);
        terr.addAnimal("Catrine", "Cat", 60.0f, 70, 70.0f, foodMeat, 1000);
        terr.addAnimal("Douglas", "Dog", 50.0f, 60, 50.0f, foodMeat, 800);
        terr.addAnimal("Snoop", "Snake", 70.0f, 90, 90.0f, foodInsect, 400);
        grass.addAnimal("Biden", "Bison", 110.0f, 120, 70.0f, foodGrass, 5000);
        grass.addAnimal("Derek", "Deer", 80.0f, 90, 50.0f, foodHay, 1500);
        grass.addAnimal("Shaun", "Sheep", 70.0f, 80, 50.0f, foodHay, 500);
        des.addAnimal("Cameron", "Camel", 80.0f, 90, 80.0f, foodHay, 2500);
        des.addAnimal("Charlie", "Chameleon", 20.0f, 100, 70.0f, foodInsect, 100);

        Carer carerPeter = zooDarica.addCarer("Peter", terr.getAnimals().get(0));  // Best buddy Ronald the Rooster
        carerPeter.addTask("Terrarium");
        carerPeter.addTask("Grassland");
        carerPeter.addTask("Desert");

        Carer carerTim = zooDarica.addCarer("Tim", reed.getAnimals().get(1));     // Best buddy Earl the Eagle
        carerTim.addTask("Reed");
        carerTim.addTask("Grassland");
        carerTim.addTask("Desert");

        Carer carerBeatrice = zooDarica.addCarer("Beatrice", terr.getAnimals().get(1));   // Best buddy Lionel the Lion
        carerBeatrice.addTask("Reed");
        carerBeatrice.addTask("Terrarium");
        carerBeatrice.addTask("Desert");
        carerBeatrice.addTask("Alpine Meadow");

        Carer[] cList = {carerPeter, carerTim, carerBeatrice};

        Veterinarian vetFlo = zooDarica.addVet("Florence Nightingale");
        Veterinarian vetPast = zooDarica.addVet("Louis Pasteur");
        Veterinarian vetUgur = zooDarica.addVet("Ugur Sahin");

        Veterinarian[] vList = {vetFlo, vetPast, vetUgur};

        return zooDarica;
    }
}
