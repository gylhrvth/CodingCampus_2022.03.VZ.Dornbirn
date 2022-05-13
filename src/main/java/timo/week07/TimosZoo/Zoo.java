package timo.week07.TimosZoo;


import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Zoo {
    private String name;
    private int foundation;
    private List<Enclosure> enclosures;
    private List<Zookeeper> zookeepers = new Vector<>();
    private Vector<Veterinarian> veterinarians;

    public Zoo(String name, int foundation) {
        this.name = name;
        this.foundation = foundation;
        this.enclosures = new Vector<>();
        this.veterinarians = new Vector<>();
    }


    public String toString(String indentation) {
        String output = indentation + " ";
        output += name;
        output += ", founded in " + foundation + "\n";
        for (Enclosure en : enclosures) {
            output += "│" + "    " + en.printString(indentation + " ") + "\n";
        }
        return output;
    }

    public Enclosure addEnclosure(String name) {
        Enclosure e = new Enclosure(name);
        enclosures.add(e);
        return e;
    }

    public void removeEnclosure(Enclosure e) {
        enclosures.remove(e);
    }


    public Zookeeper addZookeeper(Zookeeper zk) {
        zookeepers.add(zk);
        return zk;
    }

    public void simulate() {
        for (Zookeeper zookeeper : zookeepers) {
            System.out.println(zookeeper.getName() + ": ");
            zookeeper.simulate();
        }

        HashMap<Food, Integer> dailyFoodNeed = new HashMap<>();
        for (Enclosure en : enclosures) {
            en.simulate();
            en.foodSimulator(dailyFoodNeed);
        }
        for (Veterinarian vet : veterinarians){
            vet.simulate();
        }

        System.out.println();
        System.out.println("Daily Food Expenses:");
        Integer sum = 0;
        for (Food fod : dailyFoodNeed.keySet()) {
            sum += (dailyFoodNeed.get(fod) * fod.getPrice());
            System.out.println(fod + ": " + dailyFoodNeed.get(fod) + " " + fod.getUnit() + " for " + fod.getPrice() + "€ each" + " (total price: " + dailyFoodNeed.get(fod) * fod.getPrice() + "€)");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Total expenses: " + sum + "€");

    }

    public void addVeterinarian(Veterinarian vet){
        if (!veterinarians.contains(vet)) {
            veterinarians.add(vet);
        }
    }


    public Veterinarian searchVeterinarianByName(String name){
        for (Veterinarian vet: veterinarians){
            if (vet.getName().equals(name)){
                return vet;
            }
        }
        return new Veterinarian(this, name);
    }


    public Animal getAnimalWithMinHealth() {
        Animal result = null;
        for (Enclosure enc: enclosures){
            Animal animalInNeed = enc.getAnimalWithMinHealth();
            if (result == null) {
                result = animalInNeed;
            } else if (animalInNeed != null){
                double relHealthOfResult = result.getHealth() / (double)result.getMaxHealth();
                double relHealthOfAnimalInNeed = animalInNeed.getHealth() / (double)animalInNeed.getMaxHealth();
                if (relHealthOfAnimalInNeed < relHealthOfResult){
                    result = animalInNeed;
                }
            }
        }
        return result;
    }



}
