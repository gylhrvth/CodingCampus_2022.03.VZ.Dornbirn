package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Zoo {
    private String name;

    private String city;

    private int establishedIn;

    private List<Enclosure> enclosures = new Vector<>();

    private List<Carer> carers = new Vector<>();

    private List<Veterinarian> vets = new Vector<>();

    public Zoo(String name, String city, int establishedIn) {

        this.name = name;
        this.establishedIn = establishedIn;
        this.city = city;
    }

    public String getName() {

        return name;
    }

    public String getCity() {

        return city;
    }

    public int getEstablishedIn() {

        return establishedIn;
    }

    public List<Enclosure> getEnclosures() {

        return enclosures;
    }

    public List<Carer> getCarers() {

        return carers;
    }

    public List<Veterinarian> getVets() {

        return vets;
    }

    public String toString(String index) {

        String out = index + "├──";
        out += name;
        out += " " + establishedIn + "\n";

        out += "\n------------------ENCLOSURES---------------------";
        for (Enclosure enc : enclosures) {
            out += Zoo.ANSI_RED + "\n\t├──" + enc.toString(index) + Zoo.ANSI_RESET + "\n";
        }
        return out;
    }

    @Override
    public String toString() {

        return toString("");
    }

    public Enclosure addEnclosure(String name, boolean cared) {

        Enclosure enc = new Enclosure(name, cared);
        enclosures.add(enc);
        return enc;
    }

    public Carer addCarer(String name, Animal bestBuddy) {

        Carer c = new Carer(this, name, bestBuddy);
        carers.add(c);
        return c;
    }

    public Veterinarian addVet(String name) {

        Veterinarian v = new Veterinarian(this, name);
        vets.add(v);
        return v;
    }

    public Enclosure searchEnclosureByName(String name) {

        for (Enclosure enc : enclosures) {
            if (enc.getName().equals(name)) {
                return enc;
            }
        }
        return addEnclosure(name, false);
    }

    public void simulation03() {

        int worstCondition = 100;
        Random rand = new Random();
        int randomNumber = rand.nextInt(30, 100);
        Animal weakestAnimal = null;

        int count = 0;
        while (count < vets.size()) {
            // Find the animal with worst condition at zoo
            for (Enclosure enclosure : enclosures) {

                //If the enclosure has at least an animal
                if (enclosure.getAnimals().size() != 0) {

                    // Call weakest animals from each enclosure
                    int condition = enclosure.weakestAnimalInAnEnclosure().calculateAnimalConditions();
                    //System.out.println("Name: " + enclosure.weakestAnimalInAnEnclosure().getName() + ", Health: " + enclosure.weakestAnimalInAnEnclosure().calculateAnimalConditions());
                    if (condition < worstCondition) {
                        worstCondition = condition;
                        weakestAnimal = enclosure.weakestAnimalInAnEnclosure();
                    }
                    worstCondition = 100;
                }
            }
            System.out.println("\n" + ANSI_GREEN + vets.get(count) + ANSI_RESET + " heals " + weakestAnimal);
            vets.get(count).healAnAnimal(weakestAnimal, randomNumber);
            count++;
        }

    }

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_GREEN = "\u001B[32m";

}


