package sergej.week09.CarNew;

public class Battery extends Tank {


    public Battery(int capacity) {
        super(capacity);

    }

    @Override
    public int consumeFuel(int kilometer, Car car) {
        int possibleDistance = 0;

        float kwPerKm = (0.004f * car.getWeight() + 0.02f * car.getEngine().getkW()) / 100;

        possibleDistance = (int) Math.floor(getFuelContent() / kwPerKm);
        int actualDrivingDistance = Math.min(kilometer, possibleDistance);
        setFuelContent(getFuelContent() - (kwPerKm * actualDrivingDistance));


        return actualDrivingDistance;

    }


}
