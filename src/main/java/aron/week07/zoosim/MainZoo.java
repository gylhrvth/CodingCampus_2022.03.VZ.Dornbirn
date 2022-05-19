package aron.week07.zoosim;


public class MainZoo {

    public static void main(String[] args) {

        Food food1 = new Food("Fleisch",5,20);
        Food food2 = new Food("Ratte",1,10);
        Food food3 = new Food("Fisch",5,20);
        Food food4 = new Food("Stroh",30,5);
        Food food5 = new Food("Fleisch",10,30);
        Food food6= new Food("Stroh",60,20);

        Animal animal1 = new Animal("Schlange", "Koenigs Python",food2,1);
        Animal animal2 = new Animal("Kamel", "Vikunja",food4,40);
        Animal animal3 = new Animal("Pinguin", "Koenigs Pinguin",food3,5);
        Animal animal4 = new Animal("Elefant", "Afrikanische Elefant",food6,700);
        Animal animal5 = new Animal("Tiger", "Sibirischer Tiger",food5,10);
        Animal animal6 = new Animal("Wolf", "Schwarzer Wolf",food1,5);

        Areasize areasize1 = new Areasize("Big Area", 100, 100);
        Areasize areasize2 = new Areasize("Medium area", 50, 50);
        Areasize areasize3 = new Areasize("small Area", 25, 25);
        Areasize areasize4 = new Areasize("Terrarium Area", 2, 1);

        Enclosure enclosure1 = new Enclosure("Antarktis", ClimateZone.POLAR_ZONE, areasize3);
        Enclosure enclosure2 = new Enclosure("Steppe", ClimateZone.SUBPOLAR_ZONE, areasize2);
        Enclosure enclosure3 = new Enclosure("Wald", ClimateZone.GEMAESSIGTE_ZONE, areasize1);
        Enclosure enclosure4 = new Enclosure("Wueste", ClimateZone.SUBTROPISCHE_ZONE, areasize3);
        Enclosure enclosure5 = new Enclosure("Savane", ClimateZone.SUBTROPISCHE_ZONE, areasize2);
        Enclosure enclosure6 = new Enclosure("Regenwald", ClimateZone.TROPISCHE_ZONE, areasize4);


        Zoo jinba = new Zoo(ANSI_RED + "Jinba" + ANSI_RESET, ANSI_RED + "04.06.1980" + ANSI_RESET);
        jinba.addEnclosure(enclosure1);
        jinba.addEnclosure(enclosure2);
        jinba.addEnclosure(enclosure3);
        jinba.addEnclosure(enclosure4);
        jinba.addEnclosure(enclosure5);
        jinba.addEnclosure(enclosure6);

        enclosure1.addAnimal(animal3);
        enclosure2.addAnimal(animal5);
        enclosure3.addAnimal(animal6);
        enclosure4.addAnimal(animal2);
        enclosure5.addAnimal(animal4);
        enclosure6.addAnimal(animal1);

        Nurse nurse1 = new Nurse(jinba, "Günter");
        nurse1.addEnclosure(enclosure1);
        nurse1.addEnclosure(enclosure2);
        Nurse nurse2 = new Nurse(jinba, "Klaus");
        nurse2.addEnclosure(enclosure4);
        nurse2.addEnclosure(enclosure5);
        Nurse nurse3 = new Nurse(jinba, "Berta");
        nurse3.addEnclosure(enclosure3);
        nurse3.addEnclosure(enclosure6);


        System.out.println(jinba);
        System.out.println("============================");
        System.out.println(nurse1);
        System.out.println("============================");
        System.out.println(nurse2);
        System.out.println("============================");
        System.out.println(nurse3);

        for (int day = 1; day <= 5; day++) {
            System.out.println("Start Tag " + day);
            jinba.simulate(day);
        }
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}


