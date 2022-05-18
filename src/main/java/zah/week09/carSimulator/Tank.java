package zah.week09.carSimulator;

public class Tank {

    private String model;
    private float tankCapacity;
    private Car car;

    public Tank( float tankCapacity) {
        this.tankCapacity=tankCapacity;
        this.car =null;


    }
    public void setCar(Car car) {
        this.car = car;
    }
}
