package zah.week09.carSimulator;

public class RepairStation {

    public void repairCar(Car car) {
        System.out.println("I am working on this car....");
        car.replaceEngine(new Engine("M640", 250, 0));
        System.out.println("Car is fixed");
    }

}
