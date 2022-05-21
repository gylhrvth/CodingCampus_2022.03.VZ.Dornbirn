package philipp.week09.carSimulation;

public class RepairStation {

    private String name;


    public RepairStation(String name) {
        this.name = name;
    }

    public void changeEngine(Car carToRepair, float kmToDistance){
        if(carToRepair.getEngine().getEngineState()== Engine.EngineState.BROKEN){
            carToRepair.setEngine(new Engine("Engine 02"));
            System.out.println("\u001B[36m" +"The engine has been replaced by "+name+"\u001B[0m");
            System.out.println("+++");
        }
    }


}
