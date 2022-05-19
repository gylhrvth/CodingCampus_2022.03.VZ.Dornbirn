package timo.week09.Car;

import java.util.Random;

public class CarMain {
    public static void main(String[] args) {

        Random random = new Random();

        RepairStation repairStation = new RepairStation();

        Engine wankel = new Engine("Wankelmotor", 169);
        Tank tank1 = new Tank(55);

        Car car1 = new Car("Mazda", "RX-8", wankel, tank1, 1379);


        int kmGoal = 10000;

        while (kmGoal > 0) {
            int km = car1.startDrive(kmGoal);
            System.out.println("The " + car1 + " has driven " + km + " km distance.");
            if (car1.isBroken()) {
                repairStation.replaceEngine(car1);
            }
            kmGoal -= km;
            Tank t = car1.getTank();
            if (t.getFuelContent() < 0.1 * t.getFuelCapacity()) {
                car1.refuel();
            }
            if (kmGoal <= 0) {
                System.out.println("\u001B[32m" + "The " + car1 + " has reached the goal!" + "\u001B[0m");
            }
        }

    }
}
