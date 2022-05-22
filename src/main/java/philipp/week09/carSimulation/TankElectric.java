package philipp.week09.carSimulation;

public class TankElectric extends Tank {

    public TankElectric(float tankCapacity, float fuelInTank) {
        super(tankCapacity, fuelInTank);
    }

    @Override
    public String toString() {
        String s = ("This is an Electric Car:\n"+ super.toString());
        return s;
    }
}



