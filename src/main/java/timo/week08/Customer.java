package timo.week08;

import java.util.Random;

public class Customer {

    Random random = new Random();

    private String name;
    private int money;
    private Counter counter;
    private Bank bank;

    public Customer(Bank bank, String name) {
        this.name = name;
        this.bank = bank;

    }


    public void withdraw(int amount) {
        for (Counter counter : this.bank.getListOfCounters()) {
            if (amount <= counter.getCapacity() && !counter.getCoffeeBreak()) {
                counter.setCapacity(counter.getCapacity() - amount);
                System.out.println("\u001B[32m" + name + " withdrawed " + amount + "€ from " + counter + "\u001B[0m");
                if (random.nextInt(100) <= 20) {
                    counter.setCoffeBreak(true);
                    System.out.println("We are currently taking a break!");
                    break;
                }
                break;

            } else {
                System.out.println("\u001B[31m" + "Withdraw not possible" + " (Amount: " + amount + " Capacity: " + counter.getCapacity() + " Coffebreak: " + counter.getCoffeeBreak() + "\u001B[0m");
                counter.setCoffeBreak(true); // refill
            }
        }
    }

    public void deposit(int amount) {
        for (Counter counter : this.bank.getListOfCounters()) {
            if (!counter.getCoffeeBreak()) {
                counter.setCapacity(counter.getCapacity() + amount);
                System.out.println("\u001B[32m" + name + " deposited " + amount + "€ to " + counter + "\u001B[0m");
                if (random.nextInt(100) <= 20) {
                    counter.setCoffeBreak(true);
                    System.out.println("We are currently taking a break!");
                    break;
                }
                break;
            } else {
                System.out.println("\u001B[31m" + "Deposit not possible" + " (Amount: " + amount + " Capacity: " + counter.getCapacity() + " Coffebreak: " + counter.getCoffeeBreak() + "\u001B[0m");

            }
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

    public Bank getBank() {
        return bank;
    }
}
