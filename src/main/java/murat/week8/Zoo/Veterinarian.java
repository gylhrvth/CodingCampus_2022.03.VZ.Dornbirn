package murat.week8.Zoo;

public class Veterinarian {
    public String name;

    private Zoo zoo;

    public Veterinarian(Zoo zoo, String name) {

        this.name = name;
        this.zoo = zoo;

    }

    public String getName() {

        return name;
    }

    public Zoo getZoo() {

        return zoo;
    }

    @Override
    public String toString() {

        return "Vet " + name;
    }

    public void healAnAnimal(Animal anAnimal, int randomNumber) {

        float healingRate = (float) (randomNumber * anAnimal.getMaxHealth() / 100.0);
        float newHealth = Math.min((healingRate + anAnimal.getHealth()), anAnimal.getMaxHealth());

        // If the animal has a bad condition
        if (anAnimal.getHealth() < anAnimal.getMaxHealth()) {

            if (newHealth >= anAnimal.getMaxHealth()) {
                anAnimal.setHealth(anAnimal.getMaxHealth());
                System.out.println(anAnimal.getName() + "'s health is maxed! Health: " + anAnimal.getMaxHealth());
            } else {
                anAnimal.setHealth(newHealth);
                System.out.println(anAnimal.getName() + " " + randomNumber + "% healed. New Health: " + (int) anAnimal.getHealth());
            }
        } else {
            // If all animals are healthy
            System.out.println("All animals are healthy.");
        }
    }
}
