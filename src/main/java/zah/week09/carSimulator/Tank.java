package zah.week09.carSimulator;

public class Tank {


    private float tankCapacity;
    private Car car;
    private float tankContent;

    public Tank( float tankCapacity) {
        this.tankCapacity=tankCapacity;
        this.tankContent=tankCapacity;
        this.car =null;


    }
    public void setCar(Car car) {
        this.car = car;
    }


    public float getTankContent() {
        return tankContent;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }
    public void refill() {
        tankContent = tankCapacity;


    }
}
