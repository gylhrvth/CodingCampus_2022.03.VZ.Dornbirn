package cemil.week10.carSimulation;

public class Car {
    private String name;
    private String model;
    private int hP;
    private int weight;
    private int tankCapacity;
    private int driveToLeft = 0;
    private int tankRefill;


    private enum FUEL {
        PETROL,
        DIESEL,
        GAS,
        ELECTRIC
    }

    public Car(String name, String model, int hP, int weight, int tankCapacity) {
        this.name = name;
        this.model = model;
        this.hP = hP;
        this.weight = weight;
        this.tankCapacity = tankCapacity;
        tankRefill = tankCapacity;
    }

    public int drive(int km) {
        int driving = 0;
        float a = 0.00004f;
        float b = 0.0002f;
        float fluelperKm = a * weight + b * hP;
        while (km > 0 && tankCapacity > fluelperKm) {
            ++driving;
            --km;

        }
        System.out.println(getName() + " has driving " + (driving - tankCapacity) + " km with " + tankCapacity + " Liter " + fluelperKm);


        return driving;

    }

    public void refill() {
        tankCapacity = tankRefill;
        System.out.println(name + model);
    }

    public String getName() {
        return name;
    }
    //    @Override
//    public String toString() {
//        String output = "";
//        output += name + " ";
//        output += model + " ";
//        output += ",Horspower: " + hP + " ";
//        output += ",Weight: " + weight + " ";
//        output += ",Tank Capacity: " + tankCapacity + " ";
//        output += ",Fuel = " + FUEL.DIESEL;
//        return output;
//    }
}
