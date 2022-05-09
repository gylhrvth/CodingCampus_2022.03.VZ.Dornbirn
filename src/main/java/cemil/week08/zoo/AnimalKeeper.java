package cemil.week08.zoo;



import java.util.List;
import java.util.Random;
import java.util.Vector;

public class AnimalKeeper {
    Random rn = new Random();

    private String name;
    private List<AnimalArea> areasToWork;

    public AnimalKeeper(String name) {
        this.name = name;
        areasToWork = new Vector<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AnimalKeeper: " + name + areasToWork;
    }

    public AnimalArea addArea(AnimalArea aa) {
        areasToWork.add(aa);
        return aa;
    }

    public List<AnimalArea> getAreasToWork() {
        return areasToWork;
    }

    public void printListAreasWork() {
        int currentDay = 0;
        for (AnimalArea animalArea : areasToWork) {
            System.out.print(animalArea + ": ");
            animalArea.clearArea(currentDay);
        }

    }

    public void viewAnimalInArea(AnimalArea aa) {
        System.out.println(aa.getAnimals());
//        int rnIndex = rn.nextInt(aa.getAnimals().size());
//        for (int i = 0; i < aa.getAnimals().size(); i++) {
//            if (rnIndex == i) {
//                System.out.println(aa.getAnimals().get(i));
//            }
//        }
        System.out.println();
        System.out.println(aa.getAnimals().get(rn.nextInt(aa.getAnimals().size())));
    }


}
