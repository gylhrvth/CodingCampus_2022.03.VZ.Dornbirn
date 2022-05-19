package sergej.week09.CarNew;

public class CrapCar extends Car {

    public CrapCar(String brand, String model, Engine engine, Tank tank, int weight) {
        super(brand, model, engine, tank, weight);
    }

    @Override
    public int startDrive2(int kilometer) {
        System.out.println("The " + brand + " " + model + " is driving...");
        int kmDriven = 0;
        int mileage = engine.getMotorKm();
        for (int i = 0; i <= kilometer; i++) {
            kmDriven++;
            mileage++;
            if (tank.consumeFuel(1, this) == 1) {
                if (random.nextInt(10000) <= mileage) {
                    engine.setBroken();
                    System.out.println("\u001B[31m" + "Your engine broke at " + mileage + "km" + "\u001B[0m");
                    break;
                }
            } else {
                System.out.println("Tank is empty");
                break;
            }
        }
        return kmDriven;
    }
}
