package aron.week07.zoosim;

public class MainZoo {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Schlange","Koenigs Python",6);
        Animal animal2 = new Animal("Kamel","Vikunja",2);
        Animal animal3 = new Animal("Pinguin","Koenigs Pinguin",4);
        Animal animal4 = new Animal("Elefant","Afrikanische Elefant",2);
        Animal animal5 = new Animal("Tiger","Sibirischer Tiger",1);
        Animal animal6 = new Animal("Wolf","Schwarzer Wolf",5);

        Areasize areasize1 = new Areasize("Big Area",100,100);
        Areasize areasize2 = new Areasize("Medium area",50,50);
        Areasize areasize3 = new Areasize("small Area",25,25);
        Areasize areasize4 = new Areasize("Terrarium Area",2,1);


        Enclosure enclosure1 = new Enclosure("Antarktis",ClimateZone.POLAR_ZONE,areasize3,animal3);
        Enclosure enclosure2 = new Enclosure("Steppe",ClimateZone.SUBPOLAR_ZONE,areasize2,animal5);
        Enclosure enclosure3 = new Enclosure("Wald",ClimateZone.GEMAESSIGTE_ZONE,areasize1,animal6);
        Enclosure enclosure4 = new Enclosure("Wueste",ClimateZone.SUBTROPISCHE_ZONE,areasize3,animal2 );
        Enclosure enclosure5 = new Enclosure("Savane",ClimateZone.SUBTROPISCHE_ZONE,areasize2,animal4);
        Enclosure enclosure6 = new Enclosure("Regenwald",ClimateZone.TROPISCHE_ZONE,areasize4,animal1);

        Zoo jinba = new Zoo("Jinba","04.06.1980",enclosure1);

        System.out.println(jinba);


        }
    }


