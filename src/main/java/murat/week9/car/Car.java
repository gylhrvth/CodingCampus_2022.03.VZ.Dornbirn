package murat.week9.car;

import murat.Colors;

public class Car {

    private String producer;
    private String model;

    private float fuelLevel;

    private Tank tank;

    private Engine engine;

    public enum DrivingType {
        GASOLINE, DIESEL, GAS, ELECTRICITY,
    }

    DrivingType driveType;

    public Car(String producer, String model, DrivingType driveType, float fuelLevel, Tank tank, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.driveType = driveType;
        this.tank = tank;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }


    public float getFuelLevel() {
        return fuelLevel;
    }

    public Tank getTank() {
        return tank;
    }

    public Engine getEngine() {
        return engine;
    }

    public DrivingType getDriveType() {
        return driveType;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDriveType(DrivingType driveType) {
        this.driveType = driveType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", tank=" + tank +
                ", engine=" + engine +
                ", driveType=" + driveType +
                '}';
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

        fuelLevel = tank.getCapacity();
        System.out.println(tank.getCapacity() + " liters filled!");

    }

    public void driveToTarget(int targetInKm) {

        int updatedTarget = 0;
        int refillCounter = 0;

        int drivenOrRemainingKm = drive(targetInKm);


        if (drivenOrRemainingKm < targetInKm) {

            updatedTarget = drivenOrRemainingKm;


            while (fuelLevel == 0) {
                refill();
                refillCounter++;
                updatedTarget = drive(updatedTarget);

            }

            if (fuelLevel > 0) {
                System.out.println(Colors.ANSI_GREEN + "STATS:--------------------------------\n" +
                        "Target reached! (" + targetInKm + " km)\n" +
                        "Remaining fuel: " + Colors.ANSI_GREEN + fuelLevel + " liters. \n" +
                        refillCounter + " times filled up!" + Colors.ANSI_RESET);
            }
        }
    }
}
