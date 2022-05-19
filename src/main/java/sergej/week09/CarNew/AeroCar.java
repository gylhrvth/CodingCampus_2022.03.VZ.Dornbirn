package sergej.week09.CarNew;

public class AeroCar extends Car{
    public AeroCar(String brand, String model, Engine engine, Tank tank, int weight) {
        super(brand, model, engine, tank, weight);
    }

    @Override
    public float getLiterPerKm() {
        float literPerKm = (0.004f * weight + 0.02f * engine.getkW())/200;
        return literPerKm ;
    }
}
