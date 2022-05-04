package philipp.week07.carSimulation;


public class MainCarSimulation {

    public static void main(String[] args) {
        Car ford = new Car("Ford", "Mustang", 200, 60, 1500);

        System.out.println(ford);
        System.out.println("-----");
        driveCar(120,ford);

    }

    private static void driveCar(int kilometer, Car driving) {
        float totalFuelUsage = kilometer * Car.fuelUsagePerKm(driving.getkW(), driving.getWeight());
        driving.setFuelTank(driving.getFuelTank() - totalFuelUsage);

        System.out.println(totalFuelUsage);
        System.out.println(driving);

    }
}
