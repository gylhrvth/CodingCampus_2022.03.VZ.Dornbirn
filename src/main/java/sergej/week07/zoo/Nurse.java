package sergej.week07.zoo;

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





    public String toString(String indentation) {
        String out = indentation + name + "\n";
        for (Enclosure enc:tasks){
            out +="\t\t ├──"+ " " + enc.toString(indentation) + "\n";
        }
        return out;
    }

    public Enclosure addTask(String nameOfEnclusure) {
        Enclosure en = zoo.searchEnclosureByName(nameOfEnclusure);
        tasks.add(en);
        return en;
    }

}
