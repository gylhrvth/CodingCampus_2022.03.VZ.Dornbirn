package timo.week07.TimosZoo;

public class Main {
    public static void main(String[] args) {

        Zoo z = new Zoo("Timokants Zoo", 1998);

        Enclosure aqua = z.addEnclosure("Aquarium");
        Enclosure terra = z.addEnclosure("Terrarium");
        Enclosure arc = z.addEnclosure("Arctic");

        Animal shark = aqua.addAnimal("Boris", "Shark");
        Animal jellyfish = aqua.addAnimal("Matilda", "Jellyfish");
        Animal snake = terra.addAnimal("Salvador", "Snake");
        Animal penguin = arc.addAnimal("Cody", "Penguin");
        Animal polarbear = arc.addAnimal("Stanislaus", "Polarbear");
        Animal sealion = arc.addAnimal("Sergej", "Sea Lion");
        // z.removeEnclosure(aqua);
        // arc.removeAnimal(sealion);

        Zookeeper bono = new Zookeeper("Bono");
        z.addZookeeper(bono);
        bono.addEnclosure2Clean(aqua);

        Zookeeper kenji = new Zookeeper("Kenji");
        z.addZookeeper(kenji);
        kenji.addEnclosure2Clean(terra);


        aqua.setLastDayCleaned(0);
        aqua.cleanEnclosure(1);

        System.out.println(z.toString("├──"));


        z.cleanZooEnclosures();






    }
}
