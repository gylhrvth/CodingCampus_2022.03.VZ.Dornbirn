package arda.week09;

import java.util.Random;

public class Engine {
    private static Random rand = new Random();
    private int condition;

    public Engine(int condition) {
        this.condition = condition;
    }

    public boolean isEngineBroken() {
        if (rand.nextInt(2) + 1 == 1) {
            condition = Math.max(0, condition - rand.nextInt(100));
        }
        return (condition == 0);
    }
}
