package zah.week09.carSimulator;

import java.util.List;
import java.util.Vector;

public class Car {
    private String manufacturer;
    private String model;
    private float tankCapacity;
    private int weight;
    private float tankContent;
    private Engine engine;
    private List<Tank> tanks;


    private enum DRIVE_TYPE {
        PETROL,
        DIESEL,
        GAS,
        ELECTRICITY
    }


    public Car(String manufacturer, String model, Engine engine, float tankCapacity, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;

        this.tankCapacity = tankCapacity;
        this.weight = weight;
        this.tankContent = tankCapacity;
        this.engine = engine;
        engine.setCar(this);
        this.tanks = new Vector<>();

    }

    public void addTank(Tank t) {
        if (!tanks.contains(t)) {
            tanks.add(t);
        }
    }


    public void replaceEngine(Engine e) {
        engine.setCar(null);
        engine = e;
        e.setCar(this);
    }

    public void refill() {
        tankContent = tankCapacity;


    }


    public String toString(String id) {
        String out = id + manufacturer + "\n";
        out += model + "\n";

        return out;

    }

    @Override
    public String toString() {
        return toString("");
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public int getTankCapacity() {
        return (int) tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int drive(int km) {
        int driving = 0;
        float a = 0.00004f;
        float b = 0.0002f;
        float fluelperKm = a * weight + b * engine.getkW();
        while (km > 0 && tankContent > fluelperKm) {
            ++driving;
            --km;
            tankContent -= fluelperKm;
        }
        engine.drive(driving);
        System.out.println(getManufacturer() + " has driving  " + driving + " km and " + tankContent + " l fluel left");


        return driving;

    }
}
