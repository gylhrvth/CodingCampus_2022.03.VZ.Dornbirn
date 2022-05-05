package murat.week7.day3.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo darica = new Zoo("Darica HB", "Istanbul", 1993);

        Animal cow = new Animal("Rijska", "Mammal");
        Animal stork1 = new Animal("Garmond", "Bird");
        Animal stork2 = new Animal("Hugo", "Bird");
        Animal stork3 = new Animal("Idaxis", "Bird");

        Enclosure habAlpine = new Enclosure(cow, "Alpine Meadow");
        Enclosure reed = new Enclosure(stork1, "Reed");
        reed.addAnimal(stork2);
        reed.addAnimal(stork3);
        Enclosure terr = new Enclosure(null, "Terrarium");


        darica.addEnclosure(habAlpine);
        darica.addEnclosure(reed);
        darica.addEnclosure(terr);

        System.out.println(darica);
    }
}
