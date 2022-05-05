package gyula.week07.creationStrategie;

public class Vase {
    private String color;
    private int size;

    public Vase(Shelf s, String color, int size){
        this.color = color;
        this.size = size;

        s.addVase(this);
    }

    @Override
    public String toString() {
        return "Vase{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
