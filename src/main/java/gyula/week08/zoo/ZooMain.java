package gyula.week08.zoo;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tierpark Feldkirch", 1995);
//        Enclosure encWald = new Enclosure(zoo, "Wald 1");
//        Enclosure encWiese = new Enclosure(zoo, "Wiese 1");
//        Enclosure encAquarium = new Enclosure(zoo, "Aquarium (kalt)");

        Animal a1 = new Animal(zoo, "Wald 1", "Rudolf", "Deer");
        Animal a2 = new Animal(zoo, "Wald 1", "Renate", "Deer");
        Animal a3 = new Animal(zoo, "Wald 1", "Robert", "Deer");

        Animal guppy1 = new Animal(zoo, "Aquarium (warm)", "Nemo", "Guppy");
        Animal guppy2 = new Animal(zoo, "Aquarium (warm)", "Nimrod", "Guppy");
        Animal guppy3 = new Animal(zoo, "Aquarium (warm)", "Noemi", "Guppy");
        Animal guppy4 = new Animal(zoo, "Aquarium (warm)", "Norbert", "Guppy");

        AnimalCarer peter = new AnimalCarer(zoo, "Peter");
        peter.addTaskToDailyTasks("Wald 1");
        peter.addTaskToDailyTasks("Aquarium (kalt)");

        AnimalCarer paul = new AnimalCarer(zoo, "Paul");
        paul.addTaskToDailyTasks("Aquarium (kalt)");
        paul.addTaskToDailyTasks("Aquarium (warm)");


        zoo.printStructure();
        System.out.println();
        for (int tag = 1; tag <= 5; tag++) {
            System.out.println("Start Tag " + tag);
            zoo.simulate(tag);
        }

    }
}
