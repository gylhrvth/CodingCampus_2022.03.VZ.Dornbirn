package sergej.week08;

import java.util.Random;

public class Customer {

    Random random = new Random();

    private String name;
    private int money;
    private Transaction trans;
    private Counter counter;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;

    }

    public void deposit(int amount, Counter counter) {

        Transaction tn = new Transaction(this, counter);
        tn.setValue(amount);
        // counter.depositToCounter(tn);
        Counter var = counter.depositToCounter(tn);
        //var.depositToCounter(tn);
        System.out.println(this.getName() + " deposited " + tn.getValue() + "€ to " + counter);
    }

    public void withdraw(int amount, Counter counter) {
        Transaction tn = new Transaction(this, counter);
        tn.setValue(amount);
        Counter var = counter.withdrawFromCounter(tn);
        var.withdrawFromCounter(tn);
        System.out.println(this.getName() + " withdrawed " + tn.getValue() + "€ from " + counter);
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Counter checkCounter(Bank bank) {
        for (Counter c : bank.getListOfCounters()) {
            if (!c.getCoffeeBreak()) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", trans=" + trans +
                ", counter=" + counter +
                '}';
    }
}
