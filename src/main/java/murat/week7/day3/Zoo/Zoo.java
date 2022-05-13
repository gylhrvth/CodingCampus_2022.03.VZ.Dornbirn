package murat.week7.day3.Zoo;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.*;

public class Zoo {
    private String name;

    private String city;

    private int establishedIn;

    private List<Enclosure> enclosures = new Vector<>();

    private List<Carer> carers = new Vector<>();

    private List<Veterinarian> vets = new Vector<>();

    private List<Food> foods = new Vector<>();

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

    public List<Food> getFoods() {

        return foods;
    }

    public void printStructure() {

        System.out.println(ANSI_RED + "├── Zoo: " + name + ", established " + establishedIn + ANSI_RESET);
        for (Enclosure enc : enclosures) {
            enc.printStructure();
        }
        System.out.println();
        System.out.println(UNDERLINE + "Employees:" + UNDERLINE_RESET + "\n_________________________");
        for (Carer c : carers) {
            c.printStructure();
        }
    }

    @Override
    public String toString() {

        return name;
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

    public Food addFood(String name, String unit, float price) {

        Food f = new Food(name, unit, price);
        foods.add(f);
        return f;
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

        Random rand = new Random();
        int randomNumber = rand.nextInt(30, 100);
        Animal weakestAnimal = null;

        int count = 0;
        while (count < vets.size()) {

            int worstCondition = 100;
            // Find the animal with worst condition at zoo
            for (Enclosure enclosure : enclosures) {

                //If the enclosure has at least an animal
                if (enclosure.getAnimals().size() > 0) {

                    // Call weakest animals from each enclosure
                    int condition = enclosure.weakestAnimalInAnEnclosure().calculateAnimalConditions();

                    if (condition <= worstCondition) {
                        worstCondition = condition;
                        weakestAnimal = enclosure.weakestAnimalInAnEnclosure();
                    }
                }
            }

            if (weakestAnimal.getHealth() >= weakestAnimal.getMaxHealth()) {
                System.out.println("All animals are healthy");
            } else {
                System.out.println("\n" + ANSI_GREEN + vets.get(count) + ANSI_RESET + " heals " + weakestAnimal);
                vets.get(count).healAnAnimal(weakestAnimal, randomNumber);
            }

            count++;
        }

    }

    // Calculate total food consumption in a zoo.
    public Map<Food, Float> foodConsumptionInAZoo() {

        Map<Food, Float> foodConsumptionAtThisZoo = new HashMap<>();

        for (Enclosure enclosure : enclosures) {
            for (Map.Entry<Food, Float> entry : enclosure.foodConsumptionInAnEnclosure().entrySet()) {
                if (foodConsumptionAtThisZoo.containsKey(entry.getKey())) {

                    // If there is already an entry, accumulate them.
                    foodConsumptionAtThisZoo.put(entry.getKey(), foodConsumptionAtThisZoo.get(entry.getKey()) + entry.getValue());
                } else {

                    // If not, create a new entry in map
                    foodConsumptionAtThisZoo.put(entry.getKey(), entry.getValue());
                }
            }
        }

        return foodConsumptionAtThisZoo;
    }

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String UNDERLINE = "\033[4m";

    public static final String UNDERLINE_RESET = "\033[24m";

    public static final String BOLD = "\033[1m";

    public static final String BOLD_RESET = "\033[0m";

}


