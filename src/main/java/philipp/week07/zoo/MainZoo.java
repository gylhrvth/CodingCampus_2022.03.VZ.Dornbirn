package philipp.week07.zoo;

public class MainZoo {
    public static void main(String[] args) {
        Zoo dornbirn = new Zoo("Tiergarten Dornbirn", 2022);
        AnimalArea Alpenwiese = new AnimalArea("Alpenwiese");

        dornbirn.addArea(Alpenwiese.getName());
        dornbirn.addArea("Ried");
        dornbirn.addArea("Terrarium (warm)");

        System.out.println(dornbirn);
        dornbirn.removeArea(Alpenwiese);
        System.out.println(dornbirn);
    }
}
