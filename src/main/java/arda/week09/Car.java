package arda.week09;

public class Car {
    static final String RESET = "\033[0m";
    static final String RED = "\033[1;31m";
    static final String YELLOW = "\033[0;93m";
    static final String GREEN = "\033[0;92m";
    static final String WHITE = "\033[0;97m";
    private String manufacturer;
    private String model;
    private int hp;
    private float tankCap;
    private String fuel;
    private int weight;
    private float currentFuelAmount;
    private FuelSource fuelSource;

    public enum FuelSource {
        Gasoline,
        Diesel,
        Electricity,
    }

    public Car(String manufacturer, String model, int hp, float tankCap, float currentFuelAmount, FuelSource fuelSource, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.hp = hp;
        this.tankCap = tankCap;
        this.weight = weight;
        this.fuelSource = fuelSource;
        this.currentFuelAmount = currentFuelAmount;
    }

    public int drive(int kilometer) {
        float fuelPerKm = 0.00004f * weight + 0.0002f * hp;
        int maxKm = (int) (currentFuelAmount / fuelPerKm);
        int kmDriven = Math.min(kilometer, maxKm);
        currentFuelAmount -= (kmDriven * fuelPerKm);
        if (kmDriven != kilometer) {
            System.out.println("-------------------------------------------------");
            System.out.printf("%s %s" + YELLOW + " has driven" + RESET + RED + " %dkm (of %dkm)." + RESET + YELLOW + " With " + RESET + RED + "%.2fl" + RESET + YELLOW + " of fuel left!%n" + RESET, manufacturer, model, kmDriven, kilometer, currentFuelAmount);
        } else {
            System.out.println("-------------------------------------------------");
            System.out.printf("%s %s" + GREEN + " has arrived at its destination with %.2fl of fuel left!%n" + RESET, manufacturer, model, currentFuelAmount);
        }
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
        return kmDriven;
    }

    public void refuel() {
        System.out.println("-------------------------------------------------");
        System.out.println(manufacturer + " " + model + YELLOW + " has been refilled with " + RESET + RED + String.format("%2f", tankCap - currentFuelAmount) + " of " + fuelSource + "." + RESET);
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

    @Override
    public String toString() {
        return manufacturer + " " + model;
    }
}
