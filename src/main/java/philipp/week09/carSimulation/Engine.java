package philipp.week09.carSimulation;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Engine {
    Random rand = new Random();

    public enum EngineState {
        WORKING,
        BROKEN,
    }

    private String name;
    private EngineState engineState;
    private RepairStation repairStation;
    float kmDriven = 0f;

    public Engine(String name) {
        this.name = name;
        this.engineState = EngineState.WORKING;

    }

    public void randomSetEngineBroken(Car car, float remKmToDrive) {
        if (rand.nextFloat(100000) <= kmDriven) {
            engineState = Engine.EngineState.BROKEN;
            System.out.println("\u001B[35m" + "Your engine broke " + remKmToDrive + "km before the destination" + "\u001B[0m");
            System.out.println("\033[0;35m" + "The car has " + car.getTank().getFuelInTank() + " of fuel." + "\033[0m");
        }
    }

    public EngineState getEngineState() {
        return engineState;
    }

    public float drivingCar(float remKmToDistance, float kmToDistance, Car carDriving) {
        kmDriven = kmDriven + (kmToDistance - remKmToDistance);
        float fuelUsage = carDriving.fuelUsage(remKmToDistance);
        if (carDriving.getTank().getFuelInTank() < fuelUsage) {
            randomSetEngineBroken(carDriving, remKmToDistance);
            if (engineState == EngineState.BROKEN) {
                return remKmToDistance;
            } else {
                System.out.println("\033[0;31m" + "The car " + carDriving.getBrand() + " " + carDriving.getModel() + " does not have enough fuel." + "\033[0m");
                System.out.println("\033[0;31m" + "It just has " + carDriving.getTank().getFuelInTank() + " of fuel." + "\033[0m");
                System.out.println("\033[0;31m" + "It just can reach " + (carDriving.getTank().getFuelInTank() / carDriving.fuelPerKm()) + " km" + "\033[0m");
            }
        } else {
            System.out.println("\033[0;32m" + "The car " + carDriving.getBrand() + " " + carDriving.getModel() + " has enough fuel for this distance." + "\033[0m");
            System.out.println("\033[0;32m" + "It still has " + (carDriving.getTank().getFuelInTank() - fuelUsage) + " of fuel in its tank." + "\033[0m");
        }
        remKmToDistance = remKmToDistance - ((carDriving.getTank().getFuelInTank() / carDriving.fuelPerKm()));
        carDriving.getTank().setFuelInTank(carDriving.getTank().getFuelInTank() - fuelUsage);
        return remKmToDistance;
    }
}
