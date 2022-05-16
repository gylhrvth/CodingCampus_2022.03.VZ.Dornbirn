package arda.week08.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer {
    private Random rand = new Random();
    private String customerName;
    private int cash;
    private int cashInBank;
    private Bank bank;
    static final String RESET = "\033[0m";
    public static final String WHITE = "\033[0;97m";
    static final String CYAN = "\033[1;36m";
    static final String RED = "\033[1;31m";
    //    private List<Counter> counters = new ArrayList<>();
    private Counter counter = null;

    public Customer(Bank bank, String customerName, int cash, int cashInBank) {
        this.customerName = customerName;
        this.cash = cash;
        this.cashInBank = cashInBank;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void simulateDay(int daysToSimulate) {
        goToCounter();
        withdrawOrDeposit();
        counter.refillMoney();
        leaveCounter();
    }

    public void enterBank(Bank bank) {
        if (!bank.getCustomers().contains(this)) {
            bank.getCustomers().add(this);
            //System.out.println(customerName + " has entered the bank.");
        } else {
            System.out.println("customer could not enter bank.");
        }
    }

    public void goToCounter() {
        Counter counter = bank.getNextFreeCounter();
        if (counter != null) {
            this.counter = counter;
            counter.addCustomer(this);
            System.out.println();
            System.out.println(customerName + " is at counter" + counter.getCounterNumber() + ".");
        }
    }

    public void leaveCounter() {
        if (counter != null) {
            counter.removeCustomer(this);
            System.out.println(customerName + " has left counter" + counter.getCounterNumber() + ".");

        }
    }

    public void withdrawOrDeposit() {
        int random = rand.nextInt(2) + 1;
        if (counter != null) {
            if (random == 1) {
                //withdraw money.
                int withdrawnMoney = counter.getMoneyInCounter() - rand.nextInt(cashInBank) + 5;
                System.out.println(customerName + " has withdrawn " + RED + withdrawnMoney + "€" + RESET + " at counter" + counter.getCounterNumber() + ".");
                System.out.println("counter" + counter.getCounterNumber() + " has " + counter.getMoneyInCounter() + "€ left.");
            } else {
                //deposit money.
                int depositedMoney = counter.getMoneyInCounter() + rand.nextInt(cash) + 5;
                System.out.println(customerName + " has deposited " + RED + depositedMoney + "€" + RESET + " at counter" + counter.getCounterNumber() + ".");
                System.out.println("counter" + counter.getCounterNumber() + " has " + counter.getMoneyInCounter() + "€ left.");
            }
        }
    }
}
