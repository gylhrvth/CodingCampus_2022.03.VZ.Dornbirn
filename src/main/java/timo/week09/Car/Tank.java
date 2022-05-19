package timo.week09.Car;

public class Tank {
    private float fuelCapacity;
    private float fuelContent;



    public Tank(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        this.fuelContent = fuelCapacity;

    }


    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public float getFuelContent() {
        return fuelContent;
    }

    public void setFuelContent(float fuelContent) {
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
