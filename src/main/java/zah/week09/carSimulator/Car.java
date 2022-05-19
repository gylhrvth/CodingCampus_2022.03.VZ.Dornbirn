package zah.week09.carSimulator;

import java.util.List;
import java.util.Vector;

public class Car {
    private String manufacturer;
    private String model;
    //private float tankCapacity;
    private int weight;
    //private float tankContent;
    private Engine engine;
    private Tank tank;


    private enum DRIVE_TYPE {
        PETROL,
        DIESEL,
        GAS,
        ELECTRICITY
    }


    public Car(String manufacturer, String model, Engine engine,Tank tank, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;

        //this.tankCapacity = tankCapacity;
        this.weight = weight;
        //this.tankContent = tankCapacity;
        this.engine = engine;
        this.tank=tank;
        engine.setCar(this);


    }




    public void replaceEngine(Engine e) {
        engine.setCar(null);
        engine = e;
        e.setCar(this);
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public int drive(int km) {
        int driving = 0;
        float a = 0.00004f;
        float b = 0.0002f;
        float fluelperKm = a * weight + b * engine.getkW();
        while (km > 0 && tank.getTankContent() > fluelperKm) {
            ++driving;
            --km;

            Tank.setTankContent(tank.getTankContent()-fluelperKm);

        }
        engine.drive(driving);
        System.out.println(getManufacturer() + " has driving  " + driving + " km and " + String.format("%.2f",tank.getTankContent()) + " l fluel left");


        return driving;

    }
}
