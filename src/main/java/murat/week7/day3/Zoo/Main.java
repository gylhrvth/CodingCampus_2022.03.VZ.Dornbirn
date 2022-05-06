package murat.week7.day3.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zooDarica = new Zoo("Darica HB", "Istanbul", 1993);

        Enclosure habAlpine = zooDarica.addEnclosure("Alpine Meadow");
        Enclosure reed = zooDarica.addEnclosure("Reed");
        Enclosure terr = zooDarica.addEnclosure("Terrarium");
        Enclosure grass = zooDarica.addEnclosure("Grassland");
        Enclosure des = zooDarica.addEnclosure("Desert");

        habAlpine.addAnimal("Rijska", "Cow");
        reed.addAnimal("Garmond", "Ostrich");
        reed.addAnimal("Hugo", "Eagle");
        reed.addAnimal("Idaxis", "Chicken");

        terr.addAnimal("Roony", "Rooster");
        grass.addAnimal("Biden", "Bison");
        des.addAnimal("Camela", "Camel");

        Carer nPeter = zooDarica.addCarer("Peter");
        Carer nTim = zooDarica.addCarer("Tim");
        nPeter.addTask("Terrarium");
        nTim.addTask("Reed");

        System.out.println(zooDarica);

    }

}
