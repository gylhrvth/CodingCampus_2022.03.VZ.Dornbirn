package sergej.week09.CarNew;


public class Tank {

    private int fuelCapacity;
    private int fuelContent;


    public Tank(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        this.fuelContent = fuelCapacity;

    }


    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelContent() {
        return fuelContent;
    }

    public void setFuelContent(int fuelContent) {
        this.fuelContent = fuelContent;
    }


    public int consumeFuel(int kilometer, Car car) {
        int possibleDistance = 0;

        float literPerKm = (0.004f * car.getWeight() + 0.02f * car.getEngine().getkW()) / 100;
        possibleDistance = (int) Math.floor(fuelCapacity / literPerKm);
        int remainingKm = kilometer - possibleDistance;
        int tempTank = 0;
        for (int i = 0; i < kilometer; i++) {
            tempTank += literPerKm;

            if (fuelCapacity - tempTank <= 0) {
                System.out.println(car.getBrand() + " ran out of fuel you still have " + (kilometer - i) + "km to go!");
                fuelContent = car.refuel();
                tempTank = 0;
                System.out.println("You refuelled " + fuelCapacity + " litres");
            }

            if (possibleDistance > kilometer) {
                fuelContent -= literPerKm * kilometer;
                System.out.println("The " + car.getBrand() + " " + car.getModel() + " drove " + kilometer + "km. Fuel consumption = " + literPerKm + "l/km.");
            } else {
                fuelContent -= literPerKm * kilometer;
                System.out.println("The " + car.getBrand() + " " + car.getModel() + " was able to drive " + possibleDistance + "km (from " + kilometer + "km). Fuel consumption = " + literPerKm + "l/km");
                System.out.println("Remaining km: " + remainingKm);
            }
        }
        return possibleDistance;

    }

}
