package sergej.week09.Car;

public class Fueltank {
    private int capacity;
    Engine engine;

    public Fueltank(int capacity,Engine engine) {
        this.capacity = capacity;
        engine.setFuelTank(this);

    }

    public int getCapacity() {
        return capacity;
    }

    public int setCapacity(int capacity) {
        this.capacity = capacity;
        return capacity;
    }


}
