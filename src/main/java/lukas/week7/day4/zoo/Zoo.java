package lukas.week7.day4.zoo;

import java.util.List;
import java.util.Vector;

public class Zoo {
    private List<Prison> prisons = new Vector<>();
    private String name;
    private int foundationDate;

    public Zoo(String name, int foundationDate) {
        this.name = name;
        this.foundationDate = foundationDate;
    }

    public void addPrison(Prison prison) {
        if (!prisons.contains(prison)) {
            prisons.add(prison);
        }
    }

    public Prison findPrison(String name) {
        throw new UnsupportedOperationException("This is not implemented yet...");
    }

    public void removePrison(Prison prison) {
        if(prison.animalCount() > 0) {
            throw new RuntimeException("There are still animals in this prison!!!");
        }
        prisons.remove(prison);
    }
}
