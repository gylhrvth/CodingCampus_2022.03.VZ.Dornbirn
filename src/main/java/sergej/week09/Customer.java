package sergej.week09;


import java.util.Random;

public class Customer {

    private String name;
    private Bank bank;
    private Random random = new Random();


    public Customer(Bank bank, String name) {
        this.name = name;
        this.bank = bank;
    }

    public void deposit(int amount) {
        for (Counter counter : this.bank.getListOfCounters()) {
            if (!counter.getCoffeeBreak()) {
                counter.setCapacity(counter.getCapacity() + amount);
                System.out.println("\u001B[32m" + Customer.this.getName() + " deposited " + amount + "€ to " + counter + "\u001B[0m");
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

    public void withdraw(int amount) {
        for (Counter counter : this.bank.getListOfCounters()) {
            if (amount <= counter.getCapacity() && !counter.getCoffeeBreak()) {
                counter.setCapacity(counter.getCapacity() - amount);
                System.out.println("\u001B[32m" + Customer.this.getName() + " withdrawn " + amount + "€ from " + counter + "\u001B[0m");
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                '}';
    }
}
