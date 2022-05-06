package lukas.week7.day4.zoo;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    private String name;
    public static List<Prison> ALL_CREATED_PRISONS_EVER = new ArrayList<>();

    public Prison(String name) {
        this.name = name;
        ALL_CREATED_PRISONS_EVER.add(this);
    }

    public int animalCount() {
        return 0;
    }

    @Override
    public String toString() {
        return "Prison{" +
                "name='" + name + '\'' +
                '}';
    }
}
