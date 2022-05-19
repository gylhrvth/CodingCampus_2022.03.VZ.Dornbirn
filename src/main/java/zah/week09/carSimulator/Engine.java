package zah.week09.carSimulator;

public class Engine {
    private String modelOfEngine;
    private int kW;
    private long kilometers;
    private Car car;


    public Engine(String modelOfEngine, int kW, long kilometers) {
        this.modelOfEngine = modelOfEngine;
        this.kilometers = kilometers;
        this.car = null;
        this.kW = kW;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getkW() {
        return kW;
    }

    public void drive(int km){
        kilometers += km;
    }

    public String getModelOfEngine() {
        return modelOfEngine;
    }
}
