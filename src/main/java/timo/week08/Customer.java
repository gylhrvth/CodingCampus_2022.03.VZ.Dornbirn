package timo.week08;

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


    public void withdraw(int amount, Counter counter) {
        Transaction tn = new Transaction(this, counter);
        tn.setValue(amount);
        counter.withdrawFromCounter(tn);
        System.out.println(Customer.this.getName() + " withdrawed " + tn.getValue() + "€ from " + counter);
    }

    public void deposit(int amount, Counter counter) {
        Transaction tn = new Transaction(this, counter);
        tn.setValue(amount);
        counter.depositToCounter(tn);
        System.out.println(Customer.this.getName() + " deposited " + tn.getValue() + "€ to " + counter);
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
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
                "random=" + random +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", trans=" + trans +
                ", counter=" + counter +
                '}';
    }
}
