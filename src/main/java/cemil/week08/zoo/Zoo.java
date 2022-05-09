package cemil.week08.zoo;

import java.util.List;
import java.util.Vector;

public class Zoo {
    private String name;
    private int foundationDate;
    private List<AnimalArea> animalAreas = new Vector<>();
    private List<AnimalKeeper> animalKeepers = new Vector<>();

    public Zoo(String name, int yearOfEstablishment) {
        this.name = name;
        this.foundationDate = yearOfEstablishment;
    }


    public AnimalKeeper addKeeper(AnimalKeeper ak) {
        animalKeepers.add(ak);
        return ak;
    }

    public void addArea(AnimalArea area) {
        if (!animalAreas.contains(area)) {
            animalAreas.add(area);
        }
    }

    public void removeArea(AnimalArea area) {
        animalAreas.remove(area);
    }

    public void takeCareOfZooAreas() {
        for (AnimalKeeper animalKeeper : animalKeepers) {
            System.out.println(MainZoo.ANSI_GREEN + animalKeeper.getName() + ": " + MainZoo.ANSI_RESET);
            animalKeeper.printListAreasWork();
            System.out.println();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indentation) {
        String output = indentation + " ";
        output += name;
        output += ", founded in " + foundationDate + "\n";
        for (AnimalArea en : animalAreas) {
            output += "│" + "    " + en.toString(indentation + " ") + "\n";
        }
        return output;
    }
}
