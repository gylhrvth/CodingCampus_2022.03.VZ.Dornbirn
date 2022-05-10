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

        karl.addFavoriteAnimal(cow2);
        gudrun.addFavoriteAnimal(cow3);
        franz.addFavoriteAnimal(stork1);
        helga.addFavoriteAnimal(cow1);

        alpenwiese.setLastDayHasBeenCleared(1);
        ried.setLastDayHasBeenCleared(1);
        terrariumWarm.setLastDayHasBeenCleared(1);

        cow1.addHealthMaxHealthBite(100, 100, 30);
        cow2.addHealthMaxHealthBite(99, 99, 30);
        cow3.addHealthMaxHealthBite(70, 70, 30);
        stork1.addHealthMaxHealthBite(20, 80, 20);
        stork2.addHealthMaxHealthBite(60, 60, 20);
        stork3.addHealthMaxHealthBite(70, 70, 20);

        Feed straw = new Feed("Straw", "kg", 5.72f);
        Feed birdFood = new Feed("Birdfood", "g", 0.2f);
        cow1.addFeed(straw, 14.4f);
        cow2.addFeed(straw, 15.0f);
        cow3.addFeed(straw, 18.2f);
        stork1.addFeed(birdFood, 456.77f);
        stork2.addFeed(birdFood, 333.33f);
        stork3.addFeed(birdFood, 279.34f);

        dornbirn.addFeed(straw);
        dornbirn.addFeed(birdFood);

        AnimalDoctor doLittle = new AnimalDoctor("Dr. Dolittle");
        AnimalDoctor tim = new AnimalDoctor("Dr. Tim");
        AnimalDoctor simone = new AnimalDoctor("Dra. Simone");

        dornbirn.addDoctor(doLittle);
        dornbirn.addDoctor(tim);
        dornbirn.addDoctor(simone);

        dornbirn.printZoo();
        System.out.println();
        dornbirn.takeCareOfZooAreas();

        dornbirn.requiredFoodCost();

        dornbirn.healingAnimals();

    }
}
