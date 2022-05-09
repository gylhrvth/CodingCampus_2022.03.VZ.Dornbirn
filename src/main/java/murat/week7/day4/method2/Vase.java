package murat.week7.day4.method2;

public class Vase {
    private String color;

    private int size;

    public Vase(Shelf muratShelf, String colour, int dimension) {

        color = colour;
        size = dimension;

        muratShelf.addVase(this);
    }

    @Override
    public String toString() {

        return "Vase{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
