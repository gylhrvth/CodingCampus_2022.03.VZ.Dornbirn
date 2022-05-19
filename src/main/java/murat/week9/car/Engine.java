package murat.week9.car;

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
        int randomNumber = rand.nextInt(0, 5000);

        double condition = (1.0 / kmDriven);
        System.out.printf("%d, %.2f",randomNumber, condition);
        System.out.println(" " + (1/2));

        if (randomNumber < condition) {
            isEngineDefect = true;
            System.out.println("Engine is defect!");
        }
        return isEngineDefect;
    }
}
