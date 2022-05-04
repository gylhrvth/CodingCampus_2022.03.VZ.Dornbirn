package timo.week07.Tattoos;

public class Tattoo {
    private String motive;
    private int size;
    private boolean handpoke;
    private String colours;


    public Tattoo (String motive, int size, boolean handpoke, String colours) {
        this.motive = motive;
        this.size = size;
        this.handpoke = handpoke;
        this.colours = colours;
    }

    @Override
    public String toString() {
        return motive + " (size: " + size + ") is Handpoked: " + handpoke + " / colours: " + colours;
    }


    public int getSize() {
        return size;
    }

    public String getMotive() {
        return motive;
    }

    public String getColours() {
        return colours;
    }

    public boolean isHandpoke() {
        return handpoke;
    }
}
