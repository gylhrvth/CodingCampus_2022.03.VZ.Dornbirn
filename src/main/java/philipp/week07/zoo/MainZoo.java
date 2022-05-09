package philipp.week07.zoo;

public class MainZoo {
    public static void main(String[] args) {
        Zoo dornbirn = new Zoo("Tiergarten Dornbirn", 2022);

        AnimalArea alpenwiese = new AnimalArea("Alpenwiese", 100);
        AnimalArea ried = new AnimalArea("Ried", 200);
        AnimalArea terrariumWarm = new AnimalArea("Terrarium (warm)", 100);

        Animal cow1 = new Animal("Rijska", "Kuh");
        Animal cow2 = new Animal("Liselotte", "Kuh");
        Animal cow3 = new Animal("Milka", "Kuh");
        Animal stork1 = new Animal("Garmond", "Storch");
        Animal stork2 = new Animal("Hugo", "Storch");
        Animal stork3 = new Animal("Idaxis", "Storch");

        AnimalKeeper karl = new AnimalKeeper("Karl");
        AnimalKeeper gudrun = new AnimalKeeper("Gudrun");
        AnimalKeeper franz = new AnimalKeeper("Franz");
        AnimalKeeper helga = new AnimalKeeper("Helga");

        dornbirn.addArea(alpenwiese);
        dornbirn.addArea(ried);
        dornbirn.addArea(terrariumWarm);

        dornbirn.addKeeper(karl);
        dornbirn.addKeeper(gudrun);
        dornbirn.addKeeper(franz);
        dornbirn.addKeeper(helga);

        alpenwiese.addAnimal(cow1);
        alpenwiese.addAnimal(cow2);
        alpenwiese.addAnimal(cow3);
        ried.addAnimal(stork1);
        ried.addAnimal(stork2);
        ried.addAnimal(stork3);

        karl.addArea(alpenwiese);
        gudrun.addArea(alpenwiese);
        gudrun.addArea(ried);
        franz.addArea(alpenwiese);
        helga.addArea(ried);

        alpenwiese.setLastDayHasBeenCleared(1);
        ried.setLastDayHasBeenCleared(1);
        terrariumWarm.setLastDayHasBeenCleared(1);

//        dornbirn.printZoo();

//        System.out.println();
//        dornbirn.cleanZooAreas();

        karl.viewAnimalInArea(alpenwiese);

    }



}
