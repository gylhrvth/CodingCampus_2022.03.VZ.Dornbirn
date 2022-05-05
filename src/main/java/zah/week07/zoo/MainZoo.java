package zah.week07.zoo;

public class MainZoo {
    public static void main(String[] args) {
        Zoo z = new Zoo("ZooTime",1986);


        Enclosure aqarium=z.addEnclosure("Aquarium");
        Enclosure terrarium=z.addEnclosure("Terrarium");
        Enclosure mankyEclosure=z.addEnclosure("MankyEclosure");

        aqarium.addAnimal("Sergej","Forelle");
        aqarium.addAnimal("Jhon", "Delfin");
        terrarium.addAnimal("Jan","Crocodile");
        mankyEclosure.addAnimal("Timo","Horse");



        System.out.println(z);




    }
}
