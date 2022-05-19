package timo.week09.Car;

public class RepairStation {


    public RepairStation() {

    }


    public Engine replaceEngine (Car car) {
        Engine newEngine = new Engine("Replacement engine", car.getEngine().getkW());
        car.setEngine(newEngine);
        System.out.println("The engine has been replaced!");
        return newEngine;
    }


}
