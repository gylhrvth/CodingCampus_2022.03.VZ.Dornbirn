package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Carer {

    private String name;

    private Zoo zoo;

    private List<Enclosure> assignedEnclosures = new Vector<>();

    private Animal bestBuddy;

    public Carer(Zoo zoo, String name, Animal bestBuddy) {

        this.name = name;
        this.zoo = zoo;
        this.bestBuddy = bestBuddy;
    }

    public String getName() {

        return name;
    }

    public Zoo getZoo() {

        return zoo;
    }

    public List<Enclosure> getAssignedEnclosures() {

        return assignedEnclosures;
    }

    public String toString(String indention) {

        String out = indention + name;
        for (Enclosure enc : assignedEnclosures) {
            out += "\n\t\t ├──" + enc.toString(indention);
        }
        return out;
    }

    @Override
    public String toString() {

        return name;
    }

    public Enclosure addTask(String nameOfEnclosure) {

        Enclosure en = zoo.searchEnclosureByName(nameOfEnclosure);
        assignedEnclosures.add(en);
        return en;
    }

    public void feedAnimals(Animal anAnimal) {

        System.out.println(Zoo.ANSI_GREEN + this + " feeds " + anAnimal + Zoo.ANSI_RESET);
    }

    public void comingToEnclosure(Enclosure anEnclosure) {

        System.out.println(Zoo.ANSI_BLUE + this + " is today at " + anEnclosure + Zoo.ANSI_RESET);
    }

    public void observeAnAnimal(List<Animal> animalList) {

        Random random = new Random();
        if (animalList.size() != 0) {
            int randomNumber = random.nextInt(animalList.size());
            System.out.println(Zoo.ANSI_CYAN + this + " observes " + animalList.get(randomNumber) + Zoo.ANSI_RESET);
        } else {
            System.out.println("There is no animal to take care of.");
        }
    }

    public void giveAnAnimalAReward(List<Animal> animalList) {

        if (animalList.size() != 0) {
            System.out.println(Zoo.ANSI_RED + this + " gives a reward to " + bestBuddy + Zoo.ANSI_RESET + "\n");
        } else {
            System.out.println("There is no animal to take care of.");
        }
    }

    public Enclosure findASuitableEnclosureForCarer(List<Enclosure> assignedEnclosures) {

        Enclosure aNotCaredEnclosure;

        for (Enclosure enc : assignedEnclosures) {

            // If the enclosure has no carer
            if (!enc.getCared()) {

                aNotCaredEnclosure = enc;
                return aNotCaredEnclosure;
            }
        }
        return null;
    }

    public void simulation01() {

        Enclosure encNeedsCaring = findASuitableEnclosureForCarer(assignedEnclosures);

        if (encNeedsCaring != null) {
            comingToEnclosure(encNeedsCaring);
            encNeedsCaring.setCaredOrNot(true);

            for (int j = 0; j < encNeedsCaring.getAnimals().size(); j++) {
                feedAnimals(encNeedsCaring.getAnimals().get(j));
            }

            observeAnAnimal(encNeedsCaring.getAnimals());
            giveAnAnimalAReward(encNeedsCaring.getAnimals());

        } else {
            System.out.println(name + " has nothing to do");
        }
    }
}
