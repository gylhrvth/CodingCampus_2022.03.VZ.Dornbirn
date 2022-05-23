package cemil.week10.carSimulation;

import java.util.Random;

public class RepairStation {
    private static Random RAND = new Random();

    public void repairCar(Car car) {
        System.out.println("I am working on ..." + car.getName());
        car.replaceEngine(RAND.nextInt(7) + 3, RAND.nextInt(1001 - 300) + 300);
//        car.replaceEngine(RAND.nextInt(7) + 3, RAND.nextInt(1001 - 300) + 300);
        System.out.println("Car is fixed!!!");
    }

}
