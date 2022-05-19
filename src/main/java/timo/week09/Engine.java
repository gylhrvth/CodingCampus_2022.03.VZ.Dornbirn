package timo.week09;

import java.util.Random;

public class Engine {
    Random random = new Random();
    private String name;
    private int kW;
    private boolean broken;
    private int motorKm;


    public Engine(String name, int kW) {
        this.name = name;
        this.kW = kW;
        this.broken = false;
        motorKm = 0;
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
        Tank t = car.getTank();
        int kmDriven = 0;
        for (int i = 0; i <= kilometer; i++) {
            kmDriven++;
            motorKm++;
            if (t.consumeFuel(1, car) == 1){
                if (random.nextInt(1000000) <= motorKm) {
                    setBroken();
                    System.out.println("\u001B[31m" + "Your engine broke at " + motorKm + "km" + "\u001B[0m");
                    break;
                }
            } else {
                System.out.println("Tank is empty");
                break;
            }
        }
        return kmDriven;
    }

    public int getMotorKm() {
        return motorKm;
    }
}

