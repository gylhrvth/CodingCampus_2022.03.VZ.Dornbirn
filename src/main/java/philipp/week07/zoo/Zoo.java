package philipp.week07.zoo;

import sergej.week04.NewRandom;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Zoo {
    Random rn = new Random();

    private String name;
    private int yearOfEstablishment;
    private Vector<AnimalArea> animalArea;
    private List<AnimalKeeper> animalKeepers = new Vector<>();
    private List<Feed> animalFeed = new Vector<>();
    private List<AnimalDoctor> animalDoctors = new Vector<>();

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

    public Feed addFeed(Feed feed) {
        animalFeed.add(feed);
        return feed;
    }

    public AnimalDoctor addDoctor(AnimalDoctor doctor) {
        animalDoctors.add(doctor);
        return doctor;
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

    //Simulation 0.1
    public void takeCareOfZooAreas() {
        for (AnimalKeeper animalKeeper : animalKeepers) {
            System.out.println(animalKeeper.getName() + ": ");
            animalKeeper.printListAreasToWork();
            System.out.println();
        }
        System.out.println();
    }

    //Bonusaufgabe Tierfutter
    public void requiredFoodCost() {
        HashMap<String, Float> feedUseDay = new HashMap<>();
        for (AnimalArea area : animalArea) {
            for (int j = 0; j < area.getAnimals().size(); j++) {
                Animal a = area.getAnimals().get(j);
                if (feedUseDay.containsKey(a.getNeededFeed().getNameFeed())) {
                    feedUseDay.put(a.getNeededFeed().getNameFeed(), feedUseDay.get(a.getNeededFeed().getNameFeed()) + a.getRequiredFoodDay());
                } else {
                    feedUseDay.put(a.getNeededFeed().getNameFeed(), a.getRequiredFoodDay());
                }
            }
        }
        for (String s : feedUseDay.keySet()) {
            float unitPr = 0.0f;
            String unitF = "";
            for (Feed feed : animalFeed) {
                if (feed.getNameFeed().equals(s)) {
                    unitF = feed.getUnitFeed();
                    unitPr = feed.getUnitPrice();
                }
            }
            System.out.println("Feed: " + s);
            System.out.printf("%s %4.2f %s%n", "Needed qty is", feedUseDay.get(s), unitF);
            System.out.printf("%s %6.2f %s%n", "The total costs are", (feedUseDay.get(s) *
                    unitPr), "Eur");
            System.out.println();
        }
    }

    //Simulation 0.3
    public void healingAnimals() {
        HashMap<Animal, Integer> animalsToHeal = new HashMap<>();
        for (AnimalArea area : animalArea) {
            for (int j = 0; j < area.getAnimals().size(); j++) {
                Animal a = area.getAnimals().get(j);
                if (a.getHealth() > 0) {
                    animalsToHeal.put(a, a.getHealth());
                }
            }
        }
        float minHealth = Float.MAX_VALUE;
        Animal animalToHeal = null;
        for (AnimalDoctor animalDoctor : animalDoctors) {
            for (Animal a : animalsToHeal.keySet()) {
                float f = (float)a.getHealth()/a.getMaxHealth();
                if (f < minHealth) {
                    minHealth = f;
                    animalToHeal = a;
                }
            }
            if (animalToHeal != null) {
                System.out.println(animalDoctor + " is healing:\n" + "\033[0;31m" + animalToHeal + "\u001B[0m");

                int recoverHealth = rn.nextInt(30, 101);
                int healValue = (animalToHeal.getMaxHealth() * recoverHealth / 100) + animalToHeal.getHealth();
                animalToHeal.setHealth(Math.min(healValue, animalToHeal.getMaxHealth()));

                System.out.println("Now the animal: | " + "\033[032m" + animalToHeal + "\u001B[0m" + " | has been healed!");
                System.out.println();

                animalsToHeal.remove(animalToHeal);
                animalToHeal = null;
                minHealth = Float.MAX_VALUE;
            } else {
                System.out.println(animalDoctor + "is not healing an animal!");
            }
        }
    }
}






