package arda.week09;

import java.util.Random;

public class Car {
    static final String RESET = "\033[0m";
    static final String RED = "\033[1;31m";
    static final String YELLOW = "\033[0;93m";
    static final String GREEN = "\033[0;92m";
    static final String WHITE = "\033[0;97m";
    static final String RED_BOLD_BRIGHT = "\033[1;91m";
    private String manufacturer;
    private String model;
    private int hp;
    private float tankCap;
    private String fuel;
    private int weight;
    private float currentFuelAmount;
    private FuelSource fuelSource;
    private Engine engine;
    private Random rand = new Random();
    private int drivenKm = 0;

    public enum FuelSource {
        Gasoline,
        Diesel,
        Electricity,
    }

    public Car(String manufacturer, String model, int hp, Tank tank, int weight, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.hp = hp;
        this.tankCap = tank.getTankCap();
        this.weight = weight;
        this.fuelSource = tank.getFuelSource();
        this.currentFuelAmount = tank.getCurrentFuelAmount();
        this.engine = engine;
    }

    public int drive(int kilometer) {
        float fuelPerKm = 0.00004f * weight + 0.0002f * hp;
        int maxKm = (int) (currentFuelAmount / fuelPerKm);
        int kmDriven = Math.min(kilometer, maxKm);
        drivenKm += kmDriven;
        currentFuelAmount -= (kmDriven * fuelPerKm);

        if (kmDriven != kilometer) {
            System.out.println("-------------------------------------------------");
            System.out.printf("%s %s" + YELLOW + " has driven" + RESET + RED + " %dkm (of %dkm). " + RESET + YELLOW + "%.2fl of fuel left!%n" + RESET, manufacturer, model, kmDriven, kilometer, currentFuelAmount);
        } else {
            System.out.println("-------------------------------------------------");
            System.out.printf("%s %s" + GREEN + " has arrived at its destination. %.2fl of fuel left!%n" + RESET, manufacturer, model, currentFuelAmount);
        }
        return kmDriven;
/*
        while (maxKm != kilometer && currentFuelAmount > 0) {
            ++kmDriven;
            --kilometer;
            currentFuelAmount -= fuelPerKm;
            if (kmDriven == kilometer) {
                System.out.println();
                System.out.printf("%n%s %s has arrived at its destination with %fl of fuel left! %n", manufacturer, model, currentFuelAmount);
                break;
            } else {
                System.out.println();
                System.out.printf("%n%s %s has driven %dkm with %fl of fuel left!%n", manufacturer, model, kmDriven, currentFuelAmount);
                System.out.printf("%dkm left until arrival at destination.", (kilometer - kmDriven));
            }
        }
 */
    }

    public void kmTEST() {
        System.out.println(drivenKm);
    }

    public boolean isCarBrokenDown() {
        return engine.isEngineBroken();
    }

    public void refuel() {
        System.out.println("-------------------------------------------------");
        System.out.println(manufacturer + " " + model + YELLOW + " has been refilled with " + RESET + RED + String.format("%.2f", tankCap - currentFuelAmount) + " of " + fuelSource + "." + RESET);
        currentFuelAmount = tankCap;
    }

    public int getHp() {
        return hp;
    }

    public float getTankCap() {
        return tankCap;
    }

    public FuelSource getFuelSource() {
        return fuelSource;
    }

    public float getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public String getFuel() {
        return fuel;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void replaceEngine(Engine eng) {
        this.engine = eng;
    }

    @Override
    public String toString() {
        return manufacturer + " " + model;
    }
}
