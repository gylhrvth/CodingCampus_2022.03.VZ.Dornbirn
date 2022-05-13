package timo.week07.TimosZoo;


import java.util.Random;

public class Veterinarian {
    private String name;
    private Zoo zoo;
    private static Random rand = new Random();

    public Veterinarian(Zoo zoo, String name){
        this.name = name;
        this.zoo = zoo;
        zoo.addVeterinarian(this);
    }

    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.println("    " + name);
    }

    public void simulate() {
        Animal animalInNeed = zoo.getAnimalWithMinHealth();
        if (animalInNeed != null && animalInNeed.getHealth() < animalInNeed.getMaxHealth()) {
            int healing = (int) Math.round(animalInNeed.getMaxHealth() * (0.3 + rand.nextInt(70) / 100.0));
            int newHealth = Math.min(animalInNeed.getHealth() + healing, animalInNeed.getMaxHealth());
            System.out.println();
            System.out.println("\u001B[32m" + name + " heals " + animalInNeed.getName() + " from " + animalInNeed.getHealth() + " to " + newHealth + "\u001B[0m");
            animalInNeed.setHealth(newHealth);
        }
    }
}
