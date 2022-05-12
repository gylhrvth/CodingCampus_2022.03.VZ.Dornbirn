package sergej.week07.zoo;


public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tierpark Feldkirch", 1995);
//


        AnimalCarer peter = new AnimalCarer(zoo, "Peter");
        peter.addTaskToDailyTasks("Wald 1");
        peter.addTaskToDailyTasks("Aquarium (kalt)");

        AnimalCarer paul = new AnimalCarer(zoo, "Paul");
        paul.addTaskToDailyTasks("Aquarium (kalt)");
        paul.addTaskToDailyTasks("Aquarium (warm)");

        Food canWorms = new Food("Worms", "Can", 5, 2);
        Food bushWheat = new Food("Wheat", "Bushel", 2, 3);
        Food bushGrass = new Food("Grass", "Bushel", 1, 2);
        Food bushGrass2 = new Food("Grass", "Bushel", 1, 3);

        Animal a1 = new Animal(zoo, bushWheat, "Wald 1", "Rudolf", "Deer", "Grass", "Bushel", 2, 50, 5, 40);
        Animal a2 = new Animal(zoo, bushGrass, "Wald 1", "Renate", "Deer", "Wheat", "Bushel", 3, 50, 5, 40);
        Animal a3 = new Animal(zoo, bushGrass, "Wald 1", "Robert", "Deer", "Grass", "Bushel", 2, 80, 10, 40);

        Animal guppy1 = new Animal(zoo, canWorms, "Aquarium (warm)", "Nemo", "Guppy", "Worms", "Can", 1, 10, 5, 40);
        Animal guppy2 = new Animal(zoo, canWorms, "Aquarium (warm)", "Nimrod", "Guppy", "FishFood", "Bucket", 1, 10, 5, 40);
        Animal guppy3 = new Animal(zoo, canWorms, "Aquarium (warm)", "Noemi", "Guppy", "Worms", "Can", 2, 10, 5, 40);


        zoo.addFood(canWorms);
        zoo.addFood(bushWheat);
        zoo.addFood(bushGrass);
        zoo.addFood(bushGrass2);


        zoo.printStructure();
        System.out.println();


        for (int tag = 1; tag <= 5; tag++) {
            System.out.println("Start Tag " + tag);
            zoo.simulate(tag);
        }

        guppy1.eatFood();


    }
}
