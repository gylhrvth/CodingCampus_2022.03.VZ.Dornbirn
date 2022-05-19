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
       return engine.driveCar(kilometer, this);
   }


    public void refuel() {
        System.out.println("The " + brand + " " + model + " was refueled with " + (tank.getFuelCapacity() - tank.getFuelContent()) + " litre.");
        tank.setFuelContent(tank.getFuelCapacity());
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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

    public boolean isBroken() {
        return engine.isBroken();
    }

}
