package philipp.week09.carSimulation;


import java.util.Random;

public class MainCarSimulation {
    static Random rand = new Random();
    private static Car[] carList = {
            new Car("Ford", "Mustang", 200, new Tank(55, 0), 1400, Car.TypeOfDrive.GASOLINE),
            new Car("BMW", "X5", 250, new Tank(60, 0), 1500, Car.TypeOfDrive.DIESEL),
            new Car("VW", "Käfer", 40, new Tank(30, 0), 700, Car.TypeOfDrive.GASOLINE),
//            new Car("Scoda", "Octavia", 120, new Tank(65, 0), 1100, Car.TypeOfDrive.GASOLINE),
//            new Car("Audi", "A4", 150, new Tank(55, 0), 1200, Car.TypeOfDrive.GAS),
            new Car("Fiat", "Punto", 60, new Tank(40, 0), 800, Car.TypeOfDrive.ELECTRICITY)
    };

    private static GasStation gasStation = new GasStation(("Shell"));

    private static RepairStation repairStation = new RepairStation("Car Repair Center");


    public static void main(String[] args) {
        simulateCarsDriving(3);
    }

    private static void simulateCarsDriving(int amountOfSimulations) {
        for (Car car : carList) {
            car.getTank().setFuelInTank(rand.nextFloat(10, car.getTank().getTankCapacity()));
//            System.out.println(car);
        }
        for (int i = 0; i < amountOfSimulations; i++) {
            for (Car car : carList) {
                float kmToDrive = rand.nextFloat(2, 5000);
                System.out.println("KM to drive: " + kmToDrive);
                float remKmToDrive=kmToDrive;
                while (remKmToDrive > 0) {
                    remKmToDrive = car.drivingCar(remKmToDrive, kmToDrive);
                    if(car.returnEngineState()== Engine.EngineState.BROKEN){
                        repairStation.changeEngine(car, kmToDrive);
                    }
                    if (car.returnFuelInTank() <= 0) {
                        gasStation.refillCar(car);
                    }
                }
                System.out.println("-----");
//                while (kmToDistance > 0) {
//                    System.out.println("Remaining KM to drive: " + kmToDistance);
//                    float fuelUsage = car.fuelUsage(kmToDistance);
//                    if (car.tank.getFuelInTank() < fuelUsage) {
//                        System.out.println("\033[0;31m" + "The car " + car.getBrand() + " " + car.getModel() + " does not have enough fuel." + "\033[0m");
//                        System.out.println("\033[0;31m" + "It has " + car.tank.getFuelInTank() + " of fuel." + "\033[0m");
//                        System.out.println("\033[0;31m" + "It just can reach " + (car.tank.getFuelInTank() / car.fuelPerKm()) + " km" + "\033[0m");
//                        kmToDistance = kmToDistance - ((car.tank.getFuelInTank() / car.fuelPerKm()));
//                        car.refillCar(car.tank.setFuelInTank(car.tank.getFuelInTank() - fuelUsage));
//                        System.out.println("\033[0;31m" + "The car has been refilled and has now " + car.tank.getFuelInTank() + " of fuel in its tank." + "\033[0m");
//                        System.out.println("***");
//                    } else {
//                        System.out.println("\033[0;32m" + "The car " + car.getBrand() + " " + car.getModel() + " has enough fuel for this distance." + "\033[0m");
//                        System.out.println("\033[0;32m" + "It still has " + (car.tank.getFuelInTank() - fuelUsage) + " of fuel in its tank." + "\033[0m");
//                        car.tank.setFuelInTank(car.tank.getFuelInTank() - fuelUsage);
//                        break;
//                    }
//                }

            }
        }
    }
}

