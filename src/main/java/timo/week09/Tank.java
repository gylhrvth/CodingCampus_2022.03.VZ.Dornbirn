package timo.week09;

public class Tank {
    private float capacity;
    private float content;



    public Tank(float capacity) {
        this.capacity = capacity;
        this.content = capacity;

    }


    public float getCapacity() {
        return capacity;
    }

    public float getContent() {
        return content;
    }

    public void setContent(float content) {
        this.content = content;
    }


    public int consumeFuel(int kilometer, Car car) {
        int possibleDistance = 0;

       // float literPerKm = (0.004f * car.getWeight() + 0.02f * car.getEngine().getkW()) / 100;
        possibleDistance = (int) Math.floor(content / car.getLiterPerKm());
        int actualDrivingDistance = Math.min(kilometer, possibleDistance);
        content -= (car.getLiterPerKm() * actualDrivingDistance);

        return actualDrivingDistance;

    }


}
