package philipp.week09.carSimulation;

import java.util.Random;

public class Car {
    Random rand = new Random();

    public enum TypeOfDrive {GASOLINE, DIESEL, GAS, ELECTRICITY}

    private String brand;
    private String model;
    private final int kW;
    private final int weight;
    private Tank tank;
    private Engine engine = new Engine("Engine 01");
    private TypeOfDrive typeOfDrive;


    public Car(String brand, String model, int kW, Tank tank, int weight, TypeOfDrive typeOfDrive) {
        this.brand = brand;
        this.model = model;
        this.kW = kW;
        this.tank = tank;
        this.weight = weight;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    @Override
    public String toString() {
        return "Car{" +
                "rand=" + rand +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", kW=" + kW +
                ", weight=" + weight +
                '}';
    }

    public float fuelUsage(float kilometer) {
        float totalFuelUsage = kilometer * fuelPerKm();
        System.out.println("Driving the car: " + brand + " " + model);
        System.out.println("Needed fuel would be: " + totalFuelUsage);
        return totalFuelUsage;
    }

    public float fuelPerKm() {
        return (weight * 0.004f + 0.02f * kW) / 100;
    }

    public float drivingCar(float remKmToDistance, float kmToDistance) {
        System.out.println("Remaining KM to drive: " + remKmToDistance);
        return engine.drivingCar(remKmToDistance, kmToDistance, this);
    }

    public float returnFuelInTank() {
        return tank.getFuelInTank();
    }

    public Engine.EngineState returnEngineState() {
        return engine.getEngineState();
    }


}
