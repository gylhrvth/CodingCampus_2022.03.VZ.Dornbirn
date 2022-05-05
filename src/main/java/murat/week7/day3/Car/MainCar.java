package murat.week7.day3.Car;

import murat.week7.day3.Car.Car;

public class MainCar {

    public static void main(String[] args) {

        Car ford = new Car("Ford", "Mustang", 200, 60, 1500);

        System.out.println(ford);
        System.out.println("-----");
        driveCar(120, ford);
    }

    private static void driveCar(int kilometer, Car aCar) {

        float totalFuelUsage = kilometer * Car.fuelUsagePerKm(aCar.getkW(), aCar.getWeight());
        aCar.setFuelTank(aCar.getFuelTank() - totalFuelUsage);
        System.out.println("Remaining fuel: " + aCar.getFuelTank());

        if (aCar.getFuelTank() == 0) {
            System.out.println("Fuel tank is empty!");
        }else{
            System.out.println("You drove " + (aCar.getFuelTank() - totalFuelUsage) );
        }


    }
}
