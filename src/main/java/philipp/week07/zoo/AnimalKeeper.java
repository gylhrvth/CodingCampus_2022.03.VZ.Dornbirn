package philipp.week07.zoo;

import java.util.List;
import java.util.Vector;

public class AnimalKeeper {


    private String name;
    private List<AnimalArea> areasToWork;
    private Animal favoriteAnimal;


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

    public Animal addFavoriteAnimal(Animal a) {
        this.favoriteAnimal = a;
        return favoriteAnimal;
    }

    public List<AnimalArea> getAreasToWork() {
        return areasToWork;
    }

    public void printListAreasToWork(int currentDay) {
        for (AnimalArea animalArea : areasToWork) {
            System.out.print(animalArea + ": ");
            if (animalArea.clearArea(currentDay)) {
                printWorksDoing(animalArea);
            }
        }
    }

    public void printWorksDoing(AnimalArea animalArea) {
        animalArea.feedAnimals();
        System.out.println();
        animalArea.randomAnimalOfArea();
        admiringAnimal(animalArea);
//        System.out.println();
    }

    public void admiringAnimal(AnimalArea aa) {
        if (aa.getAnimals().contains(favoriteAnimal)) {
            System.out.println("Admiring my favorite Animal: " + favoriteAnimal.getName());
        } else {
            System.out.println("My favorite Animal is " + favoriteAnimal.getName() + ".\n"
                    + "But unfortunately it is not in this Animal area.");
        }
    }
}
