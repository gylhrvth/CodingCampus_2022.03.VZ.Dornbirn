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

        CrapCar crap1 = new CrapCar("Vw","Golf",engine2,bat1,1200);

        AeroCar aero1 = new AeroCar("Aston Martin","Valkire",engine,tank1,1000);


        int kmGoal = 10000;
        simulate(car1,kmGoal,repairStation);
        simulate(car2,kmGoal,repairStation);
        simulate(crap1,kmGoal,repairStation);
        simulate(aero1,kmGoal,repairStation);


    }

    public static void simulate(Car car, int kmGoal, RepairStation repairStation) {
        while (kmGoal > 0) {
            int km = car.startDrive2(kmGoal);
            System.out.println("The " + car + " has driven " + km + " km distance.");
            if (car.isBroken()) {
                repairStation.replaceEngine(car);
            }
            kmGoal -= km;
            Tank t = car.getTank();
            if (t.getFuelContent() < 0.1 * t.getCapacity()) {
                car.refuel();
            }
            if (kmGoal <= 0) {
                System.out.println("\u001B[32m" + "The " + car + " has reached the goal!" + "\u001B[0m");
            }
        }

    }

}
