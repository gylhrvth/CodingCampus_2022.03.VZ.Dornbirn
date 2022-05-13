package arda.week08.zoo;

import java.util.Random;

public class Vet {
    private final Random rand = new Random();
    private final String name;
    static final String GREEN = "\033[0;92m";
    static final String RESET = "\033[0m";
    static final String YELLOW = "\033[0;93m";
    static final String BLUE = "\033[0;94m";
    static final String CYAN = "\033[0;96m";

    public Vet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal findWeakestAnimal(Enclosure enclosure) {
        float leastHealthPercentage = 100;
        Animal weakestAnimal = null;
        for (Animal animal : enclosure.getAnimals()) {
            if (!animal.isDead()) {
                float percentage = 100f / animal.getStats().getMaxHealth() * animal.getStats().getHealth();
                if (percentage <= leastHealthPercentage) {
                    weakestAnimal = animal;
                }
            }
//            if (!animal.isDead() && animal.getStats().getHealth() < (animal.getStats().getMaxHealth()*(10/100)));
        }
        return weakestAnimal;
    }

    public void healAnimal(Enclosure enclosure) {
        Animal animal = findWeakestAnimal(enclosure);
        if (!animal.isDead() && animal.getStats().getHealth() < animal.getStats().getMaxHealth()) {
            System.out.println();
            System.out.println(CYAN + name + " starts to work" + RESET);

            int maxHealth = animal.getStats().getMaxHealth();

            //Zufallsprozent zwischen 30% und 100%
            int percentage = rand.nextInt(100 - 30) + 30;
            int healingValue = (int) (maxHealth * percentage / 100f);
            int healingPercentage = rand.nextInt(maxHealth - 30) + 30;
            int currentHealth = animal.getStats().getHealth();
            System.out.println(GREEN + name + " heals " + animal + RESET);
            animal.getStats().setHealth(Math.min(animal.getStats().getHealth() + healingValue, maxHealth));
            if (currentHealth == maxHealth) {
                System.out.println(animal + GREEN + " is healed to the max!" + RESET);
            } else {
                System.out.println(animal + " was healed from " + GREEN + currentHealth + " to " + animal.getStats().getHealth() + RESET + " health.");
            }
        }
    }
}
