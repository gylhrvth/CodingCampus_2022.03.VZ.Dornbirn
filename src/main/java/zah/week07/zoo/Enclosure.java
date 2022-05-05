package zah.week07.zoo;

public class Enclosure {
    private String name;

    public Enclosure(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Enclosure{" +
                "name='" + name + '\'' +
                '}';
    }
}
