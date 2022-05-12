package philipp.week07.zoo;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class AnimalDoctor {
    Random rn = new Random();
    private String name;

    public AnimalDoctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void healingAnimal(List<Animal> animalsToHeal) {
        float minHealth = Float.MAX_VALUE;
        Animal animalToHeal = null;
        for (Animal a : animalsToHeal) {
            float f = (float) a.getHealth() / a.getMaxHealth();
            if (f < minHealth) {
                minHealth = f;
                animalToHeal = a;
            }
        }
        if (animalToHeal != null) {
            System.out.println(name + " is healing:\n" + "\033[0;31m" + animalToHeal + "\u001B[0m");

            int recoverHealth = rn.nextInt(30, 101);
            int healValue = (animalToHeal.getMaxHealth() * recoverHealth / 100) + animalToHeal.getHealth();
            animalToHeal.setHealth(Math.min(healValue, animalToHeal.getMaxHealth()));

            System.out.println("Now the animal: | " + "\033[032m" + animalToHeal + "\u001B[0m" + " | has been healed!");
            System.out.println();


        } else {
            System.out.println(name + "is not healing an animal!");

        }
    }
}
