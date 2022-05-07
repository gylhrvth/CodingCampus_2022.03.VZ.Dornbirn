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

    public static void feedAnimals(Carer aCarer, Animal anAnimal) {

        System.out.println(Zoo.ANSI_GREEN + aCarer + " feeds " + anAnimal + Zoo.ANSI_RESET);
    }

    public static void comingToEnclosure(Enclosure anEnclosure, Carer aCarer) {

        System.out.println(Zoo.ANSI_BLUE + aCarer + " is today at " + anEnclosure + Zoo.ANSI_RESET);
    }

    public static void observeAnAnimal(Carer aCarer, List<Animal> animalList) {

        Random random = new Random();
        int randomNumber = random.nextInt(animalList.size());
        System.out.println(Zoo.ANSI_CYAN + aCarer + " observes " + animalList.get(randomNumber) + Zoo.ANSI_RESET);
    }

    public static void giveAnAnimalAReward(Carer aCarer, List<Animal> animalList) {

        System.out.println(Zoo.ANSI_RED + aCarer + " gives a reward to " + aCarer.bestBuddy + Zoo.ANSI_RESET + "\n");
    }

    public static Enclosure findASuitableEnclosureForCarer(Enclosure[] enclosures, Zoo zooDarica, Carer aCarer) {

        Enclosure aNotCaredEnclosure = zooDarica.addEnclosure("Home", false);

        for (Enclosure enc : enclosures) {

            // If the enclosure has no carer
            if (!enc.getCared()) {
                for (int j = 0; j < aCarer.assignedEnclosures.size(); j++) {

                    // If the enclosure is one of the carer's tasks
                    if (enc == aCarer.assignedEnclosures.get(j)) {
                        aNotCaredEnclosure = enc;
                        return aNotCaredEnclosure;
                    }
                }
            }
        }
        return aNotCaredEnclosure;
    }
}
