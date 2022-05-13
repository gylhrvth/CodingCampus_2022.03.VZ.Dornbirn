package zah.week07.zoo;

public class MainZoo {
    public static void main(String[] args) {
        Zoo z = new Zoo("ZooTime", 1986);


        Enclosure alpemwiese = new Enclosure(z, "Alpenwiese");
        Enclosure ried = new Enclosure(z, "Ried");
        Enclosure terarrium =  new Enclosure(z,"Terrarium (warm)");

        alpemwiese.addAnimal("Rijska", "Kuh", z.searchFoodByName("Heu"), 20,80,100,10);
        alpemwiese.addAnimal("Ilka", "Kuh", z.searchFoodByName("Heu"), 20,90,100,5);
        alpemwiese.addAnimal("Milka", "Kuh", z.searchFoodByName("Heu"), 20,100,100,20);
        ried.addAnimal("Garmond", "Storh", z.searchFoodByName("Frosch"), 1,80,100,10);
        ried.addAnimal("Hugo", "Storh", z.searchFoodByName("Frosch"), 1,80,100,10);
        ried.addAnimal("Idaxis", "Storh", z.searchFoodByName("Frosch"), 1,80,100,10);
        terarrium.addAnimal("Klaus", "Spinne", z.searchFoodByName("Frosch"), 2,80,100,10);
        terarrium.addAnimal("Maus", "Spinne", z.searchFoodByName("Frosch"), 2,80,100,10);

//        Animal rijcka =new Animal("Rijka","Kuh",z.searchFoodByName("Heu"),20,80,100,10);
//        Animal illka =new Animal("Ilka","Kuh",z.searchFoodByName("Heu"),20,90,100,7);
//        Animal milka =new Animal("Milka","Kuh",z.searchFoodByName("Heu"),20,75,100,6);
//
//
//        Animal garmond =new Animal("Garmond","Stroh",z.searchFoodByName("Frosh"),20,75,100,6);
//        Animal hugo =new Animal("Hugo","Stroh",z.searchFoodByName("Frosh"),20,75,100,6);
//        Animal idaxis =new Animal("Idaxis","Stroh",z.searchFoodByName("Frosh"),20,75,100,6);
//        Animal matrix =new Animal("Matrix","Stroh",z.searchFoodByName("Frosh"),20,75,100,6);
//
//        Animal klaus = new Animal("Klaus","Spinne",z.searchFoodByName("Frosh"),20,75,100,6);
//        Animal maus =new Animal("Maus","Spinne",z.searchFoodByName("Frosh"),20,75,100,6);






//
//        Animal rijska = new Animal("Rijka","Kuh",z.searchFoodByName("Heu"),80, 80,100,3);
//        Animal garmond = new Animal("Garmon","Kuh",z.searchFoodByName("Heu"),80, 80,100,3);
//        rijska.bites(garmond);

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
