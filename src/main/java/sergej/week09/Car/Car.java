package sergej.week09.Car;

import java.util.Random;

public class Car {

    private Random random = new Random();

    private String manufatcurer;
    private String modell;
    private int power;
    private int fueltank;
    private int weight;

    private enum DRIVE_TYPE {GASOLINE, DIESEL, ELECTRIC}

    public Car(String manufatcurer, String modell, int power, int fueltank, int weight) {
        this.manufatcurer = manufatcurer;
        this.modell = modell;
        this.power = power;
        this.fueltank = fueltank;
        this.weight = weight;
    }

    public void drive(int kilometer) {
        float litrePer100Km = (weight * 0.004f + 0.02f * power) / 100;
        float distanceTravelled = fueltank / litrePer100Km;
        float kmToGo = kilometer - distanceTravelled;

        float tempTank = 0;

        for (int i = 0; i < kilometer; i++) {
            tempTank += litrePer100Km;
            if (i % random.nextInt(1, 25) == 0) {
                System.out.println("You travelled " + i + "km so far u still got " + (fueltank - tempTank) + "l of your tank left" + "(fuel consumption " + i * litrePer100Km + "l)");
                System.out.println("you still got " + (kilometer - i) + "km to go to reach your goal");
            }

            if (fueltank - tempTank <= 0) {
                System.out.println("YOu ran out of fuel you still have " + (kilometer - i) + "km to go!");
                fueltank = refuel();
                tempTank = 0;
                System.out.println("You refuelled " + fueltank);
            }

        }

        System.out.println("The " + manufatcurer + " " + modell + " drove " + kilometer + "km");

    }

    public int getFueltank() {
        return fueltank;
    }

    public int refuel() {
        fueltank = random.nextInt(50);
        return fueltank;
    }
}
