package sergej.week09.Bank;


import java.util.List;
import java.util.Vector;

public class Bank {

    private String name;
    private List<Counter> listOfCounters;
    private List<Customer> listOfCustomer;

    public Bank(String name) {
        this.name = name;
        this.listOfCounters = new Vector<>();
        this.listOfCustomer = new Vector<>();
    }

    public void addCounter(Counter counter) {
        listOfCounters.add(counter);
    }

    public void addCustomer(Customer costumer) {
        listOfCustomer.add(costumer);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", listOfCounters=" + listOfCounters + listOfCustomer +
                '}';
    }

    public List<Counter> getListOfCounters() {
        return listOfCounters;
    }

    public List<Customer> getListOfCustomer() {
        return listOfCustomer;
    }

    public void removeCustomer(Customer customer) {
        listOfCustomer.remove(customer);
    }
}
