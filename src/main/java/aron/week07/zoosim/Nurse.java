package aron.week07.zoosim;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Nurse {

    private String nurseName;
    private List<Enclosure> enclosures = new ArrayList<>();
    private List<Enclosure> dailyTasks = new ArrayList<>();
    private Zoo zoo;

    public Nurse(Zoo zoo, String nurseName) {

        this.nurseName = nurseName;
        this.zoo = zoo;

        zoo.addNurse(this);
    }

    public void addEnclosure(Enclosure enclosure) {

        if (!enclosures.contains(enclosure)) {
            enclosures.add(enclosure);
        } else {
            System.out.println("The task is not possible");
        }
    }

    public void addTaskToDailyTasks(String enclosureName){
        Enclosure enc = zoo.searchEnclosureByName(enclosureName);
        if (!dailyTasks.contains(enc)){
            dailyTasks.add(enc);
        }
    }


    @Override
    public String toString() {
        String output = "Nurse: " +MainZoo.ANSI_RED + nurseName + MainZoo.ANSI_RESET + "\n";
        for (Enclosure enc: enclosures) {
            output += enc + "\n";

        }
        return output;
    }

    public void removeenclosure(Enclosure enclosure) {
        if (enclosures.contains(enclosure)) {
            enclosures.add(enclosure);
        }
    }

    public void simulate(int tag, HashMap<Food, Integer> feedStatistik) {
        for (Enclosure enc: dailyTasks){
            if (enc.getLastDayOfCleaning() != tag) {
                System.out.println(nurseName + ": ich reinige die Gehege " + enc.getName() + ".");
                enc.setLastDayOfCleaning(tag);
                enc.feedAnimals(feedStatistik);
            } else {
                System.out.println(nurseName + ": die Gehege " + enc.getName() + " wurde schon gereinigt.");
            }
        }
    }
}
