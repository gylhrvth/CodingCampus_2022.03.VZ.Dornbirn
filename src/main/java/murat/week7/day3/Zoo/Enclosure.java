package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Enclosure {
    private String name;

    private List<Animal> animals = new Vector<>();

    private List<Carer> carers = new Vector<>();

    private List<Veterinarian> vets = new Vector<>();

    public boolean alreadyCared;

    public Enclosure(String name, boolean cared) {

        this.name = name;
        this.alreadyCared = cared;
    }

    public List<Carer> getCarers() {

        return carers;
    }

    public String getName() {

        return name;
    }

    public List<Animal> getAnimals() {

        return animals;
    }

    public boolean getCared() {

        return alreadyCared;
    }

    public List<Veterinarian> getVets() {

        return vets;
    }

    public boolean setCaredOrNot(boolean caredOrNot) {

        alreadyCared = caredOrNot;

        return alreadyCared;
    }

    public String toString(String indention) {

        String out = indention + name + (alreadyCared ? Zoo.ANSI_GREEN + " (Cared)" + Zoo.ANSI_RESET : Zoo.ANSI_RED + " (Not cared)" + Zoo.ANSI_RESET);
        for (Animal animal : animals) {
            out += Zoo.ANSI_CYAN + "\n\t\t\t├──" + animal.toString(indention) + Zoo.ANSI_RESET;
        }
        return out;
    }

    @Override
    public String toString() {

        return name + " " + (alreadyCared ? " (Cared)" : " (Not cared)");
    }

    public Animal addAnimal(String name, String species, float health, int maxHealth, float bite) {

        Animal ani = new Animal(name, species, health, maxHealth, bite);
        animals.add(ani);
        return ani;
    }

    public List<Animal> removeAnimal(List<Animal> animals, int index) {

        animals.remove(index);
        return animals;
    }

    public void simulation02() {

        System.out.println("\n-------------ANIMAL CONDITIONS BEFORE-----------------\n");
        for (Animal animal : animals) {
            animal.printAnimalCondition();
        }
        System.out.println();

        Random rand = new Random();
        int randNo1 = rand.nextInt(animals.size());
        int randNo2 = rand.nextInt(animals.size());

        //System.out.println("Random 1: " + randNo1 + " Random 2: " + randNo2);

        while (true) {

            if (randNo1 != randNo2) {           // Find two distinct random numbers
                if (animals.size() >= 2) {      // There are needed at least 2 animals

                    // If the animal is alive and there is a possibility of attacking
                    if (animals.get(randNo1).possibilityOfAnAttack() && animals.get(randNo1).getHealth() > 0) {

                        // In case of a bite, calculate the damage
                        System.out.println("Aaaah [" + Zoo.ANSI_BLUE + animals.get(randNo1) + Zoo.ANSI_RESET + "] bit [" + Zoo.ANSI_RED + animals.get(randNo2) + Zoo.ANSI_RESET + "] New Health: " + animals.get(randNo2).getHealth());
                        animals.get(randNo2).setHealth(animals.get(randNo2).getHealth() - animals.get(randNo1).getBite());
                        if (animals.get(randNo2).getHealth() <= 0) {
                            System.out.println(animals.get(randNo2) + " is unfortunately" + Zoo.ANSI_BLACK + " dead." + Zoo.ANSI_RESET);
                            removeAnimal(animals, randNo2);
                        }
                    } else {
                        System.out.println("The animals live in peace.");
                    }
                }
                break;
            } else {
                randNo1 = rand.nextInt(animals.size());
                randNo2 = rand.nextInt(animals.size());
                //System.out.println("Bottom: Random 1: " + randNo1 + " Random 2: " + randNo2);
            }
        }

        System.out.println("\n-------------ANIMAL CONDITIONS AFTER-----------------");
        for (Animal animal : animals) {
            animal.printAnimalCondition();
        }
    }
}
