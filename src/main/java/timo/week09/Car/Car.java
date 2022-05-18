package timo.week09.Car;

public class Car {
    private String brand;
    private String model;
    private int kW;
    private int fuelcapacity;
    private int fuelcontent;

    private enum driveType {
        GASOLINE,
        DIESEL,
        GAS,
        ELECTRIC
    }

    private int weight;

    public Car(String brand, String model, int kW, int fuelcapacity, int weight) {
        this.brand = brand;
        this.model = model;
        this.kW = kW;
        this.fuelcapacity = fuelcapacity;
        this.fuelcontent = fuelcapacity;
        this.weight = weight;
    }


    public int drive(int kilometer) {
        int possibleDistance = 0;
        float a = 0.004f;
        float b = 0.02f;

        float literPerKm = (a * weight + b * kW) / 100;
        possibleDistance = (int) Math.floor(fuelcapacity / literPerKm);
        int remainingKm = kilometer - possibleDistance;


        if (possibleDistance > kilometer) {
            fuelcontent -= literPerKm * kilometer;
            System.out.println("The " + brand + " " + model + " was able to drive the full distance " + "(" + kilometer + "km). Fuel consumption = " + literPerKm + "l/km.");
        } else {
            fuelcontent -= literPerKm * kilometer;
            System.out.println("The " + brand + " " + model + " was able to drive " + possibleDistance + "km (from " + kilometer + "km). Fuel consumption = " + literPerKm + "l/km");
            System.out.println("Remaining km: " + remainingKm);
        }
        return possibleDistance;

    }


    public void refill() {
        fuelcontent = fuelcapacity;
        System.out.println("The " + brand + " " + model + " was refueled.");
    }


    @Override
    public String toString() {
        return brand + " " + model;
    }
}
