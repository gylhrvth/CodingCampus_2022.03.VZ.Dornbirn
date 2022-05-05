package zah.week07.zoo;

public class Animal {
    private String name;
    private String speciment;

    public Animal(String name, String speciment){
        this.name=name;
        this.speciment=speciment;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speciment='" + speciment + '\'' +
                '}';
    }
}
