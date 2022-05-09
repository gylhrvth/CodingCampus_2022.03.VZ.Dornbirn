package zah.week07.zoo;

import java.util.Vector;

public class MainZoo {
    public static void main(String[] args) {
        Zoo z = new Zoo("ZooTime",1986);


        Enclosure alpemwiese=z.addEnclosure("Alpenwiese");
        Enclosure ried=z.addEnclosure("Ried");
        Enclosure terarrium=z.addEnclosure("Terrarium (warm)");

        alpemwiese.addAnimal("Rijska","Kuh");
        ried.addAnimal("Garmond","Storh");

        ried.addAnimal("Hugo","Storh");
        ried.addAnimal("Idaxis","Storh");
        terarrium.addAnimal("Klaus","Spinne");

        Nurse nPeter = z.addNurse("Peter");
        nPeter.addTask("Alpenwiese");
        Nurse nHans=z.addNurse("Hans");
        nHans.addTask("Ried");
        Nurse nFranz = z.addNurse("Franz");
        nFranz.addTask("Arctic");
        nFranz.addTask("Alpenwiese");
        nFranz.addTask("Ried");




        System.out.println(z);

        for (int day = 1; day <= 5; day++) {
            z.simulate(day);

        }
    }
}
