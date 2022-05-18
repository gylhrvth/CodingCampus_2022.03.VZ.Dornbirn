package timo.week09.Car;

import java.util.Random;

public class Engine {
    Random random = new Random();
    private String name;
    private int kW;
    private boolean broken;


    public Engine(String name, int kW) {
        this.name = name;
        this.kW = kW;
        this.broken = false;
    }


    public int getkW() {
        return kW;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken() {
        broken = true;
    }

    public int driveCar(int kilometer, Car car) {
        System.out.println("The " + car.getBrand() + " " + car.getModel() + " is driving...");
        for (int i = 0; i < kilometer; i++) {
                if (random.nextInt(100) <= i / 1000) {
                    setBroken();
                    System.out.println("\u001B[31m" + "Your engine broke at " + i + "km" + "\u001B[0m");
                    break;
                }
            }
        int distance = car.getTank().consumeFuel(kilometer, car);

        return distance;
    }

}

