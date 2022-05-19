package sergej.week09.CarNew;

public class Battery extends Tank {

    int content;

    public Battery(int capacity) {
        super(capacity);
        this.content = capacity;
    }

    @Override
    public int consumeFuel(int kilometer, Car car) {
        int possibleDistance = 0;

        float kwPerKm = (0.004f * car.getWeight() + 0.02f * car.getEngine().getkW());

        possibleDistance = (int) Math.floor(content / kwPerKm) * 100;
        int actualDrivingDistance = Math.min(kilometer, possibleDistance);
        content -= (kwPerKm * actualDrivingDistance);

        return actualDrivingDistance;

    }

}
