package arda.week07.zoosimulation;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CareTaker {
    private final String name;
    private List<Enclosure> taskedToCage = new ArrayList<>();
    private Zoo zoo;
    static final String GREEN = "\033[0;92m";
    static final String RESET = "\033[0m";
    static final String YELLOW = "\033[0;93m";
    static final String BLUE = "\033[0;94m";

    public CareTaker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTaskedToCage(List<Enclosure> taskedToCage) {
        this.taskedToCage = taskedToCage;
    }

    public List<Enclosure> getTaskedToCage() {
        return taskedToCage;
    }

    public void taskToCage(Enclosure enclosure) {
        if (!taskedToCage.contains(enclosure)) {
            taskedToCage.add(enclosure);
            enclosure.addCareTaker(this);
        } else {
            System.out.println("CareTaker could not be tasked to enclosure");
        }
    }

    public void deTaskFromCage(Enclosure enclosure) {
        if (taskedToCage.contains(null)) {
            taskedToCage.remove(enclosure);
        }
    }

/*    public Animal admireAnimal(List<Enclosure> enclosures) {
        Random rand = new Random();
        List<Animal> animals = null;
        for (int i = 0; i < taskedToCage.size(); i++) {
            Enclosure enclosure = taskedToCage.get(i);
            animals = enclosure.getAnimals();
        }
        int indexOfFavAnimal = rand.nextInt(animals.size());
        return animals.get(indexOfFavAnimal);
    }
 */

    public void simulateDay(int workDay, HashMap<AnimalFood, Integer> statistic) {
        System.out.println();
        System.out.println(name + " starts to work");
        for (Enclosure enclosure: taskedToCage) {
            enclosure.takeCareOfAnimal(workDay, statistic);
            Animal favourite = enclosure.admireAnimal();
            if (favourite != null) {
                System.out.println();
                System.out.println(name + " admires " + YELLOW + favourite + RESET + ".");
            }
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
