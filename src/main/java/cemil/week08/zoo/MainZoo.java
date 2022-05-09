package cemil.week08.zoo;


public class MainZoo {
    public static void main(String[] args) {
        Zoo dornbirn = new Zoo("Tiergarten Dornbirn", 2022);

        Animal animalCow = new Animal("Rijska", "Kuh");
        Animal animalCow1 = new Animal("Liselotte", "Kuh");
        Animal animalCow2 = new Animal("Milka", "Kuh");
        Animal animal2 = new Animal("Germond", "Storh");
        Animal animal3 = new Animal("Hugo", "Storh");
        Animal animal4 = new Animal("Idaxis", "Storh");
        Animal animal5 = new Animal("Leer", "Leer");

        AnimalKeeper karl = new AnimalKeeper("Karl");
        AnimalKeeper gudrun = new AnimalKeeper("Gudrun");
        AnimalKeeper franz = new AnimalKeeper("Franz");
        AnimalKeeper helga = new AnimalKeeper("Helga");

        AnimalArea area = new AnimalArea("Alpenwiese");
        area.addAnimal(animalCow);
        area.addAnimal(animalCow1);
        area.addAnimal(animalCow2);
        AnimalArea area1 = new AnimalArea("Ried");
        area1.addAnimal(animal2);
        area1.addAnimal(animal3);
        area1.addAnimal(animal4);
        AnimalArea area2 = new AnimalArea("Terrarium (warm)");
        area2.addAnimal(animal5);
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

        area.setLastDayHasCleared(1);
        area1.setLastDayHasCleared(1);
        area2.setLastDayHasCleared(1);


        dornbirn.takeCareOfZooAreas();


//        System.out.println(dornbirn.toString("│──"));


    }
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
}