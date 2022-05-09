package cemil.week08.zoo;


public class MainZoo {
    public static void main(String[] args) {
        Zoo dornbirn = new Zoo("Tiergarten Dornbirn", 2022);
        Animal animal = new Animal("Rijska", "Kuh");
        Animal animal2 = new Animal("Germond", "Storh");
        Animal animal3 = new Animal("Hugo", "Storh");
        Animal animal4 = new Animal("Idaxis", "Storh");
        Animal animal5 = new Animal("Leer","Leer");

        AnimalArea area = new AnimalArea("Alpenwiese");
        area.addAnimal(animal);
        AnimalArea area1 = new AnimalArea("Ried");
        area1.addAnimal(animal2);
        area1.addAnimal(animal3);
        area1.addAnimal(animal4);
        AnimalArea area2 = new AnimalArea("Terrarium (warm)");
        area2.addAnimal(animal5);
        dornbirn.addArea(area);
        dornbirn.addArea(area1);
        dornbirn.addArea(area2);


        System.out.println(dornbirn.toString("│──"));


    }
}