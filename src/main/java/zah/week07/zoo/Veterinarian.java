package zah.week07.zoo;

import java.util.Vector;

public class Veterinarian {
    private String name;
    private Zoo zoo;


    public Veterinarian(Zoo zoo, String name) {
        this.name = name;
        this.zoo = zoo;

    }

    public String getName() {
        return name;
    }


    public String toString(String id) {
        return "Veterinarian" + name + '\'';
    }
}
