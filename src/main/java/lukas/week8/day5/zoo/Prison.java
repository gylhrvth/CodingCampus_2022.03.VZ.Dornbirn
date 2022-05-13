package lukas.week8.day5.zoo;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    private String name;
    private List<Animal> animals = new ArrayList<>();
    private Caretaker caretaker;

    public Prison(String name) {
        this.name = name;
    }

    public void setCaretaker(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        }
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void toString(String indention, StringBuilder builder) {
        builder.append(indention).append(name);
        builder.append(System.lineSeparator());
        builder.append(indention).append(indention).append(caretaker).append(" takes care of:");
        for (Animal animal : animals) {
            builder.append(System.lineSeparator());
            builder.append(indention).append(indention).append(indention).append(animal);
        }
    }
}
