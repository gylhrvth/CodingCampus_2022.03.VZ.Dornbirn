package zah.week09.bank;

import java.util.Vector;

public class Bank {
    private String name;
    private Vector<Customer> customers;
    private Vector<BankCounter> bankCounters;

    public Bank(String name) {
        this.name = name;
        this.bankCounters = new Vector<>();
        this.customers = new Vector<>();
    }

    public void addBankCounter(BankCounter bankCounter) {
        if (!bankCounters.contains(bankCounter)) {
            bankCounters.add(bankCounter);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (Customer c : customers) {
            builder.append(System.lineSeparator());
            c.toString(builder);
        }

        for (BankCounter bc : bankCounters) {
            builder.append(System.lineSeparator());
            builder.append(bc.toString());
        }

        return builder.toString();
    }
}
