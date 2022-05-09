package zah.week07.zoo;

import java.util.List;
import java.util.Vector;

public class Nurse {
    private String name;
    private Zoo zoo;
    private List<Enclosure> tasks;


    public Nurse(Zoo zoo, String name) {
        this.zoo = zoo;
        this.name = name;
        tasks = new Vector<>();
    }


    public String toString(String indention) {
        String out = indention + name + "\n";
        for (Enclosure enc:tasks){
            out +="\t\t ├──"+ " " + enc.toString(indention ) + "\n";
        }
        return out;
    }

    public Enclosure addTask(String nameOfEnclusure) {
        Enclosure en = zoo.searchEnclosureByName(nameOfEnclusure);
        tasks.add(en);
        return en;
    }

    public void simulate() {
        System.out.println(name + " starting to work.");
        for (Enclosure enc: tasks) {
            enc.simulateNurse();
        }
    }
}
