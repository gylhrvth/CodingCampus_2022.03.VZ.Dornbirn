package timo.week07.TimosZoo;

public class Main {
    public static void main(String[] args) {

        Zoo z = new Zoo("Timokants Zoo", 1998);

        Enclosure aqua = z.addEnclosure("Aquarium");
        Enclosure terra = z.addEnclosure("Terrarium");
        Enclosure arc = z.addEnclosure("Arctic");

        Food meat = new Food("Meat", "kg", 2);
        Food plankton = new Food("Plankton", "g", 20);
        Food mouse = new Food("Mouse", "unit/s", 10);
        Food fish = new Food("Fish", "kg", 20);

        Animal shark = aqua.addAnimal("Boris", "Shark", meat, 30, 250, 150, 75);
        Animal jellyfish = aqua.addAnimal("Matilda", "Jellyfish", plankton, 10, 50, 0, 0);
        Animal snake = terra.addAnimal("Salvador", "Snake", mouse, 1, 120, 90, 70);
        Animal croc = terra.addAnimal("Sobek", "Crocodile", meat, 50, 200, 240, 65);
        Animal penguin = arc.addAnimal("Cody", "Penguin", fish, 1, 60, 15, 5);
        Animal polarbear = arc.addAnimal("Stanislaus", "Polarbear", fish, 3, 300, 130, 65);
        Animal sealion = arc.addAnimal("Sergej", "Sea Lion", fish, 5, 500, 90, 50);

        aqua.setLastDayCleaned(1);
        terra.setLastDayCleaned(1);
        arc.setLastDayCleaned(1);

        Zookeeper bono = new Zookeeper("Bono", shark);
        z.addZookeeper(bono);
        bono.addEnclosure2Clean(terra);

        Zookeeper razhvan = new Zookeeper("Razhvan", sealion);
        z.addZookeeper(razhvan);
        razhvan.addEnclosure2Clean(aqua);
        razhvan.addEnclosure2Clean(arc);

        Zookeeper cemil = new Zookeeper("Cemil", snake);
        z.addZookeeper(cemil);
        cemil.addEnclosure2Clean(terra);


        new Veterinarian(z, "Dr. Doppler");
        new Veterinarian(z, "Dr. Dragunov");
        new Veterinarian(z, "Dr. Feynmann");


        System.out.println(z.toString("├──"));

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("================== DAY " + i + " ==================");
            z.simulate();
            aqua.setLastDayCleaned(1);
            terra.setLastDayCleaned(1);
            arc.setLastDayCleaned(1);
        }


    }
}
