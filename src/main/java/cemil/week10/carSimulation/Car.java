package cemil.week10.carSimulation;

public class Car {
    private String name;
    private String model;
    private int hP;
    private int tankCapacity;

    private enum FUEL {
        PETROL,
        DIESEL,
        GAS,
        ELECTRICITY
    }

    public Car(String name, String model, int hP, int tankCapacity) {
        this.name = name;
        this.model = model;
        this.hP = hP;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String toString() {
        String output = "";
        output += name + " ";
        output += model + " ";
        output += ",Horspower: " + hP + " ";
        output += ",Tank Capacity: "+tankCapacity + " ";
        output += ",Fuel = " + FUEL.DIESEL;
        return output;
    }
}
