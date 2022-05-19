package sergej.week09.CarNew;


public class Tank {

    private float capacity;
    private float content;


    public Tank(int capacity) {
        this.capacity = capacity;
        this.content = capacity;

    }


    public float getCapacity() {
        return capacity;
    }



    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getFuelContent() {
        return content;
    }

    public void setFuelContent(float fuelContent) {
        this.content = fuelContent;
    }


    public int consumeFuel(int kilometer, Car car) {
        int possibleDistance = 0;

        float literPerKm = (0.004f * car.getWeight() + 0.02f * car.getEngine().getkW()) / 100;
        possibleDistance = (int) Math.floor( content / literPerKm);
        int actualDrivingDistance = Math.min(kilometer, possibleDistance);
         content -= (literPerKm * actualDrivingDistance);

        return actualDrivingDistance;

    }

}
