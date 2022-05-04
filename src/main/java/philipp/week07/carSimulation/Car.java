package philipp.week07.carSimulation;

public class Car {
    private String brand;
    private String model;
    private int kW;
    private float fuelTank;

    public enum typeOfDrive {GASOLINE, DIESEL, GAS, ELECTRICITY}

    ;
    private int weight;

    public Car(String brand, String model, int kW, int fuelTank, int weight) {
        this.brand = brand;
        this.model = model;
        this.kW = kW;
        this.fuelTank = fuelTank;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getkW() {
        return kW;
    }

    public int getWeight() {
        return weight;
    }

    public float getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(float fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", kW=" + kW +
                ", fuelTank=" + fuelTank +
                ", weight=" + weight;
    }

    public static float fuelUsagePerKm(int kW, int weight) {
        return 0.1f;
    }
}
