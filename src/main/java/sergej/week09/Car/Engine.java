package sergej.week09.Car;

import java.util.Random;

public class Engine {

    Random random = new Random();

    private String name;
    private int power;
    private int mileage;


    public enum ENGINE_STATE {BROKEN, RUNNING, START, STOP}

    private ENGINE_STATE enginestate = ENGINE_STATE.STOP;
    private Car car = null;
    private Fueltank fueltank = null;


    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
        this.mileage = 0;


    }

    public void drive(int i,int kilometer) {
        float litrePer100Km = (car.getWeight() * 0.004f + 0.02f * power) / 100;
        float distanceTravelled = fueltank.getCapacity() / litrePer100Km;
        float tempTank = 0;
        tempTank += litrePer100Km;
        setMileage(i);
        if (random.nextInt(100) <= getMileage() / 1000) {
            setEnginestate(Engine.ENGINE_STATE.BROKEN);
            System.out.println(getMileage());
            System.out.println("Your engine Broke!");

        }
        if (i % random.nextInt(1, 25) == 0) {
            System.out.println(car.manufatcurer + " travelled " + i + "km so far u still got " + (fueltank.getCapacity() - tempTank) + "l of your tank left" + "(fuel consumption " + i * litrePer100Km + "l)");
            System.out.println("you still got " + (kilometer - i) + "km to go to reach your goal");
            System.out.println("Yor engines mileage is:" + getMileage());
        }

    }

    public Engine.ENGINE_STATE motorCheck() {
        return enginestate;
    }

    public void setEnginestate(ENGINE_STATE enginestate) {
        this.enginestate = enginestate;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setFuelTank(Fueltank fueltank) {
        this.fueltank = fueltank;
    }
}
