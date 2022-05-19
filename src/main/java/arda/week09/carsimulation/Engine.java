package arda.week09.carsimulation;

import java.util.Random;

public class Engine {
    private static Random rand = new Random();
    private int condition;
    private int chance;

    public Engine(int condition) {
        this.condition = condition;
    }

    public boolean isEngineBroken(int chance) {
        if (rand.nextInt(chance) + 1 == 1) {
            condition = Math.max(0, condition - rand.nextInt(100));
        }
        return (condition == 0);
    }
}
