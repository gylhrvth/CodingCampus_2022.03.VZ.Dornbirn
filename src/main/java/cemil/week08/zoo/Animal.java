package cemil.week08.zoo;


public class Animal {
    private String name;
    private String art;


    public Animal(String name, String art) {
        this.name = name;
        this.art = art;
    }

    public String getName() {
        return name;
    }

    public String toString(String indention) {
        String out = indention + name;
        out += ", " + art;
        return out;
    }

    @Override
    public String toString() {
        return toString("");
    }
}
