package lukas.week8.day5.zoo;

public class Caretaker {
    private String name;

    public Caretaker(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Caretaker: " + name;
    }
}
