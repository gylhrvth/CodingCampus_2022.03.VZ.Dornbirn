package philipp.week07.zoo;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class AnimalArea {
    Random rn = new Random();

    private String name;
    int size;
    private List<Animal> animals = new Vector<>();
    private int lastDayHasBeenCleared;

    public AnimalArea(String name, int size) {
        this.name = name;
        this.size = size;
        lastDayHasBeenCleared = 0;
    }

    public void feedAnimals() {
        System.out.println("Feeding the animals of this area:");
        for (int i = 0; i < animals.size(); i++) {
            System.out.print(" ".repeat(20));
            System.out.println("Feeding: " + animals.get(i));
        }
    }

    public void randomAnimalOfArea() {
        System.out.print("Watching the random animal: ");
        System.out.println(animals.get(rn.nextInt(animals.size())));
    }

    public void setLastDayHasBeenCleared(int lastDayHasBeenCleared) {
        this.lastDayHasBeenCleared = lastDayHasBeenCleared;
    }

    public boolean clearArea(int currentDay) {
        if (currentDay == lastDayHasBeenCleared) {
            // Nothing to do
            System.out.println("\u001B[32m" + "This area already has been done." + "\u001B[0m");
            return false;
        } else {
            // Do cleaning
            System.out.println("\u001B[31m" + "This area needs to be taken care off." + "\u001B[0m");
            lastDayHasBeenCleared = currentDay;
            return true;
        }
    }

    @Override
    public String toString() {
        return name + " " + "(Size: " + size + " m2)";
    }

    public void printAnimalArea() {
        if (animals.size() != 0) {
            for (Animal ani : animals) {
                System.out.print("│ " + " ".repeat(8));
                System.out.print("├── ");
                System.out.println(ani);
            }
        } else {
            System.out.print("│ " + " ".repeat(8));
            System.out.print("├── ");
            System.out.println("(leer)");
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Animal addAnimal(Animal an) {
        animals.add(an);
        return an;
    }

    public void changeSizeArea(int size) {
        this.size = size;
    }

    public void animalFight(int fightRounds) {
        List<Animal> deadAnimals = new Vector<>();
        while (fightRounds > 0) {
            Animal attacker = animals.get(rn.nextInt(animals.size()));
            Animal victim = animals.get(rn.nextInt(animals.size()));
            while (attacker.getHealth() < 1 || attacker == victim) {
                attacker = animals.get(rn.nextInt(animals.size()));
            }
            while (victim.getHealth() < 1) {
                victim = animals.get(rn.nextInt(animals.size()));
            }
            int n = rn.nextInt(10);
            if (n < 4) {
                victim.setHealth(victim.getHealth() - attacker.getBite());
            }
            for (Animal a : animals) {
                if (a.getHealth() < 1 && !deadAnimals.contains(a)) {
                    deadAnimals.add(a);
                }
            }
            fightRounds--;
        }
        System.out.println("\033[4;34m"+"Animal health:"+"\033[0m");
        for (Animal a : animals) {
            if (a.getHealth() > 0) {
                System.out.println(a);
            }
        }
        System.out.println();
        if (!deadAnimals.isEmpty()) {
            System.out.println("\033[0;35m"+"Following animals are dead and have to be removed:"+"\033[0m");
            for (Animal dA : deadAnimals) {
                System.out.println(dA);
            }
        }
    }
}

