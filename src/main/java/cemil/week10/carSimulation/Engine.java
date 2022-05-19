package cemil.week10.carSimulation;

public class Engine {
    private double cubicCapacity;
    private double hp;
    private int kilometer;


    public Engine(double motor, double hp) {
        this.cubicCapacity = motor;
        this.hp = hp;

    }

    public double getHp() {
        return hp;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    @Override
    public String toString() {
        return  cubicCapacity + " " + hp;
    }
}
