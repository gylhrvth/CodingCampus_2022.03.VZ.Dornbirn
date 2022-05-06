package murat.week7.day3.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo darica = new Zoo("Darica HB", "Istanbul", 1993);

        Enclosure habAlpine = darica.addEnclosure("Alpine Meadow");
        Enclosure reed = darica.addEnclosure("Reed");
        Enclosure terr = darica.addEnclosure("Terrarium");

        habAlpine.addAnimal("Rijska", "Mammal");
        reed.addAnimal("Garmond", "Bird");
        reed.addAnimal("Hugo", "Bird");
        reed.addAnimal("Idaxis", "Bird");

        terr.addAnimal(" ", " ");

        System.out.println(darica);
    }

}
