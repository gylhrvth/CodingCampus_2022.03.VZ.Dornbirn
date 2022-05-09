package aron.week07.zoosim;

public class MainZoo {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Schlange","Koenigs Python");
        Animal animal2 = new Animal("Kamel","Vikunja");
        Animal animal3 = new Animal("Pinguin","Koenigs Pinguin");
        Animal animal4 = new Animal("Elefant","Afrikanische Elefant");
        Animal animal5 = new Animal("Tiger","Sibirischer Tiger");
        Animal animal6 = new Animal("Wolf","Schwarzer Wolf");

        Areasize areasize1 = new Areasize("Big Area",100,100);
        Areasize areasize2 = new Areasize("Medium area",50,50);
        Areasize areasize3 = new Areasize("small Area",25,25);
        Areasize areasize4 = new Areasize("Terrarium Area",2,1);

        Enclosure enclosure1 = new Enclosure("Antarktis",ClimateZone.POLAR_ZONE,areasize3, animal3);
        Enclosure enclosure2 = new Enclosure("Steppe",ClimateZone.SUBPOLAR_ZONE,areasize2,animal5);
        Enclosure enclosure3 = new Enclosure("Wald",ClimateZone.GEMAESSIGTE_ZONE,areasize1,animal6);
        Enclosure enclosure4 = new Enclosure("Wueste",ClimateZone.SUBTROPISCHE_ZONE,areasize3,animal2);
        Enclosure enclosure5 = new Enclosure("Savane",ClimateZone.SUBTROPISCHE_ZONE,areasize2,animal4);
        Enclosure enclosure6 = new Enclosure("Regenwald",ClimateZone.TROPISCHE_ZONE,areasize4,animal1);




        Nurse nurse1 = new Nurse(ANSI_RED+"Guenter"+ANSI_RESET+"\n");
        nurse1.addEnclosure(enclosure1);
        nurse1.addEnclosure(enclosure2);
        Nurse nurse2 = new Nurse(ANSI_RED+"Klaus"+ANSI_RESET+"\n");
        nurse2.addEnclosure(enclosure4);
        nurse2.addEnclosure(enclosure5);
        Nurse nurse3 = new Nurse(ANSI_RED+"Berta"+ANSI_RESET+"\n");
        nurse3.addEnclosure(enclosure3);
        nurse3.addEnclosure(enclosure6);


        Zoo jinba = new Zoo(ANSI_RED+"Jinba"+ANSI_RESET,ANSI_RED+"04.06.1980"+ANSI_RESET+"\n");
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

        System.out.println(jinba);
        System.out.println("============================");
        System.out.println(nurse1);
        System.out.println("============================");
        System.out.println(nurse2);
        System.out.println("============================");
        System.out.println(nurse3);


        }
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    }


