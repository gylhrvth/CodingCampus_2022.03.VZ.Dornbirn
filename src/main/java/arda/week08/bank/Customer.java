package arda.week08.bank;

import java.util.Random;

public class Customer {
    static final String RESET = "\033[0m";
    public static final String WHITE = "\033[0;97m";
    static final String CYAN = "\033[1;36m";
    static final String RED = "\033[1;31m";

    private Random rand = new Random();
    private String customerName;
    private int cash;
    private int cashInBank;
    private Bank bank;
    private Counter counter;

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

    public int getCashInBank() {
        return cashInBank;
    }

    public int getCash() {
        return cash;
    }

}