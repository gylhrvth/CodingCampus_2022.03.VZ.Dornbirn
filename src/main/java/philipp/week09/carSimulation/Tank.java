package philipp.week09.carSimulation;

public class Tank {

    private final float tankCapacity;
    private float fuelInTank;

    public Tank(float tankCapacity, float fuelInTank) {
        this.tankCapacity = tankCapacity;
        this.fuelInTank = fuelInTank;
    }

    public float getFuelInTank() {
        return fuelInTank;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }

    public float setFuelInTank(float fuelInTank) {
        this.fuelInTank = fuelInTank;
        return fuelInTank;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "tankCapacity=" + tankCapacity +
                ", fuelInTank=" + fuelInTank +
                '}';
    }
}
