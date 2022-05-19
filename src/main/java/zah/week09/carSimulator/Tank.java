package zah.week09.carSimulator;

public class Tank {


    private static float tankCapacity;
    private Car car;
    private static float tankContent;

    public Tank( float tankCapacity) {
        this.tankCapacity=tankCapacity;
        this.tankContent=tankCapacity;
        this.car =null;


    }
    public void setCar(Car car) {
        this.car = car;
    }

    public static void setTankContent(float tankContent) {
        Tank.tankContent = tankContent;
    }

    public float getTankContent() {
        return tankContent;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }
    public static void refill() {
        tankContent = tankCapacity;


    }


}
