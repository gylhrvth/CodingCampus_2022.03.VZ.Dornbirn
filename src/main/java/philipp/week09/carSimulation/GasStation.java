package philipp.week09.carSimulation;

import java.util.Random;

public class GasStation {
    Random rand = new Random();

    private String name;
    private Car carToRefill;

    public GasStation(String name) {
        this.name = name;
    }


    public void refillCar(Car carToRefill) {
        float refillAmount = rand.nextFloat(10, carToRefill.getTank().getTankCapacity());
//        if (fuelLeft < 0) {
//            fuelLeft = 0;
//        }

        carToRefill.getTank().setFuelInTank(Math.min(refillAmount, carToRefill.getTank().getTankCapacity()));
        System.out.println("\033[0;33m" + "The car has been refilled and has now " + carToRefill.getTank().getFuelInTank() + " of fuel in its tank." + "\033[0m");
        System.out.println("***");
    }
}
