package murat.week7.day4.method2;

import java.util.List;
import java.util.Vector;

public class Shelf {
    private String label;

    private int length;

    private List<Vase> manyVases = new Vector<>();

    public Shelf(String name, int dimension) {

        label = name;
        length = dimension;
    }

    public void addVase(Vase vase) {

        manyVases.add(vase);
    }

    @Override
    public String toString() {

        return "Shelf{" +
                "label='" + label + '\'' +
                ", length=" + length +
                ", manyVases=" + manyVases +
                '}';
    }
}
