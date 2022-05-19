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
        possibleDistance = (int) Math.floor(fuelContent / literPerKm);
        int actualDrivingDistance = Math.min(kilometer, possibleDistance);
        fuelContent -= (literPerKm * actualDrivingDistance);

        return actualDrivingDistance;

    }

}
