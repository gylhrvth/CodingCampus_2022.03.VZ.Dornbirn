package philipp.week07.zoo;

public class AnimalDoctor {
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
