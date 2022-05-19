package cemil.week10.carSimulation;

public class Car {
    private String name;
    private String model;
    private int hP;
    private int weight;
    private float tankCapacity;
    private int driveToLeft = 0;
    private float tankContent;


    private enum FUEL {
        PETROL,
        DIESEL,
        GAS,
        ELECTRIC
    }

    public Car(String name, String model, int hP, int weight, int tankCapacity) {
        this.name = name;
        this.model = model;
        this.hP = hP;
        this.weight = weight;
        this.tankCapacity = tankCapacity;
        tankContent = tankCapacity;
    }

    public int drive(int km) {
        int driving = 0;
        float fluelperKm = 0.00004f * weight + 0.0002f * hP;
        while (km > 0 && tankContent >= fluelperKm) {
            ++driving;
            --km;
            tankContent -= fluelperKm;
        }
        System.out.println(getName() + " has driving " + driving + " km and " + String.format("%.2f", tankContent) + " l fuel left.");


        return driving;

    }

    public void refill() {
        tankContent = tankCapacity;

    }

    public String getName() {
        return name;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }

}
