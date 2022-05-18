package timo.week09.Car;

public class Car {
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


    public void refuel() {
        tank.setFuelContent(tank.getFuelCapacity());
        System.out.println("The " + brand + " " + model + " was refueled.");
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
