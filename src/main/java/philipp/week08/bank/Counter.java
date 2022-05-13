package philipp.week08.bank;

import java.util.Random;

public class Counter {
    Random rn = new Random();

    private String name;
    private double moneyCounter;
    private boolean counterOpen;

    public Counter(String name, double moneyStart, boolean counterOpen) {
        this.name = name;
        this.moneyCounter = moneyStart;
        this.counterOpen = counterOpen;
    }

    public String getName() {
        return name;
    }

    public double getMoneyCounter() {
        return moneyCounter;
    }

    public boolean getCounterOpen() {
        return counterOpen;
    }

    public void moneyBusiness(Customer c) {
        if (c.getDeposit()) {
            moneyCounter = moneyCounter + c.getMoney();
            System.out.println(c.getName() + " deposited " + c.getMoney() + " Eur at " + name);
            System.out.println(name + " has now " + moneyCounter + " Eur.");
        } else {
            moneyCounter = moneyCounter - c.getMoney();
            System.out.println(c.getName() + " took " + c.getMoney() + " Eur from " + name);
            System.out.println(name + " has now " + moneyCounter + " Eur.");
        }
        System.out.println();
        c.setMoney(0);
    }

    public boolean chanceOfClosing() {
        if (3 == rn.nextInt(6)) {
            counterOpen = false;
        }
        return true;
    }

}
