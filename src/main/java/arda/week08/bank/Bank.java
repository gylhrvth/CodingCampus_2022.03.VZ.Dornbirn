package arda.week08.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    static final String RESET = "\033[0m";
    public static final String WHITE = "\033[0;97m";
    static final String CYAN = "\033[1;36m";
    static final String GREEN = "\033[0;92m";

    private String bankName;
    public List<Counter> counters = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public List<Counter> getCounters() {
        return counters;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCounter(Counter counter) {
        if (!counters.contains(counter)) {
            counters.add(counter);
        } else {
            System.out.println("Counter could not be added");
        }
    }

    public void removeCounter(Counter counter) {
        if (counters.contains(counter)) {
            counters.remove(counter);
        } else {
            System.out.println("counter could not be removed");
        }
    }

    public void removeCustomer(Customer customer) {
        if (customers.contains(customer)) {
            customers.remove(customer);
        } else {
            System.out.println("customer could not be removed.");
        }
    }

    public void simulateDays(int daysToSimulate) {
        System.out.println();
        System.out.println(GREEN + "day " + daysToSimulate + " has started!" + RESET);
        for (Customer customer : customers) {
            customer.simulateDay(daysToSimulate);
        }
    }

    @Override
    public String toString() {
        String output = "Bank: " + WHITE + bankName + RESET + "\n";
        for (Counter counter : getCounters()) {
            output += "   " + counter + "\n";
        }
        return output;
    }

    public Counter getNextFreeCounter() {
        for (Counter c : counters) {
            if (c.isAvailable()) return c;
        }
        return null;
    }
}
