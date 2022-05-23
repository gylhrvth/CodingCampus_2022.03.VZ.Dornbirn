package cemil.week10.carSimulation;

public class Car {
    private String name;
    private String model;
    private Engine engine;
    private int weight;
    private float tankCapacity;
    private int driveToLeft = 0;
    private float tankContent;
    private RepairStation repairStation;


    private enum FUEL {

        PETROL,
        DIESEL,
        GAS,
        ELECTRIC
    }

    public Car(String name, String model, Engine engine, int weight, int tankCapacity) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.tankCapacity = tankCapacity;
        tankContent = tankCapacity;

    }

    public int drive(int km) {
        int driving = 0;
        float fluelperKm = 0.00004f * weight + 0.0002f * (float) engine.getHp();
        while (km > 0 && tankContent >= fluelperKm) {
            ++driving;
            --km;
            tankContent -= fluelperKm;
        }
        System.out.println(getName() + " has driving " + driving + " km and " + String.format("%.2f", tankContent) + " l fuel left.");
//        System.out.println(name + " " + model + " " + engine);
//        System.out.println(engine.getCubicCapacity() + "...." + engine.getHp());



        return driving;

    }

    public void refill() {
        tankContent = tankCapacity;
        System.out.println("Hey I'm refueling  WTF Priceeeeee is sooo Expensive!!!");
    }

    public void replaceEngine(double motor, double hp) {
        engine = new Engine(motor, hp);
        System.out.println(engine);
    }
//
//    public Engine getEngine() {
//        return engine;
//    }


    public String getName() {
        return name;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }

}
