package zah.week07.zoo;

import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

public class Enclosure {
    private String name;
    private Zoo zoo;
    private Vector<Animal> animals;
    private int lastDayOfCleaning = 0;

    public Enclosure(Zoo zoo,String name) {
        this.zoo=zoo;
        this.name = name;
        animals = new Vector<>();
        zoo.addEnclosure(this);
    }

    public String toString(String indention) {
        String out = indention + name;
        for (Animal an : animals) {
            out += "\n\t\t\t├──" + " " + an.toString(indention);

        }
        return out;
    }

    public Animal addAnimal(String name, String species, Feed feed, Integer requirement,int health, int maxHealth, int damage) {
        Animal an = new Animal(name, species, feed, requirement, health,maxHealth, damage);
        animals.add(an);
        return an;
    }

    public void simulateBites() {
        Random random = new Random();
        for (Animal an:animals) {
            Animal attacker = animals.get(random.nextInt(animals.size()));
            Animal victim = animals.get(random.nextInt(animals.size()));
            if ((an.getHealth()>0)&& (random.nextInt()< victim.getDamage())){
                attacker.bites(victim);

            }
            if (victim.getHealth()>0){
                int newHealth = victim.getHealth()-victim.getDamage();
                victim.setHealth(newHealth);
                System.out.println(attacker.getName()+" has attack "+ victim.getName()+" "+ victim.getDamage()+" time" );

            }
        }

    }

    public String getName() {
        return name;
    }
// Is not more use
//    public void simulateNurse() {
//        System.out.println(name + " Has been cleared");
//    }

    public int getLastDayOfCleaning() {
        return lastDayOfCleaning;
    }

    public void setLastDayOfCleaning(int lastDayOfCleaning) {
        this.lastDayOfCleaning = lastDayOfCleaning;
    }

    public void feedAnimals(HashMap<Feed, Integer> statistik) {
        for (Animal an : animals) {
            an.feedAnimal(statistik);
        }
    }
}

