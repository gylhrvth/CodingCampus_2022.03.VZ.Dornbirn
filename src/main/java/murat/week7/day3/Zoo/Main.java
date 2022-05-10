package murat.week7.day3.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zooDarica = new Zoo("Darica HB", "Istanbul", 1993);

        Enclosure reed = zooDarica.addEnclosure("Reed", false);
        Enclosure terr = zooDarica.addEnclosure("Terrarium", false);
        Enclosure grass = zooDarica.addEnclosure("Grassland", false);
        Enclosure des = zooDarica.addEnclosure("Desert", false);
        Enclosure alpine = zooDarica.addEnclosure("Alpine Meadow", false);

        Enclosure[] encList = {reed, terr, grass, des, alpine};

        alpine.addAnimal("Ricco", "Cow", 80.0f, 110, 50.0f);
        reed.addAnimal("Oscar", "Ostrich", 60.0f, 70, 70.0f);
        reed.addAnimal("Earl", "Eagle", 70.0f, 80, 80.0f);
        reed.addAnimal("Chika", "Chicken", 20.0f, 30, 70.0f);
        terr.addAnimal("Ronald", "Rooster", 30.0f, 40, 60.0f);
        terr.addAnimal("Lionel", "Lion", 50.0f, 60, 90.0f);
        terr.addAnimal("Tom", "Tortoise", 30.0f, 90, 80.0f);
        terr.addAnimal("Catrine", "Cat", 60.0f, 70, 70.0f);
        terr.addAnimal("Douglas", "Dog", 50.0f, 60, 50.0f);
        grass.addAnimal("Biden", "Bison", 110.0f, 120, 70.0f);
        grass.addAnimal("Derek", "Deer", 80.0f, 90, 50.0f);
        grass.addAnimal("Shaun", "Sheep", 70.0f, 80, 50.0f);
        des.addAnimal("Cameron", "Camel", 20.0f, 120, 80.0f);

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


        // Simulation 0.1-----------------------
        System.out.println("Carers are on duty\n---------------------------------------------");
        for (Carer aCarer : cList) {
            aCarer.simulation01();
        }

        // Simulation 0.2-----------------------
        System.out.println("\n--------------SIM 0.2 - NATURAL SELECTION------------");
        for (Enclosure enc:encList) {
            enc.simulation02();
            System.out.println("Current Enclosure: "   + enc);
        }

        // Simulation 0.3
        System.out.println("\n------------SIM 0.3 - HEALING PROCESS------------");
        for (Veterinarian v:vList) {
            zooDarica.simulation03();
        }
    }

    public static void printEnclosureList(Enclosure[] enclosures) {

        for (Enclosure e : enclosures) {
            System.out.println(e);
        }
    }
}
