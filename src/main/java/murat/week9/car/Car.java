package murat.week9.car;

import lukas.week4.day3.Color;
import murat.Colors;

public class Car {

    private String producer;
    private String model;
    private int horsePower;
    private float tankCapacity;
    private float fuelLevel;

    private enum DRIVING_TYPE {
        GASOLINE, DIESEL, GAS, ELECTRICITY,
    }

    public Car(String producer, String model, int horsePower, float tankCapacity, float fuelLevel) {
        this.producer = producer;
        this.model = model;
        this.horsePower = horsePower;
        this.tankCapacity = tankCapacity;
        this.fuelLevel = fuelLevel;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setTankCapacity(float tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "Car{" + "producer='" + producer + '\'' + ", model='" + model + '\'' + ", horsePower=" + horsePower + ", tankCapacity=" + tankCapacity + ", fuelLevel=" + fuelLevel + '}';
    }

    public float fuelConsumptionPerKm() {
        return 1.0f;
    }

    public int drive(int targetKm) {

        int kmDriven = 0;

        while (fuelLevel > 0 && kmDriven < targetKm) {
            fuelLevel -= fuelConsumptionPerKm();
            kmDriven++;
        }

        if (kmDriven < targetKm) {
            System.out.println("Fuel-tank is empty. There are still " + Colors.ANSI_RED + (targetKm - kmDriven) + Colors.ANSI_RESET + " km to drive. " + Colors.ANSI_BLUE + kmDriven + Colors.ANSI_RESET + " km is driven!");
            return (targetKm - kmDriven);
        } else {
            System.out.println(Colors.ANSI_GREEN + kmDriven + Colors.ANSI_RESET + " km is driven. Remaining fuel " + Colors.ANSI_GREEN + fuelLevel + Colors.ANSI_RESET + " liters");
            return 0;
        }
    }

    public void refill() {
        fuelLevel = tankCapacity;
        System.out.println(tankCapacity + " liters filled!");
    }

    public void driveToTarget(int targetInKm) {

        int updatedTarget = 0;

        int drivenOrRemainingKm = drive(targetInKm);

        if (drivenOrRemainingKm < targetInKm) {

            updatedTarget = drivenOrRemainingKm;

            while (fuelLevel == 0) {
                refill();
                updatedTarget = drive(updatedTarget);
            }

            if (fuelLevel > 0) {
                System.out.println(Colors.ANSI_GREEN + "Target reached! (" + targetInKm + " km)" + " Remaining fuel: " + Colors.ANSI_GREEN + fuelLevel + Colors.ANSI_RESET + " liters.");
            }
        }
    }
}
