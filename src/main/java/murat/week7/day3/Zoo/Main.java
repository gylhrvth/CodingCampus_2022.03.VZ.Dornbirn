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

        alpine.addAnimal("Ricco", "Cow");
        reed.addAnimal("Oscar", "Ostrich");
        reed.addAnimal("Earl", "Eagle");
        reed.addAnimal("Chika", "Chicken");
        terr.addAnimal("Ronald", "Rooster");
        terr.addAnimal("Lionel", "Lion");
        terr.addAnimal("Tom", "Tortoise");
        grass.addAnimal("Biden", "Bison");
        grass.addAnimal("Derek", "Deer");
        grass.addAnimal("Shaun", "Sheep");
        des.addAnimal("Cameron", "Camel");

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

        // Simulation 0.1-----------------------
        System.out.println("Carers are on duty\n---------------------------------------------");
        for (Carer aCarer : cList) {
            aCarer.simulation01();
        }

        System.out.println("\n-----------ENCLOSURES---------------");
        printEnclosureList(encList);

        System.out.println("\n" + zooDarica);

    }

    public static void printEnclosureList(Enclosure[] enclosures) {

        for (Enclosure e : enclosures) {
            System.out.println(e);
        }
    }
}
