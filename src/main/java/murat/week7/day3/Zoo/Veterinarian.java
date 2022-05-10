package murat.week7.day3.Zoo;

public class Veterinarian {
    public String name;

    private Zoo zoo;

    public Veterinarian(Zoo zoo, String name) {

        this.name = name;
        this.zoo = zoo;

    }

    public String getName() {

        return name;
    }

    public Zoo getZoo() {

        return zoo;
    }

    @Override
    public String toString() {

        return "Vet " + name;
    }


}
