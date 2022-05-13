package zah.week07.zoo;

public class MainZoo {
    public static void main(String[] args) {
        Zoo z = new Zoo("ZooTime", 1986);


        Enclosure alpemwiese = new Enclosure(z, "Alpenwiese");
        Enclosure ried = new Enclosure(z, "Ried");
        Enclosure terarrium = new Enclosure(z, "Terrarium (warm)");

        alpemwiese.addAnimal("Rijska", "Kuh", z.searchFoodByName("Heu"), 20, 80, 100, 10);
        alpemwiese.addAnimal("Ilka", "Kuh", z.searchFoodByName("Heu"), 20, 90, 100, 5);
        alpemwiese.addAnimal("Milka", "Kuh", z.searchFoodByName("Heu"), 20, 100, 100, 20);
        ried.addAnimal("Garmond", "Storh", z.searchFoodByName("Frosch"), 1, 80, 100, 10);
        ried.addAnimal("Hugo", "Storh", z.searchFoodByName("Frosch"), 1, 80, 100, 10);
        ried.addAnimal("Idaxis", "Storh", z.searchFoodByName("Frosch"), 1, 80, 100, 10);
        terarrium.addAnimal("Klaus", "Spinne", z.searchFoodByName("Frosch"), 2, 80, 100, 10);
        terarrium.addAnimal("Maus", "Spinne", z.searchFoodByName("Frosch"), 2, 80, 100, 10);

        new Veterinarian(z, "Dr Max");

        Nurse nPeter = z.addNurse("Peter");
        nPeter.addTask("Alpenwiese");
        Nurse nHans = z.addNurse("Hans");
        nHans.addTask("Ried");
        Nurse nFranz = z.addNurse("Franz");
        nFranz.addTask("Arctic");
        nFranz.addTask("Alpenwiese");
        nFranz.addTask("Ried");
        nFranz.addTask("Terrarium (warm)");

        Feed heu = z.searchFoodByName("Heu");
        heu.setUnit("kg");
        heu.setUnitPrice(3);
        Feed frosch = z.searchFoodByName("Frosch");
        frosch.setUnit("Stück");
        frosch.setUnitPrice(25);


        System.out.println(z);

        for (int day = 1; day <= 5; day++) {
            z.simulate(day);

        }
    }
}
