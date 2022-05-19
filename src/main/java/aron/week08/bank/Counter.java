package aron.week08.bank;


import java.util.Random;

public class Counter {
    Random random = new Random();
    private String name;
    private int amount;
    private int maxCapacity;
    private boolean Break;
    private Bank bank;
    private int value;



    public Counter(Bank bank, String name, int maxCapacity) {
        this.name = name;
        this.amount = maxCapacity;
        this.maxCapacity = maxCapacity;
        this.bank = bank;
        this.value = value;
    }


    public int fillCounter() {
        if (amount == 0) {
            amount = maxCapacity;
            Break = true;
        }

        return amount;
    }

    public Counter depositToCounter(int value) {
        Counter counter = this;
        if (value + amount <= maxCapacity && !counter.Break) {
            amount += value;
        } else {
            for (Counter c : bank.counters()) {
                if (value + c.getCapacity() <= c.getMaxCapacity() && !c.Break) {
                    counter = c;
                    return counter;
                }

            }
        }

        return counter;
    }


    public Counter withdrawFromCounter(int value) {
        Counter counter = this;
        if (value <= amount && !counter.Break) {
            amount -= value;
        } else {
            for (Counter c : bank.counters()) {
                if (value<= c.getCapacity() && !c.Break) {
                    counter = c;
                    return counter;
                }

            }
        }
        return counter;
    }

    public int getCapacity() {
        return amount;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int zero() {
        amount = 0;
        return amount;
    }

    public boolean getBreak() {
        return Break;
    }

    @Override
    public String toString() {
        return"\033[0;31m"+ "name='" + name + '\'' + ", amount=" + amount + ", Break=" + Break+"\n" +"\033[0m";
    }
}
