package philipp.week07.zoo;

import java.util.HashMap;
import java.util.Random;

public class AnimalDoctor {
    Random rn = new Random();
    private String name;

    public AnimalDoctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
