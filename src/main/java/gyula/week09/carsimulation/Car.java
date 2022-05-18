package gyula.week09.carsimulation;

public class Car {
    public enum EPowerSource {
        PETROL,
        DIESEL,
        NATURE_GAS,
        ELECTRICITY
    }

    private String producer;
    private String model;
    private int kW;
    private int weight;
    private float tankContent;
    private EPowerSource powerSource;
    private int driveToLeft;
    private float tankCapacity;

    public Car(String producer, String model, int kW, int weight, float tankContent, float tankCapacity, EPowerSource powerSource) {
        this.producer = producer;
        this.model = model;
        this.kW = kW;
        this.weight = weight;
        this.tankContent = tankContent;
        this.tankCapacity = tankCapacity;
        this.powerSource = powerSource;
        driveToLeft = 0;
    }

    public int drive(int kilometer){
        int drivingDistance = 0;
        float fuelPerKm = 0.00004f * weight + 0.0002f * kW;
        while (kilometer > 0 && tankContent > fuelPerKm) {
            ++drivingDistance;
            --kilometer;
            tankContent -= fuelPerKm;
        }
        return drivingDistance;
    }

    public void refill() {
        System.out.println("Refill with " + String.format("%2f", tankCapacity-tankContent)+ " of " + powerSource);
        tankContent = tankCapacity;
    }

}
