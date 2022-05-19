package sergej.week09.CarNew;


import java.util.Random;

public class Car {
    Random random = new Random();

    private String brand;
    private String model;
    private Tank tank;
    private Engine engine;
    private int weight;

    private enum driveType {
        GASOLINE,
        DIESEL,
        GAS,
        ELECTRIC
    }


    public Car(String brand, String model, Engine engine, Tank tank, int weight) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.tank = tank;
        this.weight = weight;
    }


    public int startDrive(int kilometer) {
        System.out.println("The " + brand + " " + model + " has started the engine.");
        int distance = engine.driveCar(kilometer, this);
        return distance;
    }


    public int refuel() {
        int fuel = random.nextInt(tank.getFuelCapacity());
        System.out.println("The " + brand + " " + model + " was refueled.");
        return fuel;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public Tank getTank() {
        return tank;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}


