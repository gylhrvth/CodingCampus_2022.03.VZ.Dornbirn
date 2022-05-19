package aron.week09.carsim;

public class Car {

    private String name;
    private String model;
    private int kw;
    private int fueltank;
    private float currentTankContent;
    private String drivetyp;
    private int weight;

    public Car(String name, String model, int kw, int fueltank, String drivetyp, int weight) {

        this.name = name;
        this.model = model;
        this.kw = kw;
        this.fueltank = fueltank;
        this.currentTankContent = fueltank;
        this.drivetyp = drivetyp;
        this.weight = weight;
    }

    public int drive(int kilometer){
        float litrePerKm = (weight * 0.004f + 0.02f * kw) / 100;
        int maxTravelDistance = (int)(currentTankContent / litrePerKm);
        int actualDrivingDistance = Math.min(kilometer, maxTravelDistance);

        currentTankContent -= (actualDrivingDistance * litrePerKm);
        return actualDrivingDistance;
    }


    @Override
    public String toString() {
        return name + " / " + model;
    }

    public void refill() {
        System.out.println(this + " tanks " + (fueltank - currentTankContent) + "l fuel.");
        currentTankContent = fueltank;
    }
}
