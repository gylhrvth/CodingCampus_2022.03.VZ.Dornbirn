package murat.week7.day3.Zoo;

public class ZooMain {
    public static void main(String[] args) {

        Zoo zooDarica = new Zoo("Darica HB", "Istanbul", 1993);

        Enclosure reed = zooDarica.addEnclosure("Reed", false);
        Enclosure terr = zooDarica.addEnclosure("Terrarium", false);
        Enclosure grass = zooDarica.addEnclosure("Grassland", false);
        Enclosure des = zooDarica.addEnclosure("Desert", false);
        Enclosure alpine = zooDarica.addEnclosure("Alpine Meadow", false);

        Enclosure[] encList = {reed, terr, grass, des, alpine};

        Food foodHay = zooDarica.addFood("Hay", "Gramm", 15);
        Food foodGrass = zooDarica.addFood("Grass", "Gramm", 5);
        Food foodWorm = zooDarica.addFood("Worm", "Piece", 25);
        Food foodInsect = zooDarica.addFood("Insect", "Piece", 20);
        Food foodMeat = zooDarica.addFood("Meat", "Gramm", 50);

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
        grass.addAnimal("Biden", "Bison", 110.0f, 120, 70.0f, foodGrass, 5000);
        grass.addAnimal("Derek", "Deer", 80.0f, 90, 50.0f, foodHay, 1500);
        grass.addAnimal("Shaun", "Sheep", 70.0f, 80, 50.0f, foodHay, 500);
        des.addAnimal("Cameron", "Camel", 80.0f, 90, 80.0f, foodHay, 2500);

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

        zooDarica.printStructure();

        // Simulation 0.1-----------------------
        System.out.println(Zoo.BOLD + "\n------------SIM 0.1 - ANIMAL CARERS ON DUTY------------\n" + Zoo.BOLD_RESET);
        for (Carer aCarer : cList) {
            aCarer.simulation01();
        }

        // Simulation 0.2-----------------------
        System.out.println(Zoo.BOLD + "\n--------------SIM 0.2 - NATURAL SELECTION------------" + Zoo.BOLD_RESET);
        for (Enclosure enc : encList) {
            System.out.println(Zoo.ANSI_CYAN + Zoo.BOLD + "\nCurrent Enclosure---> " + enc + Zoo.ANSI_RESET + Zoo.BOLD_RESET);
            enc.simulation02();
        }

        System.out.println();
        zooDarica.printStructure();

        // Simulation 0.3-----------------------
        System.out.println(Zoo.BOLD + "\n------------SIM 0.3 - HEALING PROCESS------------" + Zoo.BOLD_RESET);
        zooDarica.simulation03();

        // Food Consumption-----------------------
        System.out.println(Zoo.BOLD + "\n--------------DAILY FOOD CONSUMPTION------------\n" + Zoo.BOLD_RESET);
        foodHay.foodStatistics(zooDarica);
    }

    public static void printEnclosureList(Enclosure[] enclosures) {

        for (Enclosure e : enclosures) {
            System.out.println(e);
        }
    }
}
