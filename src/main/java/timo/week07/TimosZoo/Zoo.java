package timo.week07.TimosZoo;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Zoo {
    private String name;
    private int foundation;
    private List<Enclosure> enclosures;
    private List<Zookeeper> zookeepers = new Vector<>();

    public Zoo(String name, int foundation) {
        this.name = name;
        this.foundation = foundation;
        this.enclosures = new Vector<>();
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
            zookeeper.printCleaningTasks();
        }

    }



}
