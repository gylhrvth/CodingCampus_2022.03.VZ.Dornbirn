package arda.week09.carsimulation;

public class Aerodynamiccar extends Car {
    private int weight;
    private int hp;

    public Aerodynamiccar(String manufacturer, String model, int hp, Tank tank, int weight, Engine engine) {
        super(manufacturer, model, hp, tank, weight, engine);
        this.hp = hp;
        this.weight = weight;
    }

    @Override
    protected float calculateFuel() {
        return super.calculateFuel() / 2;
    }
}
