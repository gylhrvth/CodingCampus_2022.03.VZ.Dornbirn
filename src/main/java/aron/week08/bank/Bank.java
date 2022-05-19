package aron.week08.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {


    private List<Counter> counters = new ArrayList<>();
private List<Customer> customers = new ArrayList<>();

    public void addCounter(Counter counter, Customer customer){
        this.counters.add(counter);
        this.customers.add(customer);


    }

    @Override
    public String toString() {
        return counters +" " + customers ;
    }

    public List<Counter> counters() {
        return counters;
    }

}

