package timo.week09.Car;

public class RepairStation {


    public RepairStation() {


    }


    public Engine replaceEngine (Engine engine) {
        engine = new Engine("Replacement engine", engine.getkW());
        System.out.println("The engine has been replaced!");
        return engine;
    }


}
