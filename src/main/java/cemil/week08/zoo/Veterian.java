package cemil.week08.zoo;

import java.util.Random;

public class Veterian {
    private String name;
    private Zoo zoo;
    private static Random rand = new Random();

    public Veterian(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.println("    " + name);
    }

    public void simulate() {
        Animal animalNeed = zoo.getAnimalWithMinHealth();
        if (animalNeed != null && animalNeed.getHealthy() < animalNeed.getHealthyMax()) {
            int healing = (int) Math.round(animalNeed.getHealthyMax() * (0.3 + rand.nextInt(40) / 100.0));
            int newHealth = Math.min(animalNeed.getHealthy() + healing, animalNeed.getHealthyMax());
            System.out.println(name + "heals" + animalNeed.getName() + "from" + animalNeed.getHealthy() + " to " + newHealth);
            animalNeed.setHealth(newHealth);
        }
    }

    @Override
    public String toString() {
        return "Veterian{" +
                "name='" + name + '\'' +
                '}';
    }
}
