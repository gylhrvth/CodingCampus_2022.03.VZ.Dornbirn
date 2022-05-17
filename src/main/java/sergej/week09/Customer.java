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

    public void deposit(float amount) {
        for (Counter c : bank.getListOfCounters()) {
            if (amount + c.getCapacity() <= c.getMaxCapacity() && !c.isCoffeBreak()) {
                c.setCapacity(amount + c.getCapacity());
                System.out.println("deposited " + amount + "€ to " + c);
                bank.removeCustomer(this);
                if (random.nextInt(100) <= 20) {
                    System.out.println("We take a break!");
                    c.setCoffeBreak(true);
                    break;
                }
                break;
            } else {
                System.out.println(" deposited " + amount + "€ to " + c + "Not possible");
            }
        }
    }

    public void withdraw(float amount) {
        for (Counter c : bank.getListOfCounters()) {
            if (amount <= c.getCapacity() && !c.isCoffeBreak()) {
                c.withdraw(amount);
                System.out.println("withdrawn " + amount + "€ from " + c);
                break;
            } else {
                System.out.println("Withdraw not possible");
                c.setCoffeBreak(true); // refill
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
