package philipp.week07.zoo;

import java.util.List;
import java.util.Vector;

public class Zoo {
    private String name;
    private int yearOfEstablishment;
    private Vector<AnimalArea> animalArea;
    private List<AnimalKeeper> animalKeepers = new Vector<>();

    public Zoo(String name, int yearOfEstablishment) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        animalArea = new Vector<>();
    }

    @Override
    public String toString() {
        return "Zoo: " + name + ", established " + yearOfEstablishment
                + "\n" + "Animal area: \n" + animalArea;
    }

    public AnimalArea addArea(AnimalArea a) {
        animalArea.add(a);
        return a;
    }

    public AnimalKeeper addKeeper(AnimalKeeper ak) {
        animalKeepers.add(ak);
        return ak;
    }

    public void removeArea(AnimalArea area) {
        animalArea.remove(area);
    }

    public void printZoo() {
        System.out.print("├── ");
        System.out.println("Zoo: " + name + ", established " + yearOfEstablishment);
        for (AnimalArea a : animalArea) {
            System.out.print("│ " + " ".repeat(4));
            System.out.print("├── ");
            System.out.println("Animal Area: " + a);
            a.printAnimalArea();
        }
    }

    public void cleanZooAreas() {
        for (AnimalKeeper animalKeeper : animalKeepers) {
            System.out.println(animalKeeper.getName()+": ");
            animalKeeper.printListAreasToWork();
            System.out.println();
        }

        System.out.println();
    }
}






