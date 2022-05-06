package murat.week7.day3.Zoo;

import java.util.List;
import java.util.Vector;

public class Carer {

    private String name;

    private Zoo zoo;

    private List<Enclosure> tasks = new Vector<>();

    public Carer(Zoo zoo, String name) {

        this.name = name;
        this.zoo = zoo;
    }

    public String getName() {

        return name;
    }

    public Zoo getZoo() {

        return zoo;
    }

    public List<Enclosure> getTasks() {

        return tasks;
    }

    public String toString(String indention) {

        String out = indention + name;
        for (Enclosure enc : tasks) {
            out += "\n\t\t ├──" + enc.toString(indention);
        }
        return  out;
    }

    public Enclosure addTask(String nameOfEnclosure) {

        Enclosure en = zoo.searchEnclosureByName(nameOfEnclosure);
        tasks.add(en);
        return en;
    }
}
