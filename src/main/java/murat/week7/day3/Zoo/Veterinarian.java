package murat.week7.day3.Zoo;

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

        if (anAnimal.getMaxHealth() != 100) {

            // If healed value do not exceed 100
            //noinspection IntegerDivisionInFloatingPointContext
            if ((anAnimal.getHealth() + ((anAnimal.getMaxHealth() * randomNumber) / 100)) >= 100) {
                anAnimal.setHealth(anAnimal.getMaxHealth());
                System.out.println(anAnimal.getName() + "'s health is maxed! Health: " + anAnimal.getMaxHealth());
            } else {
                //noinspection IntegerDivisionInFloatingPointContext
                anAnimal.setHealth((anAnimal.getHealth() + ((anAnimal.getMaxHealth() * randomNumber) / 100)));
                System.out.println(anAnimal.getName() + " " + randomNumber + "% healed. New Health: " + (int) anAnimal.getHealth());
            }
        } else {
            System.out.println("All animals are healthy.");
        }
    }
}
