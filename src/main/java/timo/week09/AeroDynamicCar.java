package timo.week09;

public class AeroDynamicCar extends Car{
    public AeroDynamicCar(String brand, String model, Engine engine, Tank tank, int weight) {
        super(brand, model, engine, tank, weight);
    }

    @Override
    public float getLiterPerKm() {
        float literPerKm = (0.004f * weight + 0.02f * engine.getkW()) / 1000;
        return literPerKm;
    }
}
