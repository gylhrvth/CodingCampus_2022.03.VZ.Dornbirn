package timo.week09;

public class Battery extends Tank {

    public Battery(float capacity) {
        super(capacity);
    }


    @Override
    public int consumeFuel(int kilometer, Car car) {
        int possibleDistance = 0;

        float kwPerKm = (0.004f * car.getWeight() + 0.02f * car.getEngine().getkW()) / 100; // per 100
        possibleDistance = (int) Math.floor(getContent() / kwPerKm);
        int actualDrivingDistance = Math.min(kilometer, possibleDistance);
        setContent(getContent() - (kwPerKm * actualDrivingDistance));

        return actualDrivingDistance;

    }
}
