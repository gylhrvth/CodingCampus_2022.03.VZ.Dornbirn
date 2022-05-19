package timo.week09;

import java.util.Random;

public class CarMain {
    public static void main(String[] args) {

        Random random = new Random();

        RepairStation repairStation = new RepairStation();

        Engine wankel = new Engine("Wankelmotor", 169);
        Engine electro = new Engine("Electric Motor", 200);
        Tank tank1 = new Tank(55);
        Battery bat1 = new Battery(600);

        Car car1 = new Car("Mazda", "RX-8", wankel, tank1, 1379);
        Car car2 = new Car("Tesla", "Model-X", electro, bat1, 1900);
        CrapCar crap1 = new CrapCar("VW", "Golf", electro, bat1, 1200);
        AeroDynamicCar aero1 = new AeroDynamicCar("Aston Martin", "Vulcan", wankel, tank1, 1000);

        int goalDistance = 5000;

        simulate(car1, goalDistance, repairStation);
        System.out.println();
        simulate(car2, goalDistance, repairStation);
        System.out.println();
        simulate(crap1, goalDistance, repairStation);
        System.out.println();
        simulate(aero1, goalDistance, repairStation);

    }

    public static void simulate (Car car, int kmGoal, RepairStation repairStation) {
        while (kmGoal > 0) {
            int km = car.startDrive2(kmGoal);
            System.out.println("The " + car + " has driven " + km + " km distance.");
            if (car.isBroken()) {
                repairStation.replaceEngine(car);
            }
            kmGoal -= km;
            Tank t = car.getTank();
            if (t.getContent() < 0.1 * t.getCapacity()) {
                car.refuel();
            }
            if (kmGoal <= 0) {
                System.out.println("\u001B[32m" + "The " + car + " has reached the goal!" + "\u001B[0m");
            }
        }

    }
}
