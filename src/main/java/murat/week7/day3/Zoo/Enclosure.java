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

    private static Random rand = new Random();

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

        return name;
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

        System.out.println();
        if (animals.size() >= 2) {      // There are needed at least 2 animals
            for (int indexOfAgressiveAnimal = 0; indexOfAgressiveAnimal < animals.size(); indexOfAgressiveAnimal++) {
                int indexOfVictom = indexOfAgressiveAnimal;
                while (indexOfVictom == indexOfAgressiveAnimal){
                    indexOfVictom = rand.nextInt(animals.size());
                }
                // If the animal is alive and there is a possibility of attacking
                if (animals.get(indexOfAgressiveAnimal).possibilityOfAnAttack() && animals.get(indexOfAgressiveAnimal).getHealth() > 0) {
                    // In case of a bite, calculate the damage
                    float oldHealth = animals.get(indexOfVictom).getHealth();
                    animals.get(indexOfVictom).setHealth(Math.max(0f, animals.get(indexOfVictom).getHealth() - animals.get(indexOfAgressiveAnimal).getBite()));
                    System.out.println("Aaaah [" + Zoo.ANSI_BLUE + animals.get(indexOfAgressiveAnimal) + Zoo.ANSI_RESET + "] bit [" +
                            Zoo.ANSI_RED + animals.get(indexOfVictom) + Zoo.ANSI_RESET
                            + "] New Health: " + oldHealth + " --> " + animals.get(indexOfVictom).getHealth());
                    if (animals.get(indexOfVictom).getHealth() <= 0) {
                        System.out.println(animals.get(indexOfVictom) + " is unfortunately" + Zoo.ANSI_BLACK + " dead." + Zoo.ANSI_RESET);
                        removeAnimal(animals, indexOfVictom);
                    }
                }
            }
        } else {
            System.out.println("There are <2 animals at " + this + " enclosure");
        }
    }
}

