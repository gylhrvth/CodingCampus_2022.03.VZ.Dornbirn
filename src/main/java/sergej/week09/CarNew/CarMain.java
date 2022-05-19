package sergej.week09.CarNew;


import java.util.Random;

public class CarMain {
    public static void main(String[] args) {

        Random random = new Random();

        RepairStation repairStation = new RepairStation();

        Engine engine = new Engine("V8", 169);
        Engine engine2 = new Engine("Electro", 200);
        Tank tank1 = new Tank(55);
        Battery bat1 = new Battery(600);

        Car car1 = new Car("Audi", "A8", engine, tank1, 1379);
        Car car2 = new Car("Tesla", "Model x", engine2, bat1, 1900);


        int kmGoal = 10000;

        while (kmGoal > 0) {
            int km = car2.startDrive(kmGoal);
            System.out.println("The " + car2 + " has driven " + km + " km distance.");
            if (car2.isBroken()) {
                repairStation.replaceEngine(car2);
            }
            kmGoal -= km;
            Tank t = car2.getTank();
            if (t.getFuelContent() < 0.1 * t.getCapacity()) {
                car2.refuel();
            }
            if (kmGoal <= 0) {
                System.out.println("\u001B[32m" + "The " + car2 + " has reached the goal!" + "\u001B[0m");
            }
        }

    }

}
