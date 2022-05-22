package murat.week9.car;

import murat.Colors;

import java.util.Random;

public class Engine {

    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }

    public static boolean possibilityOfADefectedEngine(int kmDriven) {

        boolean isEngineDefect = false;
        Random rand = new Random();
        int randomNumber = rand.nextInt(0, 5000000);

        /* float condition = (float)((1.0-(1.0 / kmDriven))*1000);   // Another method
         System.out.printf("%d, %d",randomNumber, kmDriven);*/

        if (randomNumber < kmDriven) {
            isEngineDefect = true;
        }
        return isEngineDefect;
    }
}
