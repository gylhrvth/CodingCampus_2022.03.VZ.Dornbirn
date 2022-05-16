package murat.week9;

import murat.Colors;

import java.util.List;
import java.util.Random;

public class Counter {
    private int counterNumber;

    private boolean free;

    private float moneyAvailable;

    public Counter(int counterNumber, boolean free, float moneyAvailable) {

        this.counterNumber = counterNumber;
        this.free = free;
        this.moneyAvailable = moneyAvailable;
    }

    public int getCounterNumber() {

        return counterNumber;
    }

    public boolean isFree() {

        return free;
    }

    public float getMoneyAvailable() {

        return moneyAvailable;
    }

    public void setCounterNumber(int counterNumber) {

        this.counterNumber = counterNumber;
    }

    public void setFree(boolean free) {

        this.free = free;
    }

    public void setMoneyAvailable(float moneyAvailable) {

        this.moneyAvailable = moneyAvailable;
    }

    @Override
    public String toString() {

        return Colors.ANSI_BLUE + counterNumber + " " + free + " " + moneyAvailable + Colors.ANSI_RESET;
    }

    public void transactionACustomerAtACounter(Customer cus) {

        if (isFree()) {

            // If customer pays
            if (cus.isPayOrWithdraw()) {
                setMoneyAvailable(getMoneyAvailable() + cus.getMoney());
            } else {
                setMoneyAvailable(getMoneyAvailable() - cus.getMoney());
            }
        }
    }

    public static boolean allCountersAreOccupied(List<Counter> counters) {

        boolean allCountersOccupied = true;

        for (int i = 0; i < counters.size(); i++) {
            if (counters.get(i).isFree()) {
                allCountersOccupied = false;
            }
        }

        return allCountersOccupied;
    }

    public boolean thereIsNoMoneyAtACounter(Customer cus) {

        boolean thereIsNoMoney = false;

        // If customer withdraws and there is no money at the counter
        if ((this.getMoneyAvailable() - cus.getMoney() <= 0) && !cus.isPayOrWithdraw()) {
            thereIsNoMoney = true;
        }
        return thereIsNoMoney;
    }

    public boolean takeABreak() {

        Random rand = new Random();
        boolean breakTime = false;
        int randomNumber = rand.nextInt(10);

        if (randomNumber <= 2) {
            breakTime = true;
        }
        return breakTime;
    }
}
