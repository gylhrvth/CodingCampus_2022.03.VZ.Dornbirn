package gyula.week09.bank;

import java.util.Vector;

public class Bank {
    private String name;
    private Vector<Customer> waitingCustomers = new Vector<>();
    private Vector<Cashier> cashiers = new Vector<>();

    public Bank(String name){
        this.name = name;
    }

    public void addCustomer(Customer c){
        if (!waitingCustomers.contains(c)) {
            waitingCustomers.add(c);
        }
    }

    public void addCashier(Cashier c){
        if (!cashiers.contains(c)){
            cashiers.add(c);
            c.setBank(this);
        }
    }

    public void printStructure() {
        System.out.println(name);
        System.out.println("CASHIERER:");
        for (Cashier c : cashiers){
            c.printStructure();
        }
        System.out.println("Waiting CUSTOMERS:");
        for (Customer c : waitingCustomers){
            c.printStructure();
        }

    }

    public void simulateTick() {
        for(Cashier c: cashiers) {
            c.simulateTick();
        }
    }

    public Customer getNextCustomer() {
        if (waitingCustomers.size() > 0){
            return waitingCustomers.remove(0);
        }
        return null;
    }

    public void sendCustomerBackToWaiting(Customer c){
        waitingCustomers.add(0, c);
    }

    public boolean dayReady() {
        if (waitingCustomers.size() > 0) return false;
        for (Cashier c : cashiers){
            if (!c.isFree()){
                return false;
            }
        }
        return true;
    }
}
