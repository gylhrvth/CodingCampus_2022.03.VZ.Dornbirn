package philipp.week07.zoo;

import java.util.List;
import java.util.Vector;

public class AnimalKeeper {


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

    public void printListAreasToWork() {
        int currentDay = 0;
        for (AnimalArea animalArea : areasToWork) {
            System.out.print(animalArea + ": ");
            if (animalArea.clearArea(currentDay)) {
                printWorksDoing(animalArea);
            }
        }
    }

    public void printWorksDoing(AnimalArea animalArea) {
        animalArea.feedAnimals(animalArea);
        animalArea.randomAnimalOfArea(animalArea);
    }


}
