package philipp.week08.bank;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Counter {
    Random rn = new Random();

    private String name;
    private int moneyCounter;
    private boolean counterOpen;
    private boolean counterRefill = false;
    int counterRefillTime = 0;
    private boolean counterBreak = false;
    int counterBreakTime = 0;
    private List<Customer> stats = new Vector<>();


    public Counter(String name, int moneyStart, boolean counterOpen) {
        this.name = name;
        this.moneyCounter = moneyStart;
        this.counterOpen = counterOpen;

    }

    @Override
    public String toString() {
        return "Counter{" +
                " name='" + name + '\'' +
                ", moneyCounter=" + moneyCounter +
                ", counterOpen=" + counterOpen +
                ", counterRefill=" + counterRefill +
                ", counterRefillTime=" + counterRefillTime +
                ", counterBreak=" + counterBreak +
                ", counterBreakTime=" + counterBreakTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean getCounterOpen() {
        return counterOpen;
    }

    public void addCustomerStats(Customer co) {
        stats.add(co);
    }

    public List<Customer> getStats() {
        return stats;
    }
    //    public boolean getCounterRefill() {
//        return counterRefill;
//    }
//
//    public boolean getCounterBreak() {
//        return counterBreak;
//    }
//
//    public void setCounterRefillTime(int counterRefillTime) {
//        this.counterRefillTime = counterRefillTime;
//    }
//
//    public int getCounterRefillTime() {
//        return counterRefillTime;
//    }
//
//    public void setCounterBreakTime(int counterBreakTime) {
//        this.counterBreakTime = counterBreakTime;
//    }
//
//    public int getCounterBreakTime() {
//        return counterBreakTime;
//    }

    public void setCounterToBreak() {
        if (Math.random() >= 0.8) {
            //if (3 == rn.nextInt(5)) {
//            if (true) {
            System.out.println("\033[0;31m" + name + " has closed for a coffee break." + "\033[0m");
            System.out.println();
            counterBreak = true;
            counterOpen = false;
        }
    }

    public void moneyBusiness(Customer c) {
        if (c.getDeposit()) {
            moneyCounter = moneyCounter + c.getMoney();
            System.out.println(c.getName() + " deposited " + c.getMoney() + " Eur at " + name);
            System.out.printf("%s %s %d %s\n", name, " has now ", moneyCounter, " Eur.");
        } else {
            moneyCounter = moneyCounter - c.getMoney();
            System.out.println(c.getName() + " took " + c.getMoney() + " Eur from " + name);
            System.out.println(name + " has now " + moneyCounter + " Eur.");
        }
        System.out.println();
        c.setMoney(0);
    }

    public boolean checkNoMoney(Customer customer) {
        if (moneyCounter < customer.getMoney() && !customer.getDeposit()) {
            System.out.println(customer.getName() + " wants to go to " + name + ", but");
            System.out.println("\033[0;33m" + name + " has not enough money and will be refilled." + "\033[0m");
            System.out.println();
            counterRefill = true;
            counterOpen = false;
            return false;
        }
        return true;
    }

    public void checkIfOnBreakForRefill() {
        if (counterRefill) {
            this.moneyCounter = 1000;
            if (counterRefillTime >= 2) {
                System.out.println("\033[0;34m" + name + " has been refilled." + "\033[0m");
//                System.out.println();
                counterRefill = false;
                counterOpen = true;
                counterRefillTime = 0;
                counterBreakTime = 0;
            }
        }
    }

    public void checkIfOnBreak() {
        if (counterBreak && counterBreakTime >= 4) {
            System.out.println("\033[0;32m" + name + " is reopened." + "\033[0m");
//            System.out.println();
            counterBreak = false;
            counterOpen = true;
            counterBreakTime = 0;
            counterRefillTime = 0;
        }

    }

    public void counterState() {
        if (counterRefill) {
            counterRefillTime = counterRefillTime + 1;
        }
        if (counterBreak) {
            counterBreakTime = counterBreakTime + 1;
        }
        checkIfOnBreakForRefill();
        checkIfOnBreak();
    }

    public void statistic() {
        System.out.println(name);
        for (Customer stat : stats) {
            System.out.print(stat.getName());
            System.out.println(" (" + stat.getMoney() + ", " + ((stat.getDeposit()) ? "Deposit)" : "Withdrawal)"));
        }
        System.out.println();

    }
}

