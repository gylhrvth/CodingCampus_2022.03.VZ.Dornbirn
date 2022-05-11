package gyula.week08.zoo;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tierpark Feldkirch", 1995);
//        Enclosure encWald = new Enclosure(zoo, "Wald 1");
//        Enclosure encWiese = new Enclosure(zoo, "Wiese 1");
//        Enclosure encAquarium = new Enclosure(zoo, "Aquarium (kalt)");

        new Animal(zoo, "Wald 1", "Rudolf", "Deer", 100, 40);
        new Animal(zoo, "Wald 1", "Renate", "Deer", 80, 20);
        new Animal(zoo, "Wald 1", "Robert", "Deer", 75, 5);

        new Animal(zoo, "Aquarium (warm)", "Nemo", "Guppy", 10, 1, 70);
        new Animal(zoo, "Aquarium (warm)", "Nimrod", "Guppy", 10, 2, 70);
        new Animal(zoo, "Aquarium (warm)", "Noemi", "Guppy", 10, 1, 70);
        new Animal(zoo, "Aquarium (warm)", "Norbert", "Guppy", 10, 2, 70);
        new Animal(zoo, "Aquarium (warm)", "November", "Guppy", 10, 1, 70);
        new Animal(zoo, "Aquarium (warm)", "Neutron", "Guppy", 10, 2, 70);
        new Animal(zoo, "Aquarium (warm)", "Neptun", "Guppy", 10, 5, 70);
        new Animal(zoo, "Aquarium (warm)", "Nero", "Guppy", 10, 2, 70);

        AnimalCarer peter = new AnimalCarer(zoo, "Peter");
        peter.addTaskToDailyTasks("Wald 1");
        peter.addTaskToDailyTasks("Aquarium (kalt)");

        AnimalCarer paul = new AnimalCarer(zoo, "Paul");
        paul.addTaskToDailyTasks("Aquarium (kalt)");
        paul.addTaskToDailyTasks("Aquarium (warm)");

        new Veterinarian(zoo, "Dr. Dolittle");
        new Veterinarian(zoo, "Dr. Dexter");
        new Veterinarian(zoo, "Dr. Daniella");

        zoo.printStructure();
        System.out.println();
        for (int tag = 1; tag <= 10; tag++) {
            System.out.println("Start Tag " + tag);
            zoo.simulate(tag);
        }

    }
}
