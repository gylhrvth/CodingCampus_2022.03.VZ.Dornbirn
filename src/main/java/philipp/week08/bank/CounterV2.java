package philipp.week08.bank;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class CounterV2 {
    Random rn = new Random();

    public enum COUNTER_STATUS {
        FREE,
        SERVICE,
        REFILL,
        COFFEE_BREAK
    }

    private String name;
    private int moneyCounter;
    int counterBreakTime = 0;
    private List<Customer> stats = new Vector<>();
    private COUNTER_STATUS counterStatus;


    public CounterV2(String name, int moneyStart, COUNTER_STATUS counterStatus) {
        this.name = name;
        this.moneyCounter = moneyStart;
        this.counterStatus = COUNTER_STATUS.FREE;

    }

    public String getName() {
        return name;
    }

    public COUNTER_STATUS getCounterStatus() {
        return counterStatus;
    }

    public void setCounterStatus(Customer customer) {
        switch (counterStatus) {
            case FREE:
                if (moneyCounter < customer.getMoney() && !customer.getDeposit()) {
                    System.out.println(customer.getName() + " wants to go to " + name + ", but");
                    System.out.println("\033[0;33m" + name + " has not enough money and will be refilled." + "\033[0m");
                    System.out.println();
                    counterStatus = COUNTER_STATUS.REFILL;
                } else {
                    stats.add(new Customer(customer.getName(), customer.getMoney(), customer.getDeposit()));
                    moneyBusiness(customer);
                    counterStatus = COUNTER_STATUS.SERVICE;
                }
                break;
            case SERVICE:
                if (counterBreakTime >= 1) {
                    counterStatus = COUNTER_STATUS.FREE;
                    counterBreakTime = 0;
                    moneyBusiness(customer);
                    setCounterToBreak();
                } else {
                    System.out.println("\033[0;35m" + name + " has a client." + "\033[0m");
                }

                break;
            case REFILL:
                this.moneyCounter = 1000;
                if (counterBreakTime >= 2) {
                    counterStatus = COUNTER_STATUS.FREE;
                    counterBreakTime = 0;
                    moneyBusiness(customer);
                } else {
                    System.out.println("\033[0;34m" + name + " is being refilled." + "\033[0m");
                }


                break;
            case COFFEE_BREAK:
                if (counterBreakTime >= 4) {
                    System.out.println("\033[0;32m" + name + " is reopened." + "\033[0m");
                    counterStatus = COUNTER_STATUS.FREE;
                    counterBreakTime = 0;
                    moneyBusiness(customer);
                } else {
                    System.out.println("\033[0;31m" + name + " is closed for a coffee break." + "\033[0m");
                }
                break;
            default:
                break;
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

    public void setCounterToBreak() {
        if (Math.random() >= 0.8) {
            System.out.println("\033[0;31m" + name + " has closed for a coffee break." + "\033[0m");
            System.out.println();
            counterStatus = COUNTER_STATUS.COFFEE_BREAK;
        }
    }

    public void counterState() {
        if (counterStatus != COUNTER_STATUS.FREE) {
            counterBreakTime = counterBreakTime + 1;
        }
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
