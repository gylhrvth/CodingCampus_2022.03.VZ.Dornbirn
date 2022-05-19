package aron.week07.zoosim;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Zoo {

    private String name;
    private String year;
    private List<Enclosure> enclosures = new ArrayList<>();
    private List<Nurse> nurses = new ArrayList<>();
    private List<Food> foods = new Vector<>();

    public Zoo(String name, String year) {

        this.name = name;
        this.year = year;

    }

    public void addNurse(Nurse nurse) {
        if (!nurses.contains(nurse)) {
            nurses.add(nurse);
        }
    }

    public void addEnclosure(Enclosure enclosure) {

        if (!enclosures.contains(enclosure)) {
            enclosures.add(enclosure);
        } else {
            System.out.println("Enclosure can't be not added");
        }
    }

    public void removeenclosure(Enclosure enclosure) {
        if (enclosures.contains(enclosure)) {
            enclosures.remove(enclosure);

        }
    }

    public Enclosure searchEnclosureByName(String name) {
        for (Enclosure enc : enclosures) {
            if (enc.getName().equals(name)) {
                return enc;
            }
        }

        return null;
    }

    public void simulate(int day, int tag) {HashMap<Food, Integer> feedStatistik = new HashMap<>();
        for (Nurse n : nurses) {
            n.simulate(tag,feedStatistik);
            System.out.println("Start day " + day);
            }

            printStatistc(feedStatistik);
        }

        public Food searchFoodByName (String name){
            for (Food f : foods) {
                if (f.getName().equals(name)) {
                    return f;
                }

            }
            return addFood(name);
        }

        public Food addFood (String name){
            Food food = new Food(name, 0, 0);
            foods.add(food);
            return food;
        }

        private void printStatistc (HashMap < Food, Integer > feedStatistik){
            System.out.println("Feed statistic:");
            for (Food f : feedStatistik.keySet()) {
                System.out.printf("%-20s %5d %-8s %7d%n", f.getName(), feedStatistik.get(f), f.getUnit(), (feedStatistik.get(f) * f.getUnitPrice()));
            }
        }

        @Override
        public String toString () {
            String output = "├──Zoo:" + name + " | Gegruendet:" + year + "\n";
            for (Enclosure enc : enclosures) {
                output += enc + "\n";
                for (Nurse n : nurses) {
                    output += n + "\n";
                }
            }
            return output;
        }

    public void simulate(int day) {
        return;
    }
}


