package philipp.week09.carSimulation;

public class TankFuel extends Tank{

    public TankFuel(float tankCapacity, float fuelInTank) {
        super(tankCapacity, fuelInTank);
    }

    @Override
    public String toString() {
        String s = ("This is a Fuel Car:\n "+ super.toString());
        return s;
    }
}
