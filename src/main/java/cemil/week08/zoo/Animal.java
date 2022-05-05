package cemil.week08.zoo;


public class Animal {
    private String name;
    private String art;


    public Animal(String name, String art) {
        this.name = name;
        this.art = art;
    }

    @Override
    public String toString() {
        String output = "";
        output += name + ", " + art + "\n";

        return output;
    }
}
