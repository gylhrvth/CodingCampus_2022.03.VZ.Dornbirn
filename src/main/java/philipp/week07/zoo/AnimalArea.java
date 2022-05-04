package philipp.week07.zoo;

public class AnimalArea {
    private String name;

    public AnimalArea(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal area: " + name + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
