package timo.week08;

import java.util.Random;

public class Customer {

    Random random = new Random();

    private String name;
    private int money;
    private Counter counter;
    private Bank bank;

    public Customer(String name) {
        this.name = name;

    }


    public void withdraw(int amount, Counter counter) {
        if (amount <= counter.getCapacity() && !counter.getCoffeeBreak()) {
            counter.setCapacity(counter.getCapacity() - amount);
            System.out.println("\u001B[31m" + Customer.this.getName() + " withdrawed " + amount + "€ from " + counter + "\u001B[0m");
        } else {
            System.out.println("Not possible");
            counter.setCoffeBreak(true);
        }
    }

    public void deposit(int amount, Counter counter) {
        if (amount + counter.getCapacity() <= counter.getMaxCapacity() && !counter.getCoffeeBreak()) {
            counter.setCapacity(counter.getCapacity() + amount);
            System.out.println("\u001B[32m" + Customer.this.getName() + " deposited " + amount + "€ to " + counter + "\u001B[0m");
        } else {
            System.out.println("Not possible");
            counter.setCoffeBreak(true);
        }
    }



    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public Counter checkCounter(Bank bank) {
        for (Counter c : bank.getListOfCounters()) {
            if (!c.getCoffeeBreak() && c.getCapacity() >= 0) {
                return c;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", counter=" + counter +
                '}';
    }
}
