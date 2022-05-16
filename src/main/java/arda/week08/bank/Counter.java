package arda.week08.bank;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    static final String RESET = "\033[0m";
    static final String RED = "\033[0;91m";
    public static final String WHITE = "\033[0;97m";

    private int counterNumber;
    private int moneyInCounter;
    private Customer customer = null;

    public Counter(int counterNumber, int moneyInCounter) {
        this.counterNumber = counterNumber;
        this.moneyInCounter = moneyInCounter;
    }

    public void refillMoney() {
        if (moneyInCounter == 0) {
            moneyInCounter += 500;
        }
    }

    public boolean isAvailable() {
        if ((customer == null) && moneyInCounter != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    public void removeCustomer(Customer customer){
        if (this.customer == customer){
            this.customer = null;
        }
    }

    public int getCounterNumber() {
        return counterNumber;
    }

    public int getMoneyInCounter() {
        return moneyInCounter;
    }

    @Override
    public String toString() {
        String output = "";
        output = "\nCounter" + counterNumber + "\n" + "     moneyInCounter: " + WHITE + moneyInCounter + "€" + RESET +
                "\n" + "        customers at counter: ";
        if (customer != null) {
            output += customer + "\n";
        }
        return output;
    }
}
