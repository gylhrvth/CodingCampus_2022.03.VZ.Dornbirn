package arda.week07.day01;

public class Tattoo {
    private String motive;
    private int size;

    public Tattoo(String motive, int size) {
        this.motive = motive;
        this.size = size;
    }
    @Override
    public String toString(){
        return motive + "(size: " + size + ")";
    }
    public int getSize(){
        return size;
    }
}
