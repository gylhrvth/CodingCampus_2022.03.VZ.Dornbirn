package arda.week09;

public class Crappycar extends Car {
    private Engine engine;

    public Crappycar(String manufacturer, String model, int hp, Tank tank, int weight, Engine engine) {
        super(manufacturer, model, hp, tank, weight, engine);
        this.engine = getEngine();
    }

    @Override
    protected int breakDownChance() {
        return super.breakDownChance() - 1;
    }
}
