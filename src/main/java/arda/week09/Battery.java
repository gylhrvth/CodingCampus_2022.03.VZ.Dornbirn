package arda.week09;

public class Battery extends Tank {
    public Battery(int charge, int currentCharge, Car.FuelSource fuelSource) {
        super(charge, currentCharge, fuelSource);
    }

    @Override
    public float getCurrentFuelAmount() {
        return super.getCurrentFuelAmount();
    }

    @Override
    public float getTankCap() {
        return super.getTankCap();
    }

    @Override
    public Car.FuelSource getFuelSource() {
        return super.getFuelSource();
    }
}
