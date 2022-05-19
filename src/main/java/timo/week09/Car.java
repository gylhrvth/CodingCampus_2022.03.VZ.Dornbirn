package timo.week09;

import java.util.Random;

public class Car {
    Random random = new Random();
    protected String brand;
    protected String model;
    protected Tank tank;
    protected Engine engine;
    protected int weight;


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


   /*public int startDrive(int kilometer) {
       System.out.println("The " + brand + " " + model + " has started the engine.");
       return engine.driveCar(kilometer, this);
   }
   */

    public int startDrive2(int kilometer) {
        System.out.println("The " + brand + " " + model + " is driving...");
        int kmDriven = 0;
        int mileage = engine.getMotorKm();
        for (int i = 0; i <= kilometer; i++) {
            kmDriven++;
            mileage++;
            if (tank.consumeFuel(1, this) == 1) {
                if (random.nextInt(1000000) <= mileage) {
                    engine.setBroken();
                    System.out.println("\u001B[31m" + "Your engine broke at " + mileage + "km" + "\u001B[0m");
                    break;
                }
            } else {
                System.out.println("Tank is empty");
                break;
            }
        }
        return kmDriven;
    }


    public void refuel() {
        System.out.println("The " + brand + " " + model + " was refueled with " + (tank.getCapacity() - tank.getContent()) + " litres/watts.");
        tank.setContent(tank.getCapacity());
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

    public float getLiterPerKm() {
        float literPerKm = (0.004f * weight + 0.02f * engine.getkW()) / 100;
        return literPerKm;
    }

}
