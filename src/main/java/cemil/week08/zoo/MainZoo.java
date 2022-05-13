package cemil.week08.zoo;




public class MainZoo {
    public static void main(String[] args) {
        Zoo dornbirn = new Zoo("Tiergarten Dornbirn", 2022);

        Animal animalCow = new Animal("Rijska", "Kuh", dornbirn.searchFoodByName("Heu"), 10);
        Animal animalCow1 = new Animal("Liselotte", "Kuh", dornbirn.searchFoodByName("Heu"), 10);
        Animal animalCow2 = new Animal("Milka", "Kuh", dornbirn.searchFoodByName("Heu"), 10);
        Animal animal2 = new Animal("Germond", "Storh", dornbirn.searchFoodByName("Frosch"), 1);
        Animal animal3 = new Animal("Hugo", "Storh", dornbirn.searchFoodByName("Frosch"), 1);
        Animal animal4 = new Animal("Idaxis", "Storh", dornbirn.searchFoodByName("Frosch"), 1);
        Animal animal5 = new Animal("Leer", "Leer",dornbirn.searchFoodByName("-"), 0);

        AnimalKeeper karl = new AnimalKeeper(dornbirn, "Karl");
        AnimalKeeper gudrun = new AnimalKeeper(dornbirn, "Gudrun");
        AnimalKeeper franz = new AnimalKeeper(dornbirn, "Franz");
        AnimalKeeper helga = new AnimalKeeper(dornbirn, "Helga");

        Veterian dr1 = new Veterian("Dr. Dolittle");
        Veterian dr2 = new Veterian("Dr. Dexter");
        Veterian dr3 = new Veterian("Dr. Daniella");


        AnimalArea area = new AnimalArea("Alpenwiese");
        area.addAnimal(animalCow);
        animalCow.addHealthAndBite(80,18);
        area.addAnimal(animalCow1);
        animalCow1.addHealthAndBite(80,11);
        area.addAnimal(animalCow2);
        animalCow2.addHealthAndBite(80,25);
        AnimalArea area1 = new AnimalArea("Ried");
        area1.addAnimal(animal2);
        animal2.addHealthAndBite(80,23);
        area1.addAnimal(animal3);
        animal3.addHealthAndBite(80,20);
        area1.addAnimal(animal4);
        animal4.addHealthAndBite(80,12);
        AnimalArea area2 = new AnimalArea("Terrarium (warm)");
        area2.addAnimal(animal5);
        animal5.addHealthAndBite(0,0);
        dornbirn.addArea(area);
        dornbirn.addArea(area1);
        dornbirn.addArea(area2);

        dornbirn.addKeeper(karl);
        dornbirn.addKeeper(gudrun);
        dornbirn.addKeeper(franz);
        dornbirn.addKeeper(helga);


        karl.addArea(area);
        gudrun.addArea(area);
        franz.addArea(area1);
        helga.addArea(area1);
        gudrun.addArea(area1);

        area.setLastDayHasCleared(0);
        area1.setLastDayHasCleared(1);
        area2.setLastDayHasCleared(1);

        dornbirn.addVeterian(dr1);
        dornbirn.addVeterian(dr2);
        dornbirn.addVeterian(dr3);


        dornbirn.takeCareOfZooAreas();
        karl.viewAnimalInArea(area);

        Feed heu = dornbirn.searchFoodByName("Heu");
        heu.setUnit("Kg");
        heu.setUnitPrice(3);
        Feed frosch = dornbirn.searchFoodByName("Frosch");
        frosch.setUnit("Stück");
        frosch.setUnitPrice(25);

        dornbirn.printStructure();

        for (int day = 1; day <= 5; day++) {
            dornbirn.simulate(day);

        }
        System.out.println(dornbirn);


//        System.out.println(dornbirn.toString("│──"));


    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
}