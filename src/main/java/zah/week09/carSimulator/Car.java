package zah.week09.carSimulator;

public class Car {
    private String manufacturer;
    private String model;
    private int kw;
    private int tankCapacity;
    private int weight;

    private enum DRIVE_TYPE {
        PETROL,
        DIESEL,
        GAS,
        ELECTRICITY
    }


    public Car(String manufacturer, String model, int kw, int tankCapacity, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.kw = kw;
        this.tankCapacity = tankCapacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return manufacturer + '\'' + model + '\'';
    }

    public void drive(int km) {



    }
}
