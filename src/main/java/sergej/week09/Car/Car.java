package sergej.week09.Car;

import java.util.Random;

public class Car {

    private Random random = new Random();

    String manufatcurer;
    private String modell;
    private Engine engine;
    private Fueltank fueltank;
    private int weight;

    private enum DRIVE_TYPE {GASOLINE, DIESEL, ELECTRIC}

    public Car(String manufatcurer, String modell, Engine engine, Fueltank fueltank, int weight) {
        this.manufatcurer = manufatcurer;
        this.modell = modell;
        this.weight = weight;
        this.engine = engine;
        engine.setCar(this);
        this.fueltank = fueltank;
    }

    public void drive(int kilometer) {
        //float litrePer100Km = (weight * 0.004f + 0.02f * engine.getPower()) / 100;
        //float distanceTravelled = fueltank.getCapacity() / litrePer100Km;
        //float kmToGo = kilometer - distanceTravelled;

        float tempTank = 0;

        for (int i = 0; i < kilometer; i++) {
           // tempTank += litrePer100Km;
            engine.drive(i, kilometer);
            if(engine.motorCheck()== Engine.ENGINE_STATE.BROKEN){
                break;
            }
        }
           /* engine.setMileage(i);
            if (random.nextInt(100) <= engine.getMileage()/1000) {
                engine.setEnginestate(Engine.ENGINE_STATE.BROKEN);
                System.out.println(engine.getMileage());
                System.out.println("Your engine Broke!");
                break;
            }
            if (i % random.nextInt(1, 25) == 0) {
                System.out.println(manufatcurer + " travelled " + i + "km so far u still got " + (fueltank.getCapacity() - tempTank) + "l of your tank left" + "(fuel consumption " + i * litrePer100Km + "l)");
                System.out.println("you still got " + (kilometer - i) + "km to go to reach your goal");
                System.out.println("Yor engines mileage is:" + engine.getMileage());
            }

            if (fueltank.getCapacity() - tempTank <= 0) {
                System.out.println(manufatcurer + " ran out of fuel you still have " + (kilometer - i) + "km to go!");
                fueltank.setCapacity(refuel());
                tempTank = 0;
                System.out.println("You refuelled " + fueltank.getCapacity() + " litres");
            }

        }

        System.out.println("The " + manufatcurer + " " + modell + " drove " + kilometer + "km");

    }*/
    }

    public int refuel() {
        return fueltank.setCapacity(random.nextInt(50));

    }

    public int getWeight() {
        return weight;
    }
}
