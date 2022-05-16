package sergej.week09;


public class Customer {

    private String name;


    public Customer(String name) {
        this.name = name;
    }

    public void deposit(float amount, Counter counter) {
        if (amount + counter.getCapacity() <= counter.getMaxCapacity() && !counter.isCoffeBreak()) {
            counter.setCapacity(amount + counter.getCapacity());
        } else {
            System.out.println(" deposited " + amount + "€ to " + counter + "Not possible");
        }
    }

    public void withdraw(float amount, Counter counter) {
        if (amount <= counter.getCapacity() && !counter.isCoffeBreak()) {
            counter.setCapacity(counter.getCapacity() - amount);
        } else {
            System.out.println("Withdraw not possible");
            counter.setCoffeBreak(true);
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
