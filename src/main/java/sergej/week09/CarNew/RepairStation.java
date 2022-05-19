package sergej.week09.CarNew;



public class RepairStation {

    public RepairStation() {

    }


    public Engine replaceEngine (Engine engine) {
        engine = new Engine("Replacement engine", engine.getkW());
        System.out.println("The engine has been replaced!");
        return engine;
    }

}
