package arda.week09.carsimulation;

public class Tank {
    private float currentFuelAmount;
    private float tankCap;
    private Car.FuelSource fuelSource;

    public Tank(float tankCap, float currentFuelAmount, Car.FuelSource fuelSource) {
        this.currentFuelAmount = currentFuelAmount;
        this.tankCap = tankCap;
        this.fuelSource = fuelSource;
    }

    public Car.FuelSource getFuelSource() {
        return fuelSource;
    }

    public float getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public float getTankCap() {
        return tankCap;
    }

}
