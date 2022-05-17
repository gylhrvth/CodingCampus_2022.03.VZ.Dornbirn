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
    private List<Customer> waitingCustomers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public List<Counter> getCounters() {
        return counters;
    }

    public List<Customer> getWaitingCustomers() {
        return waitingCustomers;
    }

    public void addCounter(Counter counter) {
        if (!counters.contains(counter)) {
            counters.add(counter);
            counter.setBank(this);
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
        if (waitingCustomers.contains(customer)) {
            waitingCustomers.remove(customer);
        } else {
            System.out.println("customer could not be removed.");
        }
    }

    public void addCustomer(Customer customer) {
        if (!waitingCustomers.contains(customer)) {
            waitingCustomers.add(customer);
        }
    }

    public void simulate() {
        for (Counter counter : counters) {
            counter.simulate();
        }
    }

    public Customer getNextCustomer() {
        if (waitingCustomers.size() > 0) {
            return waitingCustomers.remove(0);
        }
        return null;
    }

    public void letCustomerWait(Customer customer) {
        waitingCustomers.add(0, customer);
    }

    @Override
    public String toString() {
        String output = "Bank: " + WHITE + bankName + RESET + "\n" + waitingCustomers;
        for (Counter counter : getCounters()) {
            output += "   " + counter + "\n";
        }
        return output;
    }
}
