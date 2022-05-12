package sergej.week07.zoo;




import java.util.HashMap;
import java.util.Vector;

public class Zoo {
    private String name;
    private int established;
    private Vector<Enclosure> enclosures;
    private Vector<AnimalCarer> animalCarers;
    private HashMap<String, Integer> foodWareHouse;
    private Vector<Veterian> veterinarians;

    public Zoo(String name, int established) {
        this.name = name;
        this.established = established;
        this.enclosures = new Vector<>();
        this.animalCarers = new Vector<>();
        this.foodWareHouse = new HashMap<>();
        this.veterinarians = new Vector<>();
    }

    public void addEnclosure(Enclosure enc) {
        if (!enclosures.contains(enc)) {
            enclosures.add(enc);
        }
    }

    public void addFood(Food food) {
        if (!foodWareHouse.containsKey(food.getName())) {
            foodWareHouse.put(food.getName(), food.getAmount());
        } else {
            foodWareHouse.put(food.getName(), foodWareHouse.get(food.getName()) + food.getAmount());
        }
    }

    public Enclosure searchEnclosureByName(String name) {
        for (Enclosure enc : enclosures) {
            if (enc.getName().equals(name)) {
                return enc;
            }
        }
        return new Enclosure(this, name);
    }

    public void printStructure() {
        System.out.println("├── Zoo: " + name + ", gegründet " + established);
        for (Enclosure enc : enclosures) {
            enc.printStructure();
        }
        System.out.println();
        System.out.println("Mitarbeiter:");
        for (AnimalCarer ac : animalCarers) {
            ac.printStructure();
        }
        System.out.println();
        System.out.println("Futter Lager:");
        for (String food : foodWareHouse.keySet()) {
            System.out.println(food + " : " + foodWareHouse.get(food));
        }
        System.out.println();
        System.out.println("Tagesbedarf an Futter: ");

        HashMap<Food, Integer> dailyFoodNeed = new HashMap<>();
        for (Enclosure en : enclosures) {
            en.foodSimulator(dailyFoodNeed);
        }

        Integer sum = 0;
        for (Food fod : dailyFoodNeed.keySet()) {
            sum += (dailyFoodNeed.get(fod) * fod.getPrice());
            System.out.println(fod + ": " + dailyFoodNeed.get(fod) + " " + fod.getUnit() + "´s" + " for " + fod.getPrice() + " eur " + " (total price: " + dailyFoodNeed.get(fod) * fod.getPrice() + ")");
        }
        System.out.println("Total Expenses: " + sum + " eur");

    }

    public void addAnimalCarer(AnimalCarer animalCarer) {
        if (!animalCarers.contains(animalCarer)) {
            animalCarers.add(animalCarer);
        }
    }

    public void simulate(int tag) {
        for (AnimalCarer ac : animalCarers) {
            ac.simulate(tag);
        }
        for (Enclosure enclosure: enclosures){
            enclosure.simulate();
        }
        for (Veterian vet: veterinarians) {
            vet.simulate();

        }
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

    public void addVeterinarian(Veterian vet){
        if (!veterinarians.contains(vet)) {
            veterinarians.add(vet);
        }
    }

    public Veterian searchVeterinarianByName(String name){
        for (Veterian vet: veterinarians){
            if (vet.getName().equals(name)){
                return vet;
            }
        }
        return new Veterian(this, name);
    }


}
