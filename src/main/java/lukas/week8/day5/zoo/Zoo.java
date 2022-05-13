package lukas.week8.day5.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Prison> prisons = new ArrayList<>();
    private String name;

    public Zoo(String name) {
        this.name = name;
    }

    public void addPrison(Prison prison) {
        if (!prisons.contains(prison)) {
            prisons.add(prison);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Zoo");
        for (Prison p : prisons) {
            builder.append(System.lineSeparator());
            p.toString("  ", builder);
        }
        return builder.toString();
    }
}
