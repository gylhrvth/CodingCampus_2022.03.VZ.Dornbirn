package lukas.week8.day5.zoo;

public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal: " + name + "(" + type + ")";
    }
}
