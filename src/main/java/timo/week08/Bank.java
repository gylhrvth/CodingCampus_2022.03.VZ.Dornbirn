package timo.week08;


import java.util.List;
import java.util.Vector;

public class Bank {

    private String name;
    private List<Counter> listOfCounters;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.listOfCounters = new Vector<>();
        this.customers = new Vector<>();
    }

    public void addCounter(Counter counter){
        listOfCounters.add(counter);
    }

    @Override
    public String toString() {
        return name + ", Counters: " + listOfCounters;
    }

    public List<Counter> getListOfCounters() {
        return listOfCounters;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}



