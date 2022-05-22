package murat.week9.car;

public class Tank {

    private float capacity;

    public Tank(float capacity) {
        this.capacity = capacity;
    }


    public float getCapacity() {
        return capacity;
    }


    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "capacity=" + capacity +
                '}';
    }
}


